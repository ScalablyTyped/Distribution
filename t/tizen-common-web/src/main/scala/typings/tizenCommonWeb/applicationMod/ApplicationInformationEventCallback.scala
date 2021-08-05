package typings.tizenCommonWeb.applicationMod

import typings.tizenCommonWeb.packageMod.PackageId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInformationEventCallback extends StObject {
  
  /**
    * Called when an application is installed.
    *
    * @param info The information of the installed application.
    */
  var oninstalled: js.UndefOr[js.Function1[/* info */ ApplicationInformation, Unit]] = js.undefined
  
  /**
    * Called when an application is uninstalled.
    *
    * @param id The ID of the uninstalled application.
    */
  var onuninstalled: js.UndefOr[js.Function1[/* id */ PackageId, Unit]] = js.undefined
  
  /**
    * Called when an application is updated.
    *
    * @param info The information of the updated application.
    */
  var onupdated: js.UndefOr[js.Function1[/* info */ ApplicationInformation, Unit]] = js.undefined
}
object ApplicationInformationEventCallback {
  
  inline def apply(): ApplicationInformationEventCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInformationEventCallback]
  }
  
  extension [Self <: ApplicationInformationEventCallback](x: Self) {
    
    inline def setOninstalled(value: /* info */ ApplicationInformation => Unit): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1(value))
    
    inline def setOninstalledUndefined: Self = StObject.set(x, "oninstalled", js.undefined)
    
    inline def setOnuninstalled(value: /* id */ PackageId => Unit): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1(value))
    
    inline def setOnuninstalledUndefined: Self = StObject.set(x, "onuninstalled", js.undefined)
    
    inline def setOnupdated(value: /* info */ ApplicationInformation => Unit): Self = StObject.set(x, "onupdated", js.Any.fromFunction1(value))
    
    inline def setOnupdatedUndefined: Self = StObject.set(x, "onupdated", js.undefined)
  }
}
