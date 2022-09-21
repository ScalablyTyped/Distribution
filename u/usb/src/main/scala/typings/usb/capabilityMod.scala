package typings.usb

import typings.node.bufferMod.global.Buffer
import typings.usb.bindingsMod.Device
import typings.usb.descriptorsMod.CapabilityDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capabilityMod {
  
  @JSImport("usb/dist/usb/capability", "Capability")
  @js.native
  open class Capability protected () extends StObject {
    def this(device: Device, id: Double) = this()
    
    /** Buffer capability data. */
    var data: Buffer = js.native
    
    /** Object with fields from the capability descriptor -- see libusb documentation or USB spec. */
    var descriptor: CapabilityDescriptor = js.native
    
    /* protected */ var device: Device = js.native
    
    /* protected */ var id: Double = js.native
    
    /** Integer capability type. */
    var `type`: Double = js.native
  }
}
