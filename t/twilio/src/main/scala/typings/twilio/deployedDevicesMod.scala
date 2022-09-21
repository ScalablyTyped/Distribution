package typings.twilio

import typings.twilio.fleetMod.FleetContext
import typings.twilio.fleetMod.FleetListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deployedDevicesMod {
  
  @JSImport("twilio/lib/rest/preview/DeployedDevices", JSImport.Namespace)
  @js.native
  open class ^ protected () extends DeployedDevices {
    /**
      * Initialize the DeployedDevices version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait DeployedDevices
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def fleets(sid: String): FleetContext = js.native
    @JSName("fleets")
    val fleets_Original: FleetListInstance = js.native
  }
}
