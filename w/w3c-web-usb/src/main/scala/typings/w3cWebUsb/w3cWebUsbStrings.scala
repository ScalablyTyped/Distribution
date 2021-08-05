package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object w3cWebUsbStrings {
  
  @js.native
  sealed trait babble
    extends StObject
       with USBTransferStatus
  inline def babble: babble = "babble".asInstanceOf[babble]
  
  @js.native
  sealed trait bulk
    extends StObject
       with USBEndpointType
  inline def bulk: bulk = "bulk".asInstanceOf[bulk]
  
  @js.native
  sealed trait `class`
    extends StObject
       with USBRequestType
  inline def `class`: `class` = "class".asInstanceOf[`class`]
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait device
    extends StObject
       with USBRecipient
  inline def device: device = "device".asInstanceOf[device]
  
  @js.native
  sealed trait disconnect extends StObject
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait endpoint
    extends StObject
       with USBRecipient
  inline def endpoint: endpoint = "endpoint".asInstanceOf[endpoint]
  
  @js.native
  sealed trait in
    extends StObject
       with USBDirection
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait interface
    extends StObject
       with USBRecipient
  inline def interface: interface = "interface".asInstanceOf[interface]
  
  @js.native
  sealed trait interrupt
    extends StObject
       with USBEndpointType
  inline def interrupt: interrupt = "interrupt".asInstanceOf[interrupt]
  
  @js.native
  sealed trait isochronous
    extends StObject
       with USBEndpointType
  inline def isochronous: isochronous = "isochronous".asInstanceOf[isochronous]
  
  @js.native
  sealed trait ok
    extends StObject
       with USBTransferStatus
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait other
    extends StObject
       with USBRecipient
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait out
    extends StObject
       with USBDirection
  inline def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait stall
    extends StObject
       with USBTransferStatus
  inline def stall: stall = "stall".asInstanceOf[stall]
  
  @js.native
  sealed trait standard
    extends StObject
       with USBRequestType
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait vendor
    extends StObject
       with USBRequestType
  inline def vendor: vendor = "vendor".asInstanceOf[vendor]
}
