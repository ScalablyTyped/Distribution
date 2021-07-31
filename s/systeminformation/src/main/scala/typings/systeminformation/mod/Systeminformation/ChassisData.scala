package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChassisData extends StObject {
  
  var assetTag: String
  
  var manufacturer: String
  
  var model: String
  
  var serial: String
  
  var sku: String
  
  var `type`: String
  
  var version: String
}
object ChassisData {
  
  @scala.inline
  def apply(
    assetTag: String,
    manufacturer: String,
    model: String,
    serial: String,
    sku: String,
    `type`: String,
    version: String
  ): ChassisData = {
    val __obj = js.Dynamic.literal(assetTag = assetTag.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChassisData]
  }
  
  @scala.inline
  implicit class ChassisDataMutableBuilder[Self <: ChassisData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTag(value: String): Self = StObject.set(x, "assetTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
