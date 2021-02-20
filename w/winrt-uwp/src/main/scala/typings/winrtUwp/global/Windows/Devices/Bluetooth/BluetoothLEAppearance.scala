package typings.winrtUwp.global.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
abstract class BluetoothLEAppearance ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance
object BluetoothLEAppearance {
  
  /**
    * Creates a BluetoothLEAppearance object by supplying values for Category (see BluetoothLEAppearanceCategories ) and Subcategory (see BluetoothLEAppearanceSubcategories ) of the Bluetooth LE device.
    * @param appearanceCategory The Bluetooth LE appearance category. See BluetoothLEAppearanceSubcategories .
    * @param appearanceSubCategory The Bluetooth LE appearance subcategory. See BluetoothLEAppearanceSubcategories .
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance.fromParts")
  @js.native
  def fromParts(appearanceCategory: Double, appearanceSubCategory: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
  
  /**
    * Creates a BluetoothLEAppearance object by supplying for raw integer values representing the Category and Subcategory of the Bluetooth LE device.
    * @param rawValue The raw integer value representing the appearance category and subcategory.
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance.fromRawValue")
  @js.native
  def fromRawValue(rawValue: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
}
