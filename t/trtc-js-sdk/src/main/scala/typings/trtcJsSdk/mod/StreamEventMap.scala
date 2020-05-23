package typings.trtcJsSdk.mod

import typings.trtcJsSdk.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEventMap extends js.Object {
  /** Audio/Video Player 状态变化事件 App 可根据状态变化来更新 UI，比如，通过监听 video player 状态变化来关闭或打开遮板。 */
  var `player-state-changed`: State
  /** 本地屏幕分享停止事件通知，仅对本地屏幕分享流有效。 */
  var `screen-sharing-stopped`: js.UndefOr[scala.Nothing] = js.undefined
}

object StreamEventMap {
  @scala.inline
  def apply(`player-state-changed`: State): StreamEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("player-state-changed")(`player-state-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventMap]
  }
}

