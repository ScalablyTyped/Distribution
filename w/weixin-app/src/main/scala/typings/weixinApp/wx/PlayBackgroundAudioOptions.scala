package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.native
  
  /** 音乐链接 */
  var dataUrl: String = js.native
  
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.native
}
object PlayBackgroundAudioOptions {
  
  @scala.inline
  def apply(dataUrl: String): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
  
  @scala.inline
  implicit class PlayBackgroundAudioOptionsMutableBuilder[Self <: PlayBackgroundAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImgUrlUndefined: Self = StObject.set(x, "coverImgUrl", js.undefined)
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
