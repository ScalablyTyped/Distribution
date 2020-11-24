package typings.trtcJsSdk.mod

import typings.trtcJsSdk.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamEventMap extends js.Object {
  
  /** Audio/Video Player 状态变化事件 App 可根据状态变化来更新 UI，比如，通过监听 video player 状态变化来关闭或打开遮板。 */
  var `player-state-changed`: State = js.native
  
  /** 本地屏幕分享停止事件通知，仅对本地屏幕分享流有效。 */
  var `screen-sharing-stopped`: js.UndefOr[scala.Nothing] = js.native
}
object StreamEventMap {
  
  @scala.inline
  def apply(`player-state-changed`: State): StreamEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("player-state-changed")(`player-state-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventMap]
  }
  
  @scala.inline
  implicit class StreamEventMapOps[Self <: StreamEventMap] (val x: Self) extends AnyVal {
    
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
    def `setPlayer-state-changed`(value: State): Self = this.set("player-state-changed", value.asInstanceOf[js.Any])
  }
}
