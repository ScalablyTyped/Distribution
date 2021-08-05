package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlaySubtitleAttribute extends StObject {
  
  var attr_type: String
  
  var start_pos: Double
  
  var stop_pos: Double
}
object AVPlaySubtitleAttribute {
  
  inline def apply(attr_type: String, start_pos: Double, stop_pos: Double): AVPlaySubtitleAttribute = {
    val __obj = js.Dynamic.literal(attr_type = attr_type.asInstanceOf[js.Any], start_pos = start_pos.asInstanceOf[js.Any], stop_pos = stop_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVPlaySubtitleAttribute]
  }
  
  extension [Self <: AVPlaySubtitleAttribute](x: Self) {
    
    inline def setAttr_type(value: String): Self = StObject.set(x, "attr_type", value.asInstanceOf[js.Any])
    
    inline def setStart_pos(value: Double): Self = StObject.set(x, "start_pos", value.asInstanceOf[js.Any])
    
    inline def setStop_pos(value: Double): Self = StObject.set(x, "stop_pos", value.asInstanceOf[js.Any])
  }
}
