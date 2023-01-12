package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.scopeDotcamera
import typings.wechatMiniprogram.wechatMiniprogramStrings.scopeDotrecord
import typings.wechatMiniprogram.wechatMiniprogramStrings.scopeDotwritePhotosAlbum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeForMiniProgramOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AuthorizeForMiniProgramCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AuthorizeForMiniProgramFailCallback] = js.undefined
  
  /** 需要获取权限的 scope，详见 [scope 列表]((authorize#scope-列表))
    *
    * 可选值：
    * - 'scope.record': ;
    * - 'scope.writePhotosAlbum': ;
    * - 'scope.camera': ; */
  var scope: scopeDotrecord | scopeDotwritePhotosAlbum | scopeDotcamera
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AuthorizeForMiniProgramSuccessCallback] = js.undefined
}
object AuthorizeForMiniProgramOption {
  
  inline def apply(scope: scopeDotrecord | scopeDotwritePhotosAlbum | scopeDotcamera): AuthorizeForMiniProgramOption = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeForMiniProgramOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeForMiniProgramOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setScope(value: scopeDotrecord | scopeDotwritePhotosAlbum | scopeDotcamera): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
