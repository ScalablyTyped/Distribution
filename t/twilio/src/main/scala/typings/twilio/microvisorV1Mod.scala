package typings.twilio

import typings.twilio.appMod.AppContext
import typings.twilio.appMod.AppListInstance
import typings.twilio.deviceMod.DeviceContext
import typings.twilio.deviceMod.DeviceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microvisorV1Mod {
  
  @JSImport("twilio/lib/rest/microvisor/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Microvisor
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.microvisorMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def apps(sid: String): AppContext = js.native
    @JSName("apps")
    val apps_Original: AppListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def devices(sid: String): DeviceContext = js.native
    @JSName("devices")
    val devices_Original: DeviceListInstance = js.native
  }
}
