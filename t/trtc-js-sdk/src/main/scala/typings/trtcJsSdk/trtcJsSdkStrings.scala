package typings.trtcJsSdk

import typings.trtcJsSdk.mod.ConnectionState
import typings.trtcJsSdk.mod.Role
import typings.trtcJsSdk.mod.ScreenProfileString
import typings.trtcJsSdk.mod.VideoProfileString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object trtcJsSdkStrings {
  @js.native
  sealed trait `1080p`
    extends ScreenProfileString
       with VideoProfileString
  
  @js.native
  sealed trait `1080p_2` extends ScreenProfileString
  
  @js.native
  sealed trait `120p` extends VideoProfileString
  
  @js.native
  sealed trait `1440p` extends VideoProfileString
  
  @js.native
  sealed trait `180p` extends VideoProfileString
  
  @js.native
  sealed trait `240p` extends VideoProfileString
  
  @js.native
  sealed trait `360p` extends VideoProfileString
  
  @js.native
  sealed trait `480p`
    extends ScreenProfileString
       with VideoProfileString
  
  @js.native
  sealed trait `480p_2` extends ScreenProfileString
  
  @js.native
  sealed trait `4K` extends VideoProfileString
  
  @js.native
  sealed trait `720p`
    extends ScreenProfileString
       with VideoProfileString
  
  @js.native
  sealed trait `720p_2` extends ScreenProfileString
  
  @js.native
  sealed trait Asterisk extends js.Object
  
  @js.native
  sealed trait CONNECTED extends ConnectionState
  
  @js.native
  sealed trait CONNECTING extends ConnectionState
  
  @js.native
  sealed trait DISCONNECTED extends ConnectionState
  
  @js.native
  sealed trait PAUSED extends js.Object
  
  @js.native
  sealed trait PLAYING extends js.Object
  
  @js.native
  sealed trait RECONNECTING extends ConnectionState
  
  @js.native
  sealed trait STOPPED extends js.Object
  
  @js.native
  sealed trait anchor extends Role
  
  @js.native
  sealed trait audience extends Role
  
  @js.native
  sealed trait audio extends js.Object
  
  @js.native
  sealed trait auxiliary extends js.Object
  
  @js.native
  sealed trait `client-banned` extends js.Object
  
  @js.native
  sealed trait `connection-state-changed` extends js.Object
  
  @js.native
  sealed trait contain extends js.Object
  
  @js.native
  sealed trait cover extends js.Object
  
  @js.native
  sealed trait detail extends js.Object
  
  @js.native
  sealed trait environment extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait fill extends js.Object
  
  @js.native
  sealed trait high extends js.Object
  
  @js.native
  sealed trait live extends js.Object
  
  @js.native
  sealed trait main extends js.Object
  
  @js.native
  sealed trait motion extends js.Object
  
  @js.native
  sealed trait `mute-audio` extends js.Object
  
  @js.native
  sealed trait `mute-video` extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait `peer-join` extends js.Object
  
  @js.native
  sealed trait `peer-leave` extends js.Object
  
  @js.native
  sealed trait `player-state-changed` extends js.Object
  
  @js.native
  sealed trait `scale-down` extends js.Object
  
  @js.native
  sealed trait `screen-sharing-stopped` extends js.Object
  
  @js.native
  sealed trait standard extends js.Object
  
  @js.native
  sealed trait `stream-added` extends js.Object
  
  @js.native
  sealed trait `stream-removed` extends js.Object
  
  @js.native
  sealed trait `stream-subscribed` extends js.Object
  
  @js.native
  sealed trait `stream-updated` extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  @js.native
  sealed trait `unmute-audio` extends js.Object
  
  @js.native
  sealed trait `unmute-video` extends js.Object
  
  @js.native
  sealed trait user extends js.Object
  
  @js.native
  sealed trait video extends js.Object
  
  @js.native
  sealed trait videoCall extends js.Object
  
  @scala.inline
  def `1080p`: `1080p` = "1080p".asInstanceOf[`1080p`]
  @scala.inline
  def `1080p_2`: `1080p_2` = "1080p_2".asInstanceOf[`1080p_2`]
  @scala.inline
  def `120p`: `120p` = "120p".asInstanceOf[`120p`]
  @scala.inline
  def `1440p`: `1440p` = "1440p".asInstanceOf[`1440p`]
  @scala.inline
  def `180p`: `180p` = "180p".asInstanceOf[`180p`]
  @scala.inline
  def `240p`: `240p` = "240p".asInstanceOf[`240p`]
  @scala.inline
  def `360p`: `360p` = "360p".asInstanceOf[`360p`]
  @scala.inline
  def `480p`: `480p` = "480p".asInstanceOf[`480p`]
  @scala.inline
  def `480p_2`: `480p_2` = "480p_2".asInstanceOf[`480p_2`]
  @scala.inline
  def `4K`: `4K` = "4K".asInstanceOf[`4K`]
  @scala.inline
  def `720p`: `720p` = "720p".asInstanceOf[`720p`]
  @scala.inline
  def `720p_2`: `720p_2` = "720p_2".asInstanceOf[`720p_2`]
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  @scala.inline
  def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  @scala.inline
  def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  @scala.inline
  def PLAYING: PLAYING = "PLAYING".asInstanceOf[PLAYING]
  @scala.inline
  def RECONNECTING: RECONNECTING = "RECONNECTING".asInstanceOf[RECONNECTING]
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  @scala.inline
  def anchor: anchor = "anchor".asInstanceOf[anchor]
  @scala.inline
  def audience: audience = "audience".asInstanceOf[audience]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def auxiliary: auxiliary = "auxiliary".asInstanceOf[auxiliary]
  @scala.inline
  def `client-banned`: `client-banned` = "client-banned".asInstanceOf[`client-banned`]
  @scala.inline
  def `connection-state-changed`: `connection-state-changed` = "connection-state-changed".asInstanceOf[`connection-state-changed`]
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  @scala.inline
  def detail: detail = "detail".asInstanceOf[detail]
  @scala.inline
  def environment: environment = "environment".asInstanceOf[environment]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def live: live = "live".asInstanceOf[live]
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  @scala.inline
  def motion: motion = "motion".asInstanceOf[motion]
  @scala.inline
  def `mute-audio`: `mute-audio` = "mute-audio".asInstanceOf[`mute-audio`]
  @scala.inline
  def `mute-video`: `mute-video` = "mute-video".asInstanceOf[`mute-video`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `peer-join`: `peer-join` = "peer-join".asInstanceOf[`peer-join`]
  @scala.inline
  def `peer-leave`: `peer-leave` = "peer-leave".asInstanceOf[`peer-leave`]
  @scala.inline
  def `player-state-changed`: `player-state-changed` = "player-state-changed".asInstanceOf[`player-state-changed`]
  @scala.inline
  def `scale-down`: `scale-down` = "scale-down".asInstanceOf[`scale-down`]
  @scala.inline
  def `screen-sharing-stopped`: `screen-sharing-stopped` = "screen-sharing-stopped".asInstanceOf[`screen-sharing-stopped`]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def `stream-added`: `stream-added` = "stream-added".asInstanceOf[`stream-added`]
  @scala.inline
  def `stream-removed`: `stream-removed` = "stream-removed".asInstanceOf[`stream-removed`]
  @scala.inline
  def `stream-subscribed`: `stream-subscribed` = "stream-subscribed".asInstanceOf[`stream-subscribed`]
  @scala.inline
  def `stream-updated`: `stream-updated` = "stream-updated".asInstanceOf[`stream-updated`]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def `unmute-audio`: `unmute-audio` = "unmute-audio".asInstanceOf[`unmute-audio`]
  @scala.inline
  def `unmute-video`: `unmute-video` = "unmute-video".asInstanceOf[`unmute-video`]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def videoCall: videoCall = "videoCall".asInstanceOf[videoCall]
}

