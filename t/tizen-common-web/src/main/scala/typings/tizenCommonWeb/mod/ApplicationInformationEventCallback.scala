package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInformationEventCallback extends StObject {
  
  /**
    * Called when an application is installed.
    *
    * @param info The information of the updated application.
    */
  def oninstalled(info: ApplicationInformation): Unit
  
  /**
    * Called when an application is uninstalled.
    *
    * @param id The ID of the uninstalled application.
    */
  def onuninstalled(id: ApplicationId): Unit
  
  /**
    * Called when an application is updated.
    *
    * @param info The information of the updated application.
    */
  def onupdated(info: ApplicationInformation): Unit
}
object ApplicationInformationEventCallback {
  
  inline def apply(
    oninstalled: ApplicationInformation => Unit,
    onuninstalled: ApplicationId => Unit,
    onupdated: ApplicationInformation => Unit
  ): ApplicationInformationEventCallback = {
    val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1(oninstalled), onuninstalled = js.Any.fromFunction1(onuninstalled), onupdated = js.Any.fromFunction1(onupdated))
    __obj.asInstanceOf[ApplicationInformationEventCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationInformationEventCallback] (val x: Self) extends AnyVal {
    
    inline def setOninstalled(value: ApplicationInformation => Unit): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1(value))
    
    inline def setOnuninstalled(value: ApplicationId => Unit): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1(value))
    
    inline def setOnupdated(value: ApplicationInformation => Unit): Self = StObject.set(x, "onupdated", js.Any.fromFunction1(value))
  }
}
