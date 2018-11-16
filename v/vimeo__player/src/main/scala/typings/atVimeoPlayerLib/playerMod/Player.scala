package typings
package atVimeoPlayerLib.playerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vimeo/player", "Player")
@js.native
class Player protected () extends js.Object {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLIFrameElement) = this()
  def this(element: java.lang.String, options: Options) = this()
  def this(element: stdLib.HTMLElement, options: Options) = this()
  def this(element: stdLib.HTMLIFrameElement, options: Options) = this()
  def addCuePoint(time: scala.Double, data: VimeoCuePointData): VimeoPromise[java.lang.String, UnsupportedError | RangeError | Error] = js.native
  def destroy(): VimeoPromise[scala.Unit, Error] = js.native
  def disableTextTrack(): VimeoPromise[scala.Unit, Error] = js.native
  def enableTextTrack(language: java.lang.String): VimeoPromise[VimeoTextTrack, InvalidTrackLanguageError | InvalidTrackError | Error] = js.native
  def enableTextTrack(language: java.lang.String, kind: java.lang.String): VimeoPromise[VimeoTextTrack, InvalidTrackLanguageError | InvalidTrackError | Error] = js.native
  def getAutopause(): VimeoPromise[scala.Boolean, UnsupportedError | Error] = js.native
  def getColor(): VimeoPromise[java.lang.String, Error] = js.native
  def getCuePoints(): VimeoPromise[js.Array[VimeoCuePoint], UnsupportedError | Error] = js.native
  def getCurrentTime(): VimeoPromise[scala.Double, Error] = js.native
  def getDuration(): VimeoPromise[scala.Double, Error] = js.native
  def getEnded(): VimeoPromise[scala.Boolean, Error] = js.native
  def getLoop(): VimeoPromise[scala.Boolean, Error] = js.native
  def getPaused(): VimeoPromise[scala.Boolean, Error] = js.native
  def getPlaybackRate(): VimeoPromise[scala.Double, Error] = js.native
  def getTextTracks(): VimeoPromise[js.Array[VimeoTextTrack], Error] = js.native
  def getVideoEmbedCode(): VimeoPromise[java.lang.String, Error] = js.native
  def getVideoHeight(): VimeoPromise[scala.Double, Error] = js.native
  def getVideoId(): VimeoPromise[scala.Double, Error] = js.native
  def getVideoTitle(): VimeoPromise[java.lang.String, Error] = js.native
  def getVideoUrl(): VimeoPromise[java.lang.String, PrivacyError | Error] = js.native
  def getVideoWidth(): VimeoPromise[scala.Double, Error] = js.native
  def getVolume(): VimeoPromise[scala.Double, Error] = js.native
  def loadVideo(id: scala.Double): VimeoPromise[scala.Double, TypeError | PasswordError | PrivacyError | Error] = js.native
  def off(event: EventName): scala.Unit = js.native
  def off(event: EventName, callback: EventCallback): scala.Unit = js.native
  def on(event: EventName, callback: EventCallback): scala.Unit = js.native
  def pause(): VimeoPromise[scala.Unit, PasswordError | PrivacyError | Error] = js.native
  def play(): VimeoPromise[scala.Unit, PasswordError | PrivacyError | Error] = js.native
  def ready(): VimeoPromise[scala.Unit, Error] = js.native
  def removeCuePoint(id: java.lang.String): VimeoPromise[java.lang.String, UnsupportedError | InvalidCuePoint | Error] = js.native
  def setAutopause(autopause: scala.Boolean): VimeoPromise[scala.Boolean, UnsupportedError | Error] = js.native
  def setColor(color: java.lang.String): VimeoPromise[java.lang.String, ContrastError | TypeError | Error] = js.native
  def setCurrentTime(seconds: scala.Double): VimeoPromise[scala.Double, RangeError | Error] = js.native
  def setLoop(loop: scala.Boolean): VimeoPromise[scala.Boolean, Error] = js.native
  def setPlaybackRate(playbackRate: scala.Double): VimeoPromise[scala.Double, RangeError | Error] = js.native
  def setVolume(volume: scala.Double): VimeoPromise[scala.Double, RangeError | Error] = js.native
  def unload(): VimeoPromise[scala.Unit, Error] = js.native
}

