package typings.twilio

import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetContext
import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesMod {
  
  @JSImport("twilio/lib/rest/preview/DeployedDevices", JSImport.Namespace)
  @js.native
  open class ^ protected () extends DeployedDevices {
    /**
      * Initialize the DeployedDevices version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait DeployedDevices
    extends typings.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def fleets(sid: String): FleetContext = js.native
    @JSName("fleets")
    val fleets_Original: FleetListInstance = js.native
  }
}
