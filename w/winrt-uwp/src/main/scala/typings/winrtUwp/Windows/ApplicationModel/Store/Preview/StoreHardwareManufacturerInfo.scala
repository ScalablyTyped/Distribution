package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the manufacturer for the current device. */
@js.native
trait StoreHardwareManufacturerInfo extends js.Object {
  
  /** Gets the hardware manufacture ID for the current device. */
  var hardwareManufacturerId: String = js.native
  
  /** Gets the name of the hardware manufacturer for the current device. */
  var manufacturerName: String = js.native
  
  /** Gets the model name for the current device. */
  var modelName: String = js.native
  
  /** Gets the ID of the Windows Store content modifier. */
  var storeContentModifierId: String = js.native
}
object StoreHardwareManufacturerInfo {
  
  @scala.inline
  def apply(
    hardwareManufacturerId: String,
    manufacturerName: String,
    modelName: String,
    storeContentModifierId: String
  ): StoreHardwareManufacturerInfo = {
    val __obj = js.Dynamic.literal(hardwareManufacturerId = hardwareManufacturerId.asInstanceOf[js.Any], manufacturerName = manufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], storeContentModifierId = storeContentModifierId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreHardwareManufacturerInfo]
  }
  
  @scala.inline
  implicit class StoreHardwareManufacturerInfoOps[Self <: StoreHardwareManufacturerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHardwareManufacturerId(value: String): Self = this.set("hardwareManufacturerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerName(value: String): Self = this.set("manufacturerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreContentModifierId(value: String): Self = this.set("storeContentModifierId", value.asInstanceOf[js.Any])
  }
}
