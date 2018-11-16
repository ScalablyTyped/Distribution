package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object w3cDashWebDashUsbLib {
  type USBDirection = w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.in | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.out
  type USBEndpointType = w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.bulk | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.interrupt | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.isochronous
  type USBRecipient = w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.device | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.interface | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.endpoint | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.other
  type USBRequestType = w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.standard | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.`class` | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.vendor
  type USBTransferStatus = w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.ok | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.stall | w3cDashWebDashUsbLib.w3cDashWebDashUsbLibStrings.babble
}
