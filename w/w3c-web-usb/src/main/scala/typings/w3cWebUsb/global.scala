package typings.w3cWebUsb

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("USB")
  @js.native
  class USB ()
    extends typings.w3cWebUsb.USB
  
  @JSGlobal("USBAlternateInterface")
  @js.native
  class USBAlternateInterface protected ()
    extends typings.w3cWebUsb.USBAlternateInterface {
    def this(deviceInterface: typings.w3cWebUsb.USBInterface, alternateSetting: Double) = this()
  }
  
  @JSGlobal("USBConfiguration")
  @js.native
  class USBConfiguration ()
    extends typings.w3cWebUsb.USBConfiguration
  
  @JSGlobal("USBConnectionEvent")
  @js.native
  class USBConnectionEvent protected ()
    extends typings.w3cWebUsb.USBConnectionEvent {
    def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  }
  
  @JSGlobal("USBDevice")
  @js.native
  class USBDevice ()
    extends typings.w3cWebUsb.USBDevice
  
  @JSGlobal("USBInTransferResult")
  @js.native
  class USBInTransferResult protected ()
    extends typings.w3cWebUsb.USBInTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: DataView) = this()
  }
  
  @JSGlobal("USBInterface")
  @js.native
  class USBInterface protected ()
    extends typings.w3cWebUsb.USBInterface {
    def this(configuration: typings.w3cWebUsb.USBConfiguration, interfaceNumber: Double) = this()
  }
  
  @JSGlobal("USBIsochronousInTransferPacket")
  @js.native
  class USBIsochronousInTransferPacket protected ()
    extends typings.w3cWebUsb.USBIsochronousInTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: DataView) = this()
  }
  
  @JSGlobal("USBIsochronousInTransferResult")
  @js.native
  class USBIsochronousInTransferResult protected ()
    extends typings.w3cWebUsb.USBIsochronousInTransferResult {
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousInTransferPacket]) = this()
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousInTransferPacket], data: DataView) = this()
  }
  
  @JSGlobal("USBIsochronousOutTransferPacket")
  @js.native
  class USBIsochronousOutTransferPacket protected ()
    extends typings.w3cWebUsb.USBIsochronousOutTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWritten: Double) = this()
  }
  
  @JSGlobal("USBIsochronousOutTransferResult")
  @js.native
  class USBIsochronousOutTransferResult protected ()
    extends typings.w3cWebUsb.USBIsochronousOutTransferResult {
    def this(packets: js.Array[typings.w3cWebUsb.USBIsochronousOutTransferPacket]) = this()
  }
  
  @JSGlobal("USBOutTransferResult")
  @js.native
  class USBOutTransferResult protected ()
    extends typings.w3cWebUsb.USBOutTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWriten: Double) = this()
  }
}
