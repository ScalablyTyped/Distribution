package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object w3cWebUsbStrings {
  
  @scala.inline
  def babble: babble = "babble".asInstanceOf[babble]
  
  @scala.inline
  def bulk: bulk = "bulk".asInstanceOf[bulk]
  
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @scala.inline
  def device: device = "device".asInstanceOf[device]
  
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @scala.inline
  def endpoint: endpoint = "endpoint".asInstanceOf[endpoint]
  
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @scala.inline
  def interface: interface = "interface".asInstanceOf[interface]
  
  @scala.inline
  def interrupt: interrupt = "interrupt".asInstanceOf[interrupt]
  
  @scala.inline
  def isochronous: isochronous = "isochronous".asInstanceOf[isochronous]
  
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  
  @scala.inline
  def stall: stall = "stall".asInstanceOf[stall]
  
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @scala.inline
  def vendor: vendor = "vendor".asInstanceOf[vendor]
  
  @js.native
  sealed trait babble extends USBTransferStatus
  
  @js.native
  sealed trait bulk extends USBEndpointType
  
  @js.native
  sealed trait `class` extends USBRequestType
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait device extends USBRecipient
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait endpoint extends USBRecipient
  
  @js.native
  sealed trait in extends USBDirection
  
  @js.native
  sealed trait interface extends USBRecipient
  
  @js.native
  sealed trait interrupt extends USBEndpointType
  
  @js.native
  sealed trait isochronous extends USBEndpointType
  
  @js.native
  sealed trait ok extends USBTransferStatus
  
  @js.native
  sealed trait other extends USBRecipient
  
  @js.native
  sealed trait out extends USBDirection
  
  @js.native
  sealed trait stall extends USBTransferStatus
  
  @js.native
  sealed trait standard extends USBRequestType
  
  @js.native
  sealed trait vendor extends USBRequestType
}
