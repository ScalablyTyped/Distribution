package typings.xrm.Xrm.Events

import typings.xrm.XrmEnum.FormDataLoadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return value of {@link LoadEventContext.getEventArgs()}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/executioncontext/geteventargs#return-value External Link: getEventArgs (Client API reference)}
  */
trait LoadEventArguments extends StObject {
  
  def getDataLoadState(): FormDataLoadState
}
object LoadEventArguments {
  
  inline def apply(getDataLoadState: () => FormDataLoadState): LoadEventArguments = {
    val __obj = js.Dynamic.literal(getDataLoadState = js.Any.fromFunction0(getDataLoadState))
    __obj.asInstanceOf[LoadEventArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadEventArguments] (val x: Self) extends AnyVal {
    
    inline def setGetDataLoadState(value: () => FormDataLoadState): Self = StObject.set(x, "getDataLoadState", js.Any.fromFunction0(value))
  }
}
