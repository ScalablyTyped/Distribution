package typings.winrtUwp.global.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
abstract class BluetoothLEAppearance ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance {
  /** Gets the appearance category value of the Bluetooth LE device. */
  /* CompleteClass */
  override var category: Double = js.native
  /** Gets the appearance raw value of the Bluetooth LE device. */
  /* CompleteClass */
  override var rawValue: Double = js.native
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  /* CompleteClass */
  override var subCategory: Double = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
object BluetoothLEAppearance extends js.Object {
  /**
    * Creates a BluetoothLEAppearance object by supplying values for Category (see BluetoothLEAppearanceCategories ) and Subcategory (see BluetoothLEAppearanceSubcategories ) of the Bluetooth LE device.
    * @param appearanceCategory The Bluetooth LE appearance category. See BluetoothLEAppearanceSubcategories .
    * @param appearanceSubCategory The Bluetooth LE appearance subcategory. See BluetoothLEAppearanceSubcategories .
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromParts(appearanceCategory: Double, appearanceSubCategory: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
  /**
    * Creates a BluetoothLEAppearance object by supplying for raw integer values representing the Category and Subcategory of the Bluetooth LE device.
    * @param rawValue The raw integer value representing the appearance category and subcategory.
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromRawValue(rawValue: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
}

