package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsControllerData extends StObject {
  
  var bus: String
  
  var model: String
  
  var vendor: String
  
  var vram: Double
  
  var vramDynamic: Boolean
}
object GraphicsControllerData {
  
  inline def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any], vramDynamic = vramDynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsControllerData]
  }
  
  extension [Self <: GraphicsControllerData](x: Self) {
    
    inline def setBus(value: String): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVram(value: Double): Self = StObject.set(x, "vram", value.asInstanceOf[js.Any])
    
    inline def setVramDynamic(value: Boolean): Self = StObject.set(x, "vramDynamic", value.asInstanceOf[js.Any])
  }
}
