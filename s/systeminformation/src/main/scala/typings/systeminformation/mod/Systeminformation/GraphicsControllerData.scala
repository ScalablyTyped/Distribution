package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsControllerData extends StObject {
  
  var bus: String = js.native
  
  var model: String = js.native
  
  var vendor: String = js.native
  
  var vram: Double = js.native
  
  var vramDynamic: Boolean = js.native
}
object GraphicsControllerData {
  
  @scala.inline
  def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any], vramDynamic = vramDynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsControllerData]
  }
  
  @scala.inline
  implicit class GraphicsControllerDataMutableBuilder[Self <: GraphicsControllerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBus(value: String): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVram(value: Double): Self = StObject.set(x, "vram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVramDynamic(value: Boolean): Self = StObject.set(x, "vramDynamic", value.asInstanceOf[js.Any])
  }
}
