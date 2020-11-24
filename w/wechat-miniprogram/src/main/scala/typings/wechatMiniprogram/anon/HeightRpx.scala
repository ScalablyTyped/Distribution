package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightRpx extends js.Object {
  
  /** 输入框高度(px) */
  var height: Double = js.native
  
  /** 输入框高度(rpx) */
  var heightRpx: Double = js.native
  
  /** 行数 */
  var lineCount: Double = js.native
  
  /** 行高 */
  var lineHeight: Double = js.native
}
object HeightRpx {
  
  @scala.inline
  def apply(height: Double, heightRpx: Double, lineCount: Double, lineHeight: Double): HeightRpx = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightRpx = heightRpx.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightRpx]
  }
  
  @scala.inline
  implicit class HeightRpxOps[Self <: HeightRpx] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightRpx(value: Double): Self = this.set("heightRpx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = this.set("lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
  }
}
