package typings.winrtUwp.Windows.Devices.Bluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@js.native
trait BluetoothLEAppearance extends StObject {
  
  /** Gets the appearance category value of the Bluetooth LE device. */
  var category: Double = js.native
  
  /** Gets the appearance raw value of the Bluetooth LE device. */
  var rawValue: Double = js.native
  
  /** Gets the appearance subcategory value of the Bluetooth LE device. */
  var subCategory: Double = js.native
}
object BluetoothLEAppearance {
  
  @scala.inline
  def apply(category: Double, rawValue: Double, subCategory: Double): BluetoothLEAppearance = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], subCategory = subCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAppearance]
  }
  
  @scala.inline
  implicit class BluetoothLEAppearanceMutableBuilder[Self <: BluetoothLEAppearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCategory(value: Double): Self = StObject.set(x, "subCategory", value.asInstanceOf[js.Any])
  }
}
