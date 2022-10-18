package typings.winrtUwp.global.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
open class BluetoothLEAppearance ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance {
  
  /** Gets the appearance category value of the Bluetooth LE device. */
  /* CompleteClass */
  var category: Double = js.native
  
  /** Gets the appearance raw value of the Bluetooth LE device. */
  /* CompleteClass */
  var rawValue: Double = js.native
  
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  /* CompleteClass */
  var subCategory: Double = js.native
}
object BluetoothLEAppearance {
  
  @JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BluetoothLEAppearance object by supplying values for Category (see BluetoothLEAppearanceCategories ) and Subcategory (see BluetoothLEAppearanceSubcategories ) of the Bluetooth LE device.
    * @param appearanceCategory The Bluetooth LE appearance category. See BluetoothLEAppearanceSubcategories .
    * @param appearanceSubCategory The Bluetooth LE appearance subcategory. See BluetoothLEAppearanceSubcategories .
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  /* static member */
  inline def fromParts(appearanceCategory: Double, appearanceSubCategory: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParts")(appearanceCategory.asInstanceOf[js.Any], appearanceSubCategory.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance]
  
  /**
    * Creates a BluetoothLEAppearance object by supplying for raw integer values representing the Category and Subcategory of the Bluetooth LE device.
    * @param rawValue The raw integer value representing the appearance category and subcategory.
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  /* static member */
  inline def fromRawValue(rawValue: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawValue")(rawValue.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance]
}
