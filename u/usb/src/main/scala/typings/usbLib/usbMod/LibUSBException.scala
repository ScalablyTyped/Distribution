package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "LibUSBException")
@js.native
class LibUSBException ()
  extends nodeLib.Error {
  var errno: scala.Double = js.native
}

