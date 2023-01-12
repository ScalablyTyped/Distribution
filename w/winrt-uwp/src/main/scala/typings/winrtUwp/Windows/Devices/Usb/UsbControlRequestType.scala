package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
trait UsbControlRequestType extends StObject {
  
  /** Gets or sets the bmRequestType value as a byte. */
  var asByte: Double
  
  /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
  var controlTransferType: UsbControlTransferType
  
  /** Gets or sets the direction of the USB control transfer. */
  var direction: UsbTransferDirection
  
  /** Gets or sets the recipient of the USB control transfer. */
  var recipient: UsbControlRecipient
}
object UsbControlRequestType {
  
  inline def apply(
    asByte: Double,
    controlTransferType: UsbControlTransferType,
    direction: UsbTransferDirection,
    recipient: UsbControlRecipient
  ): UsbControlRequestType = {
    val __obj = js.Dynamic.literal(asByte = asByte.asInstanceOf[js.Any], controlTransferType = controlTransferType.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbControlRequestType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsbControlRequestType] (val x: Self) extends AnyVal {
    
    inline def setAsByte(value: Double): Self = StObject.set(x, "asByte", value.asInstanceOf[js.Any])
    
    inline def setControlTransferType(value: UsbControlTransferType): Self = StObject.set(x, "controlTransferType", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: UsbTransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: UsbControlRecipient): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
  }
}
