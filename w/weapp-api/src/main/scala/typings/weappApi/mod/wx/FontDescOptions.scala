package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontDescOptions extends StObject {
  
  //  字体样式，可选值为 normal / italic / oblique
  var style: js.UndefOr[String] = js.undefined
  
  //  设置小型大写字母的字体显示文本，可选值为 normal / small-caps / inherit
  var variant: js.UndefOr[String] = js.undefined
  
  //  字体粗细，可选值为 normal / bold / 100 / 200../ 900
  var weight: js.UndefOr[String] = js.undefined
}
object FontDescOptions {
  
  inline def apply(): FontDescOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontDescOptions]
  }
  
  extension [Self <: FontDescOptions](x: Self) {
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
