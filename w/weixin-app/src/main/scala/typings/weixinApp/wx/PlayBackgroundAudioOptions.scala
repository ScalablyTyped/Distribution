package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayBackgroundAudioOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.undefined
  
  /** 音乐链接 */
  var dataUrl: String
  
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
}
object PlayBackgroundAudioOptions {
  
  inline def apply(dataUrl: String): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
  
  extension [Self <: PlayBackgroundAudioOptions](x: Self) {
    
    inline def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    inline def setCoverImgUrlUndefined: Self = StObject.set(x, "coverImgUrl", js.undefined)
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
