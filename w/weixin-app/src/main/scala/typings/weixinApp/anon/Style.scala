package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.`100`
import typings.weixinApp.weixinAppStrings.`200`
import typings.weixinApp.weixinAppStrings.`300`
import typings.weixinApp.weixinAppStrings.`400`
import typings.weixinApp.weixinAppStrings.`500`
import typings.weixinApp.weixinAppStrings.`600`
import typings.weixinApp.weixinAppStrings.`700`
import typings.weixinApp.weixinAppStrings.`800`
import typings.weixinApp.weixinAppStrings.`900`
import typings.weixinApp.weixinAppStrings.`small-caps`
import typings.weixinApp.weixinAppStrings.bold
import typings.weixinApp.weixinAppStrings.inherit
import typings.weixinApp.weixinAppStrings.italic
import typings.weixinApp.weixinAppStrings.normal
import typings.weixinApp.weixinAppStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  /** 字体样式，可选值为 normal / italic / oblique */
  var style: js.UndefOr[js.Tuple3[normal, italic, oblique]] = js.undefined
  
  /** 设置小型大写字母的字体显示文本，可选值为 normal / small-caps / inherit */
  var variant: js.UndefOr[js.Tuple3[normal, `small-caps`, inherit]] = js.undefined
  
  /** 字体粗细，可选值为 normal / bold / 100 / 200../ 900 */
  var weight: js.UndefOr[
    js.Tuple11[normal, bold, `100`, `200`, `300`, `400`, `500`, `600`, `700`, `800`, `900`]
  ] = js.undefined
}
object Style {
  
  inline def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setStyle(value: js.Tuple3[normal, italic, oblique]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVariant(value: js.Tuple3[normal, `small-caps`, inherit]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setWeight(value: js.Tuple11[normal, bold, `100`, `200`, `300`, `400`, `500`, `600`, `700`, `800`, `900`]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
