package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.album
import typings.wechatMiniprogram.wechatMiniprogramStrings.back
import typings.wechatMiniprogram.wechatMiniprogramStrings.camera
import typings.wechatMiniprogram.wechatMiniprogramStrings.front
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseVideoOption extends StObject {
  
  /** 默认拉起的是前置或者后置摄像头。部分 Android 手机下由于系统 ROM 不支持无法生效
    *
    * 可选值：
    * - 'back': 默认拉起后置摄像头;
    * - 'front': 默认拉起前置摄像头; */
  var camera: js.UndefOr[back | front] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseVideoCompleteCallback] = js.native
  
  /** 是否压缩所选择的视频文件
    *
    * 最低基础库： `1.6.0` */
  var compressed: js.UndefOr[Boolean] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseVideoFailCallback] = js.native
  
  /** 拍摄视频最长拍摄时间，单位秒 */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /** 视频选择的来源
    *
    * 可选值：
    * - 'album': 从相册选择视频;
    * - 'camera': 使用相机拍摄视频; */
  var sourceType: js.UndefOr[js.Array[album | camera]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseVideoSuccessCallback] = js.native
}
object ChooseVideoOption {
  
  @scala.inline
  def apply(): ChooseVideoOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoOption]
  }
  
  @scala.inline
  implicit class ChooseVideoOptionMutableBuilder[Self <: ChooseVideoOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: back | front): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setSourceType(value: js.Array[album | camera]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ChooseVideoSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
