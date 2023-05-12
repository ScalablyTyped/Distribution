package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for methods to create and manage records in the mobile clients (for phones tablets).
  */
trait Mobile extends StObject {
  
  /**
    * Provides methods to create and manage records in the mobile clients while working in the offline mode.
    * @see {@link https://learn.microsoft.com/en-us/previous-versions/dynamicscrm-2016/developers-guide/mt787123(v=crm.8) External Link: Xrm.Mobile.offline (client-side reference)}
    * @deprecated Use {@link Xrm.WebApi.offline} instead.  Xrm.WebApi.offline is implemented differently than Xrm.Mobile.offline
    * @see {@link https://learn.microsoft.com/en-us/power-platform/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var offline: MobileOffline
}
object Mobile {
  
  inline def apply(offline: MobileOffline): Mobile = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mobile] (val x: Self) extends AnyVal {
    
    inline def setOffline(value: MobileOffline): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
  }
}
