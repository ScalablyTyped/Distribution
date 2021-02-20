package typings.tizenTvWebapis.avplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlaySubtitleAttribute extends StObject {
  
  var attr_type: String = js.native
  
  var start_pos: Double = js.native
  
  var stop_pos: Double = js.native
}
object AVPlaySubtitleAttribute {
  
  @scala.inline
  def apply(attr_type: String, start_pos: Double, stop_pos: Double): AVPlaySubtitleAttribute = {
    val __obj = js.Dynamic.literal(attr_type = attr_type.asInstanceOf[js.Any], start_pos = start_pos.asInstanceOf[js.Any], stop_pos = stop_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVPlaySubtitleAttribute]
  }
  
  @scala.inline
  implicit class AVPlaySubtitleAttributeMutableBuilder[Self <: AVPlaySubtitleAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr_type(value: String): Self = StObject.set(x, "attr_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_pos(value: Double): Self = StObject.set(x, "start_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop_pos(value: Double): Self = StObject.set(x, "stop_pos", value.asInstanceOf[js.Any])
  }
}
