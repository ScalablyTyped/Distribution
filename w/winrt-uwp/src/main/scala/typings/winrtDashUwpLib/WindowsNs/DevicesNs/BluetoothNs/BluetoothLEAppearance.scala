package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
abstract class BluetoothLEAppearance () extends js.Object {
  /** Gets the appearance category value of the Bluetooth LE device. */
  var category: scala.Double = js.native
  /** Gets the appearance raw value of the Bluetooth LE device. */
  var rawValue: scala.Double = js.native
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  var subCategory: scala.Double = js.native
}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
object BluetoothLEAppearance extends js.Object {
  /**
    * Creates a BluetoothLEAppearance object by supplying values for Category (see BluetoothLEAppearanceCategories ) and Subcategory (see BluetoothLEAppearanceSubcategories ) of the Bluetooth LE device.
    * @param appearanceCategory The Bluetooth LE appearance category. See BluetoothLEAppearanceSubcategories .
    * @param appearanceSubCategory The Bluetooth LE appearance subcategory. See BluetoothLEAppearanceSubcategories .
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromParts(appearanceCategory: scala.Double, appearanceSubCategory: scala.Double): winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothLEAppearance = js.native
  /**
    * Creates a BluetoothLEAppearance object by supplying for raw integer values representing the Category and Subcategory of the Bluetooth LE device.
    * @param rawValue The raw integer value representing the appearance category and subcategory.
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromRawValue(rawValue: scala.Double): winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothLEAppearance = js.native
}

