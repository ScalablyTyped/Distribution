package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("USB")
  @js.native
  open class USB ()
    extends StObject
       with typings.w3cWebUsb.USB
  
  @JSGlobal("USBAlternateInterface")
  @js.native
  open class USBAlternateInterface protected ()
    extends StObject
       with typings.w3cWebUsb.USBAlternateInterface {
    def this(deviceInterface: typings.w3cWebUsb.USBInterface, alternateSetting: Double) = this()
    
    /* CompleteClass */
    override val alternateSetting: Double = js.native
    
    /* CompleteClass */
    override val endpoints: js.Array[USBEndpoint] = js.native
    
    /* CompleteClass */
    override val interfaceClass: Double = js.native
    
    /* CompleteClass */
    override val interfaceProtocol: Double = js.native
    
    /* CompleteClass */
    override val interfaceSubclass: Double = js.native
  }
  
  @JSGlobal("USBConfiguration")
  @js.native
  open class USBConfiguration ()
    extends StObject
       with typings.w3cWebUsb.USBConfiguration {
    
    /* CompleteClass */
    override val configurationValue: Double = js.native
    
    /* CompleteClass */
    override val interfaces: js.Array[typings.w3cWebUsb.USBInterface] = js.native
  }
  
  @JSGlobal("USBConnectionEvent")
  @js.native
  open class USBConnectionEvent protected ()
    extends StObject
       with typings.w3cWebUsb.USBConnectionEvent {
    def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  }
  
  @JSGlobal("USBDevice")
  @js.native
  open class USBDevice ()
    extends StObject
       with typings.w3cWebUsb.USBDevice
  
  @JSGlobal("USBInTransferResult")
  @js.native
  open class USBInTransferResult protected ()
    extends StObject
       with typings.w3cWebUsb.USBInTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @JSGlobal("USBInterface")
  @js.native
  open class USBInterface protected ()
    extends StObject
       with typings.w3cWebUsb.USBInterface {
    def this(configuration: typings.w3cWebUsb.USBConfiguration, interfaceNumber: Double) = this()
    
    /* CompleteClass */
    override val alternate: typings.w3cWebUsb.USBAlternateInterface = js.native
    
    /* CompleteClass */
    override val alternates: js.Array[typings.w3cWebUsb.USBAlternateInterface] = js.native
    
    /* CompleteClass */
    override val claimed: Boolean = js.native
    
    /* CompleteClass */
    override val interfaceNumber: Double = js.native
  }
  
  @JSGlobal("USBIsochronousInTransferPacket")
  @js.native
  open class USBIsochronousInTransferPacket protected ()
    extends StObject
       with typings.w3cWebUsb.USBIsochronousInTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @JSGlobal("USBIsochronousInTransferResult")
  @js.native
  open class USBIsochronousInTransferResult protected ()
    extends StObject
       with typings.w3cWebUsb.USBIsochronousInTransferResult {
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousInTransferPacket]) = this()
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousInTransferPacket], data: js.typedarray.DataView) = this()
    
    /* CompleteClass */
    override val packets: js.Array[typings.w3cWebUsb.USBIsochronousInTransferPacket] = js.native
  }
  
  @JSGlobal("USBIsochronousOutTransferPacket")
  @js.native
  open class USBIsochronousOutTransferPacket protected ()
    extends StObject
       with typings.w3cWebUsb.USBIsochronousOutTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWritten: Double) = this()
    
    /* CompleteClass */
    override val bytesWritten: Double = js.native
    
    /* CompleteClass */
    override val status: USBTransferStatus = js.native
  }
  
  @JSGlobal("USBIsochronousOutTransferResult")
  @js.native
  open class USBIsochronousOutTransferResult protected ()
    extends StObject
       with typings.w3cWebUsb.USBIsochronousOutTransferResult {
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousOutTransferPacket]) = this()
    
    /* CompleteClass */
    override val packets: js.Array[typings.w3cWebUsb.USBIsochronousOutTransferPacket] = js.native
  }
  
  @JSGlobal("USBOutTransferResult")
  @js.native
  open class USBOutTransferResult protected ()
    extends StObject
       with typings.w3cWebUsb.USBOutTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWriten: Double) = this()
    
    /* CompleteClass */
    override val bytesWritten: Double = js.native
    
    /* CompleteClass */
    override val status: USBTransferStatus = js.native
  }
}
