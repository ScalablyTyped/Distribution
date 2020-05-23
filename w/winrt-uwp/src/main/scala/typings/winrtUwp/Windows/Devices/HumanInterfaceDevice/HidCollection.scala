package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves the collection information for a group of related controls. */
trait HidCollection extends js.Object {
  /** Retrieves the identifier for a collection of HID controls. */
  var id: Double
  /** Retrieves the collection type. */
  var `type`: HidCollectionType
  /** Retrieves the usage identifier for the given control collection. */
  var usageId: Double
  /** Retrieves the usage page for the given control collection. */
  var usagePage: Double
}

object HidCollection {
  @scala.inline
  def apply(id: Double, `type`: HidCollectionType, usageId: Double, usagePage: Double): HidCollection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidCollection]
  }
}

