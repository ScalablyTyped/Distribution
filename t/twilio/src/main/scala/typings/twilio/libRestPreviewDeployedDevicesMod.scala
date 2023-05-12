package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewDeployedDevicesMod {
  
  @JSImport("twilio/lib/rest/preview/DeployedDevices", JSImport.Default)
  @js.native
  open class default protected () extends DeployedDevices {
    /**
      * Initialize the DeployedDevices version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait DeployedDevices
    extends typings.twilio.libBaseVersionMod.default {
    
    /** fleets - { Twilio.Preview.DeployedDevices.FleetListInstance } resource */
    /* protected */ var _fleets: js.UndefOr[FleetListInstance] = js.native
    
    /** Getter for fleets resource */
    def fleets: FleetListInstance = js.native
  }
}
