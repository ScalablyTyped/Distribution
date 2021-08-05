package typings.uniApp

import typings.uniApp.uniAppStrings.back
import typings.uniApp.uniAppStrings.front
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseVideoOptions extends StObject {
  
  /**
    * 摄像切换
    * - front: 前置摄像头
    * - back: 后置摄像头
    */
  var camera: js.UndefOr[front | back] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 是否压缩所选的视频源文件，默认值为true，需要压缩
    */
  var compressed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 拍摄视频最长拍摄时间，单位秒。最长支持 60 秒
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera']
    */
  var sourceType: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  /**
    * 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明
    */
  var success: js.UndefOr[js.Function1[/* result */ ChooseVideoSuccess, Unit]] = js.undefined
}
object ChooseVideoOptions {
  
  inline def apply(): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoOptions]
  }
  
  extension [Self <: ChooseVideoOptions](x: Self) {
    
    inline def setCamera(value: front | back): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setSourceType(value: String | js.Array[js.Any]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: js.Any*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    inline def setSuccess(value: /* result */ ChooseVideoSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
