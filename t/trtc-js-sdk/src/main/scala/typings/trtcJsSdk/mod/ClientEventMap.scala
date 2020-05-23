package typings.trtcJsSdk.mod

import typings.trtcJsSdk.anon.CurState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientEventMap extends js.Object {
  /** 用户被踢出房间通知，被踢原因有 */
  var `client-banned`: RtcError
  /** 信令通道连接状态变化事件 */
  var `connection-state-changed`: CurState
  /** 客户端错误事件 */
  var error: RtcError
  /** 远端用户禁用音频通知。 */
  var `mute-audio`: RemoteUserInfo
  /** 远端用户禁用视频通知。 */
  var `mute-video`: RemoteUserInfo
  /** 远端用户进房通知，只有主动推流的远端用户进房才会收到该通知。 */
  var `peer-join`: RemoteUserInfo
  /** 远端用户退房通知，只有主动推流的远端用户退房才会收到该通知。 */
  var `peer-leave`: RemoteUserInfo
  /** 远端流添加事件，当远端用户发布流后会收到该通知。 */
  var `stream-added`: RemoteStreamInfo
  /** 远端流移除事件，当远端用户取消发布流后会收到该通知。  */
  var `stream-removed`: RemoteStreamInfo
  /** 远端流订阅成功事件，调用 subscribe() 成功后会触发该事件。 */
  var `stream-subscribed`: RemoteStreamInfo
  /** 远端流更新事件，当远端用户添加、移除或更换音视频轨道后会收到该通知。 */
  var `stream-updated`: RemoteStreamInfo
  /** 远端用户启用音频通知。 */
  var `unmute-audio`: RemoteUserInfo
  /** 远端用户启用视频通知。 */
  var `unmute-video`: RemoteUserInfo
}

object ClientEventMap {
  @scala.inline
  def apply(
    `client-banned`: RtcError,
    `connection-state-changed`: CurState,
    error: RtcError,
    `mute-audio`: RemoteUserInfo,
    `mute-video`: RemoteUserInfo,
    `peer-join`: RemoteUserInfo,
    `peer-leave`: RemoteUserInfo,
    `stream-added`: RemoteStreamInfo,
    `stream-removed`: RemoteStreamInfo,
    `stream-subscribed`: RemoteStreamInfo,
    `stream-updated`: RemoteStreamInfo,
    `unmute-audio`: RemoteUserInfo,
    `unmute-video`: RemoteUserInfo
  ): ClientEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("client-banned")(`client-banned`.asInstanceOf[js.Any])
    __obj.updateDynamic("connection-state-changed")(`connection-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("mute-audio")(`mute-audio`.asInstanceOf[js.Any])
    __obj.updateDynamic("mute-video")(`mute-video`.asInstanceOf[js.Any])
    __obj.updateDynamic("peer-join")(`peer-join`.asInstanceOf[js.Any])
    __obj.updateDynamic("peer-leave")(`peer-leave`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-added")(`stream-added`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-removed")(`stream-removed`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-subscribed")(`stream-subscribed`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-updated")(`stream-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("unmute-audio")(`unmute-audio`.asInstanceOf[js.Any])
    __obj.updateDynamic("unmute-video")(`unmute-video`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEventMap]
  }
}

