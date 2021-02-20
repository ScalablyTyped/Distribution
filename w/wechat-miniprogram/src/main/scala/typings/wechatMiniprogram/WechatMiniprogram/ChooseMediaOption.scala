package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.album
import typings.wechatMiniprogram.wechatMiniprogramStrings.back
import typings.wechatMiniprogram.wechatMiniprogramStrings.camera
import typings.wechatMiniprogram.wechatMiniprogramStrings.front
import typings.wechatMiniprogram.wechatMiniprogramStrings.image
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseMediaOption extends StObject {
  
  /** 仅在 sourceType 为 camera 时生效，使用前置或后置摄像头
    *
    * 可选值：
    * - 'back': 使用后置摄像头;
    * - 'front': 使用前置摄像头; */
  var camera: js.UndefOr[back | front] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseMediaCompleteCallback] = js.native
  
  /** 最多可以选择的文件个数 */
  var count: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseMediaFailCallback] = js.native
  
  /** 拍摄视频最长拍摄时间，单位秒。时间范围为 3s 至 30s 之间 */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /** 文件类型
    *
    * 可选值：
    * - 'image': 只能拍摄图片或从相册选择图片;
    * - 'video': 只能拍摄视频或从相册选择视频; */
  var mediaType: js.UndefOr[js.Array[image | video]] = js.native
  
  /** 仅对 mediaType 为 image 时有效，是否压缩所选文件 */
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  
  /** 图片和视频选择的来源
    *
    * 可选值：
    * - 'album': 从相册选择;
    * - 'camera': 使用相机拍摄; */
  var sourceType: js.UndefOr[js.Array[album | camera]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseMediaSuccessCallback] = js.native
}
object ChooseMediaOption {
  
  @scala.inline
  def apply(): ChooseMediaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseMediaOption]
  }
  
  @scala.inline
  implicit class ChooseMediaOptionMutableBuilder[Self <: ChooseMediaOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: back | front): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setMediaType(value: js.Array[image | video]): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    @scala.inline
    def setMediaTypeVarargs(value: (image | video)*): Self = StObject.set(x, "mediaType", js.Array(value :_*))
    
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[album | camera]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ChooseMediaSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
