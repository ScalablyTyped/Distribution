package typings.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
trait BluetoothLEAppearance extends js.Object {
  /** Gets the appearance category value of the Bluetooth LE device. */
  var category: Double
  /** Gets the appearance raw value of the Bluetooth LE device. */
  var rawValue: Double
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  var subCategory: Double
}

object BluetoothLEAppearance {
  @scala.inline
  def apply(category: Double, rawValue: Double, subCategory: Double): BluetoothLEAppearance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], subCategory = subCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAppearance]
  }
}

