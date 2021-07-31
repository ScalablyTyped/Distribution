package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 可选的字体描述符 */
trait DescOption extends StObject {
  
  /** 字体样式，可选值为 normal / italic / oblique */
  var style: js.UndefOr[String] = js.undefined
  
  /** 设置小型大写字母的字体显示文本，可选值为 normal / small-caps / inherit */
  var variant: js.UndefOr[String] = js.undefined
  
  /** 字体粗细，可选值为 normal / bold / 100 / 200../ 900 */
  var weight: js.UndefOr[String] = js.undefined
}
object DescOption {
  
  @scala.inline
  def apply(): DescOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescOption]
  }
  
  @scala.inline
  implicit class DescOptionMutableBuilder[Self <: DescOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    @scala.inline
    def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
