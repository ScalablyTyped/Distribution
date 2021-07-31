package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundAudioOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 封面url
    */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 音乐链接，目前支持的格式有 m4a, aac, mp3, wav
    */
  var dataUrl: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 音乐标题
    */
  var title: js.UndefOr[String] = js.undefined
}
object GetBackgroundAudioOptions {
  
  @scala.inline
  def apply(): GetBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioOptions]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioOptionsMutableBuilder[Self <: GetBackgroundAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImgUrlUndefined: Self = StObject.set(x, "coverImgUrl", js.undefined)
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
