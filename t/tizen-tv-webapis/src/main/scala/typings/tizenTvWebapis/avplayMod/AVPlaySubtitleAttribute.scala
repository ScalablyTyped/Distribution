package typings.tizenTvWebapis.avplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlaySubtitleAttribute extends js.Object {
  
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
  implicit class AVPlaySubtitleAttributeOps[Self <: AVPlaySubtitleAttribute] (val x: Self) extends AnyVal {
    
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
    def setAttr_type(value: String): Self = this.set("attr_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_pos(value: Double): Self = this.set("start_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop_pos(value: Double): Self = this.set("stop_pos", value.asInstanceOf[js.Any])
  }
}
