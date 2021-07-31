package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
trait UsbInterface extends StObject {
  
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk IN endpoints defined in the current setting of the USB interface setting. */
  var bulkInPipes: IVectorView[UsbBulkInPipe]
  
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk OUT endpoints defined in the current setting of the USB interface. */
  var bulkOutPipes: IVectorView[UsbBulkOutPipe]
  
  /** Gets an array of objects that represent descriptors for all alternate settings that are part of this USB interface. */
  var descriptors: IVectorView[UsbDescriptor]
  
  /** Gets the interface number that identifies the USB interface. This value is the bInterfaceNumber field of a standard USB interface descriptor. */
  var interfaceNumber: Double
  
  /** Gets an array of objects that represent alternate settings defined for the USB interface. */
  var interfaceSettings: IVectorView[UsbInterfaceSetting]
  
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt IN endpoints defined in the current setting of the USB interface. */
  var interruptInPipes: IVectorView[UsbInterruptInPipe]
  
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt OUT endpoints defined in the current setting of the USB interface. */
  var interruptOutPipes: IVectorView[UsbInterruptOutPipe]
}
object UsbInterface {
  
  @scala.inline
  def apply(
    bulkInPipes: IVectorView[UsbBulkInPipe],
    bulkOutPipes: IVectorView[UsbBulkOutPipe],
    descriptors: IVectorView[UsbDescriptor],
    interfaceNumber: Double,
    interfaceSettings: IVectorView[UsbInterfaceSetting],
    interruptInPipes: IVectorView[UsbInterruptInPipe],
    interruptOutPipes: IVectorView[UsbInterruptOutPipe]
  ): UsbInterface = {
    val __obj = js.Dynamic.literal(bulkInPipes = bulkInPipes.asInstanceOf[js.Any], bulkOutPipes = bulkOutPipes.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], interfaceSettings = interfaceSettings.asInstanceOf[js.Any], interruptInPipes = interruptInPipes.asInstanceOf[js.Any], interruptOutPipes = interruptOutPipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterface]
  }
  
  @scala.inline
  implicit class UsbInterfaceMutableBuilder[Self <: UsbInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkInPipes(value: IVectorView[UsbBulkInPipe]): Self = StObject.set(x, "bulkInPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkOutPipes(value: IVectorView[UsbBulkOutPipe]): Self = StObject.set(x, "bulkOutPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptors(value: IVectorView[UsbDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceNumber(value: Double): Self = StObject.set(x, "interfaceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceSettings(value: IVectorView[UsbInterfaceSetting]): Self = StObject.set(x, "interfaceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptInPipes(value: IVectorView[UsbInterruptInPipe]): Self = StObject.set(x, "interruptInPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptOutPipes(value: IVectorView[UsbInterruptOutPipe]): Self = StObject.set(x, "interruptOutPipes", value.asInstanceOf[js.Any])
  }
}
