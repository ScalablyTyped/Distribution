package typings.tizenTvWebapis.avplayMod

import typings.tizenTvWebapis.tizenTvWebapisStrings.AUDIO
import typings.tizenTvWebapis.tizenTvWebapisStrings.TEXT
import typings.tizenTvWebapis.tizenTvWebapisStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlayStreamInfo extends js.Object {
  
  var extra_info: String = js.native
  
  var index: Double = js.native
  
  var `type`: AVPlayStreamType | VIDEO | AUDIO | TEXT = js.native
}
object AVPlayStreamInfo {
  
  @scala.inline
  def apply(extra_info: String, index: Double, `type`: AVPlayStreamType | VIDEO | AUDIO | TEXT): AVPlayStreamInfo = {
    val __obj = js.Dynamic.literal(extra_info = extra_info.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVPlayStreamInfo]
  }
  
  @scala.inline
  implicit class AVPlayStreamInfoOps[Self <: AVPlayStreamInfo] (val x: Self) extends AnyVal {
    
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
    def setExtra_info(value: String): Self = this.set("extra_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AVPlayStreamType | VIDEO | AUDIO | TEXT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
