package typings.xrm.Xrm.Events

import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.FormContext
import typings.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTagClickEventContext
  extends StObject
     with EventContext {
  
  /**
    * Gets an object that contains details about the lookup tag clicked
    */
  def getEventArgs(): LookupTagClickEventArguments
}
object LookupTagClickEventContext {
  
  inline def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => LookupTagClickEventArguments,
    getEventSource: () => typings.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Unit
  ): LookupTagClickEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
    __obj.asInstanceOf[LookupTagClickEventContext]
  }
  
  extension [Self <: LookupTagClickEventContext](x: Self) {
    
    inline def setGetEventArgs(value: () => LookupTagClickEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
  }
}
