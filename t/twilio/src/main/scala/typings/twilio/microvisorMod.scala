package typings.twilio

import typings.twilio.appMod.AppContext
import typings.twilio.appMod.AppListInstance
import typings.twilio.deviceMod.DeviceContext
import typings.twilio.deviceMod.DeviceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microvisorMod {
  
  @JSImport("twilio/lib/rest/Microvisor", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Microvisor {
    /**
      * Initialize microvisor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Microvisor
    extends typings.twilio.domainMod.^ {
    
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
    
    val v1: typings.twilio.microvisorV1Mod.^ = js.native
  }
}
