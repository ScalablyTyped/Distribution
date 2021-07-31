package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadFontFaceOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[LoadFontFaceCompleteCallback] = js.undefined
  
  /** 可选的字体描述符 */
  var desc: js.UndefOr[DescOption] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[LoadFontFaceFailCallback] = js.undefined
  
  /** 定义的字体名称 */
  var family: String
  
  /** 是否全局生效
    *
    * 最低基础库： `2.10.0` */
  var global: js.UndefOr[Boolean] = js.undefined
  
  /** 字体作用范围，可选值为 webview / native，默认 webview，设置 native 可在 Canvas 2D 下使用 */
  var scopes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /** 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。 */
  var source: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[LoadFontFaceSuccessCallback] = js.undefined
}
object LoadFontFaceOption {
  
  @scala.inline
  def apply(family: String, source: String): LoadFontFaceOption = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFontFaceOption]
  }
  
  @scala.inline
  implicit class LoadFontFaceOptionMutableBuilder[Self <: LoadFontFaceOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDesc(value: DescOption): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Array[js.Any]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: js.Any*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
