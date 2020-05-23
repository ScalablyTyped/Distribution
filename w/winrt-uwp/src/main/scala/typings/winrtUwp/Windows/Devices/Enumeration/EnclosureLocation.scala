package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the physical location of a device in its enclosure. */
trait EnclosureLocation extends js.Object {
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  var inDock: Boolean
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  var inLid: Boolean
  /** Indicates which panel of the computer the device is physically located on. */
  var panel: Panel
}

object EnclosureLocation {
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): EnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosureLocation]
  }
}

