package typings.weixinApp.wx

import typings.weixinApp.anon.Style
import typings.weixinApp.weixinAppStrings.native
import typings.weixinApp.weixinAppStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 界面-----字体
trait LoadFontFaceOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 可选的字体描述符 */
  var desc: js.UndefOr[Style] = js.undefined
  
  /** 定义的字体名称 */
  var family: String
  
  /** 是否全局生效 */
  var global: js.UndefOr[Boolean] = js.undefined
  
  /** 字体作用范围，可选值为 webview / native，默认 webview，设置 native 可在 Canvas 2D 下使用 */
  var scopes: js.UndefOr[js.Array[webview | native]] = js.undefined
  
  /** 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容 */
  var source: String
}
object LoadFontFaceOptions {
  
  inline def apply(family: String, source: String): LoadFontFaceOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFontFaceOptions]
  }
  
  extension [Self <: LoadFontFaceOptions](x: Self) {
    
    inline def setDesc(value: Style): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setScopes(value: js.Array[webview | native]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: (webview | native)*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
