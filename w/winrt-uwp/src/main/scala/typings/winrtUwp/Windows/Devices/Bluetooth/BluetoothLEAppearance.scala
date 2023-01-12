package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
trait BluetoothLEAppearance extends StObject {
  
  /** Gets the appearance category value of the Bluetooth LE device. */
  var category: Double
  
  /** Gets the appearance raw value of the Bluetooth LE device. */
  var rawValue: Double
  
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  var subCategory: Double
}
object BluetoothLEAppearance {
  
  inline def apply(category: Double, rawValue: Double, subCategory: Double): BluetoothLEAppearance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], subCategory = subCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAppearance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothLEAppearance] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setSubCategory(value: Double): Self = StObject.set(x, "subCategory", value.asInstanceOf[js.Any])
  }
}
