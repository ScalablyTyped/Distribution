package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightRpx extends StObject {
  
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
  implicit class HeightRpxMutableBuilder[Self <: HeightRpx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightRpx(value: Double): Self = StObject.set(x, "heightRpx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
