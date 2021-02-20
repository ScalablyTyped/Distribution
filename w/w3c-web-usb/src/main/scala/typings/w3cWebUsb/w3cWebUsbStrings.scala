package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object w3cWebUsbStrings {
  
  @js.native
  sealed trait babble extends USBTransferStatus
  @scala.inline
  def babble: babble = "babble".asInstanceOf[babble]
  
  @js.native
  sealed trait bulk extends USBEndpointType
  @scala.inline
  def bulk: bulk = "bulk".asInstanceOf[bulk]
  
  @js.native
  sealed trait `class` extends USBRequestType
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
  
  @js.native
  sealed trait connect extends StObject
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait device extends USBRecipient
  @scala.inline
  def device: device = "device".asInstanceOf[device]
  
  @js.native
  sealed trait disconnect extends StObject
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait endpoint extends USBRecipient
  @scala.inline
  def endpoint: endpoint = "endpoint".asInstanceOf[endpoint]
  
  @js.native
  sealed trait in extends USBDirection
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait interface extends USBRecipient
  @scala.inline
  def interface: interface = "interface".asInstanceOf[interface]
  
  @js.native
  sealed trait interrupt extends USBEndpointType
  @scala.inline
  def interrupt: interrupt = "interrupt".asInstanceOf[interrupt]
  
  @js.native
  sealed trait isochronous extends USBEndpointType
  @scala.inline
  def isochronous: isochronous = "isochronous".asInstanceOf[isochronous]
  
  @js.native
  sealed trait ok extends USBTransferStatus
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait other extends USBRecipient
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait out extends USBDirection
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  
  @js.native
  sealed trait stall extends USBTransferStatus
  @scala.inline
  def stall: stall = "stall".asInstanceOf[stall]
  
  @js.native
  sealed trait standard extends USBRequestType
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait vendor extends USBRequestType
  @scala.inline
  def vendor: vendor = "vendor".asInstanceOf[vendor]
}
