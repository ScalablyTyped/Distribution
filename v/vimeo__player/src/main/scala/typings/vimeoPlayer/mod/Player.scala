package typings.vimeoPlayer.mod

import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vimeo/player", "Player")
@js.native
class Player protected () extends js.Object {
  def this(element: String) = this()
  def this(element: HTMLElement) = this()
  def this(element: HTMLIFrameElement) = this()
  def this(element: String, options: Options) = this()
  def this(element: HTMLElement, options: Options) = this()
  def this(element: HTMLIFrameElement, options: Options) = this()
  def addCuePoint(time: Double, data: VimeoCuePointData): VimeoPromise[String, UnsupportedError | RangeError | Error] = js.native
  def destroy(): VimeoPromise[Unit, Error] = js.native
  def disableTextTrack(): VimeoPromise[Unit, Error] = js.native
  def enableTextTrack(language: String): VimeoPromise[VimeoTextTrack, InvalidTrackLanguageError | InvalidTrackError | Error] = js.native
  def enableTextTrack(language: String, kind: String): VimeoPromise[VimeoTextTrack, InvalidTrackLanguageError | InvalidTrackError | Error] = js.native
  def getAutopause(): VimeoPromise[Boolean, UnsupportedError | Error] = js.native
  def getBuffered(): VimeoPromise[js.Array[VimeoTimeRange], Error] = js.native
  def getColor(): VimeoPromise[String, Error] = js.native
  def getCuePoints(): VimeoPromise[js.Array[VimeoCuePoint], UnsupportedError | Error] = js.native
  def getCurrentTime(): VimeoPromise[Double, Error] = js.native
  def getDuration(): VimeoPromise[Double, Error] = js.native
  def getEnded(): VimeoPromise[Boolean, Error] = js.native
  def getLoop(): VimeoPromise[Boolean, Error] = js.native
  def getPaused(): VimeoPromise[Boolean, Error] = js.native
  def getPlaybackRate(): VimeoPromise[Double, Error] = js.native
  def getPlayed(): VimeoPromise[js.Array[VimeoTimeRange], Error] = js.native
  def getSeekable(): VimeoPromise[js.Array[VimeoTimeRange], Error] = js.native
  def getSeeking(): VimeoPromise[Boolean, Error] = js.native
  def getTextTracks(): VimeoPromise[js.Array[VimeoTextTrack], Error] = js.native
  def getVideoEmbedCode(): VimeoPromise[String, Error] = js.native
  def getVideoHeight(): VimeoPromise[Double, Error] = js.native
  def getVideoId(): VimeoPromise[Double, Error] = js.native
  def getVideoTitle(): VimeoPromise[String, Error] = js.native
  def getVideoUrl(): VimeoPromise[String, PrivacyError | Error] = js.native
  def getVideoWidth(): VimeoPromise[Double, Error] = js.native
  def getVolume(): VimeoPromise[Double, Error] = js.native
  def loadVideo(id: Double): VimeoPromise[Double, TypeError | PasswordError | PrivacyError | Error] = js.native
  def off(event: EventName): Unit = js.native
  def off(event: EventName, callback: EventCallback): Unit = js.native
  def on(event: EventName, callback: EventCallback): Unit = js.native
  def pause(): VimeoPromise[Unit, PasswordError | PrivacyError | Error] = js.native
  def play(): VimeoPromise[Unit, PasswordError | PrivacyError | Error] = js.native
  def ready(): VimeoPromise[Unit, Error] = js.native
  def removeCuePoint(id: String): VimeoPromise[String, UnsupportedError | InvalidCuePoint | Error] = js.native
  def setAutopause(autopause: Boolean): VimeoPromise[Boolean, UnsupportedError | Error] = js.native
  def setColor(color: String): VimeoPromise[String, ContrastError | TypeError | Error] = js.native
  def setCurrentTime(seconds: Double): VimeoPromise[Double, RangeError | Error] = js.native
  def setLoop(loop: Boolean): VimeoPromise[Boolean, Error] = js.native
  def setPlaybackRate(playbackRate: Double): VimeoPromise[Double, RangeError | Error] = js.native
  def setVolume(volume: Double): VimeoPromise[Double, RangeError | Error] = js.native
  def unload(): VimeoPromise[Unit, Error] = js.native
}

