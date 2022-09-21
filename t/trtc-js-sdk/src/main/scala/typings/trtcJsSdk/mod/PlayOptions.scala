package typings.trtcJsSdk.mod

import typings.trtcJsSdk.trtcJsSdkStrings.`scale-down`
import typings.trtcJsSdk.trtcJsSdkStrings.contain
import typings.trtcJsSdk.trtcJsSdkStrings.cover
import typings.trtcJsSdk.trtcJsSdkStrings.fill
import typings.trtcJsSdk.trtcJsSdkStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayOptions extends StObject {
  
  /** 是否需要 mute 声音，对于本地流通常需要 mute 声音以防止播放从麦克风采集回来的声音。 */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /** 视频画面显示模式，参考 [CSS object-fit 属性](https://developer.mozilla.org/zh-CN/docs/Web/CSS/object-fit) */
  var objectFit: js.UndefOr[contain | cover | fill | none | `scale-down`] = js.undefined
}
object PlayOptions {
  
  inline def apply(): PlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayOptions]
  }
  
  extension [Self <: PlayOptions](x: Self) {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setObjectFit(value: contain | cover | fill | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
  }
}
