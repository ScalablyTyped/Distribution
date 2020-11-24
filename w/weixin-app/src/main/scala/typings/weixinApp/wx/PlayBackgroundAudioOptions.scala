package typings.weixinApp.wx

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
  implicit class PlayBackgroundAudioOptionsOps[Self <: PlayBackgroundAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImgUrl(value: String): Self = this.set("coverImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverImgUrl: Self = this.set("coverImgUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
