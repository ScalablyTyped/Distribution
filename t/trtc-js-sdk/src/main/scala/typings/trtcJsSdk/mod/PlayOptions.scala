package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkStrings.`scale-down`
import typings.trtcJsSdk.trtcJsSdkStrings.contain
import typings.trtcJsSdk.trtcJsSdkStrings.cover
import typings.trtcJsSdk.trtcJsSdkStrings.fill
import typings.trtcJsSdk.trtcJsSdkStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayOptions extends StObject {
  
  /** 是否需要 mute 声音，对于本地流通常需要 mute 声音以防止播放从麦克风采集回来的声音。 */
  var muted: Boolean = js.native
  
  /** 视频画面显示模式，参考 [CSS object-fit 属性](https://developer.mozilla.org/zh-CN/docs/Web/CSS/object-fit) */
  var objectFit: contain | cover | fill | none | `scale-down` = js.native
}
object PlayOptions {
  
  @scala.inline
  def apply(muted: Boolean, objectFit: contain | cover | fill | none | `scale-down`): PlayOptions = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], objectFit = objectFit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
  
  @scala.inline
  implicit class PlayOptionsMutableBuilder[Self <: PlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFit(value: contain | cover | fill | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
  }
}
