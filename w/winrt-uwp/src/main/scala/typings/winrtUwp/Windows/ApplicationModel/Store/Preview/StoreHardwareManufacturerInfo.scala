package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the manufacturer for the current device. */
trait StoreHardwareManufacturerInfo extends StObject {
  
  /** Gets the hardware manufacture ID for the current device. */
  var hardwareManufacturerId: String
  
  /** Gets the name of the hardware manufacturer for the current device. */
  var manufacturerName: String
  
  /** Gets the model name for the current device. */
  var modelName: String
  
  /** Gets the ID of the Windows Store content modifier. */
  var storeContentModifierId: String
}
object StoreHardwareManufacturerInfo {
  
  inline def apply(
    hardwareManufacturerId: String,
    manufacturerName: String,
    modelName: String,
    storeContentModifierId: String
  ): StoreHardwareManufacturerInfo = {
    val __obj = js.Dynamic.literal(hardwareManufacturerId = hardwareManufacturerId.asInstanceOf[js.Any], manufacturerName = manufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], storeContentModifierId = storeContentModifierId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreHardwareManufacturerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreHardwareManufacturerInfo] (val x: Self) extends AnyVal {
    
    inline def setHardwareManufacturerId(value: String): Self = StObject.set(x, "hardwareManufacturerId", value.asInstanceOf[js.Any])
    
    inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setStoreContentModifierId(value: String): Self = StObject.set(x, "storeContentModifierId", value.asInstanceOf[js.Any])
  }
}
