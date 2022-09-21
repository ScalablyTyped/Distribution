package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.vimeoPlayer.vimeoPlayerStrings.bufferend
import typings.vimeoPlayer.vimeoPlayerStrings.bufferstart
import typings.vimeoPlayer.vimeoPlayerStrings.camerachange
import typings.vimeoPlayer.vimeoPlayerStrings.chapterchange
import typings.vimeoPlayer.vimeoPlayerStrings.cuechange
import typings.vimeoPlayer.vimeoPlayerStrings.cuepoint
import typings.vimeoPlayer.vimeoPlayerStrings.durationchange
import typings.vimeoPlayer.vimeoPlayerStrings.ended
import typings.vimeoPlayer.vimeoPlayerStrings.enterpictureinpicture
import typings.vimeoPlayer.vimeoPlayerStrings.error
import typings.vimeoPlayer.vimeoPlayerStrings.fullscreenchange
import typings.vimeoPlayer.vimeoPlayerStrings.leavepictureinpicture
import typings.vimeoPlayer.vimeoPlayerStrings.loaded
import typings.vimeoPlayer.vimeoPlayerStrings.pause
import typings.vimeoPlayer.vimeoPlayerStrings.play
import typings.vimeoPlayer.vimeoPlayerStrings.playbackratechange
import typings.vimeoPlayer.vimeoPlayerStrings.playing
import typings.vimeoPlayer.vimeoPlayerStrings.progress
import typings.vimeoPlayer.vimeoPlayerStrings.qualitychange
import typings.vimeoPlayer.vimeoPlayerStrings.resize
import typings.vimeoPlayer.vimeoPlayerStrings.seeked
import typings.vimeoPlayer.vimeoPlayerStrings.seeking
import typings.vimeoPlayer.vimeoPlayerStrings.texttrackchange
import typings.vimeoPlayer.vimeoPlayerStrings.timeupdate
import typings.vimeoPlayer.vimeoPlayerStrings.volumechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vimeo/player", "Player")
@js.native
open class Player protected () extends StObject {
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
  def enableTextTrack(language: String, kind: TrackKind): VimeoPromise[VimeoTextTrack, InvalidTrackLanguageError | InvalidTrackError | Error] = js.native
  
  def exitFullscreen(): VimeoPromise[Unit, Error] = js.native
  
  def exitPictureInPicture(): VimeoPromise[Unit, Error] = js.native
  
  def getAutopause(): VimeoPromise[Boolean, UnsupportedError | Error] = js.native
  
  def getBuffered(): VimeoPromise[js.Array[VimeoTimeRange], Error] = js.native
  
  def getCameraProps(): VimeoPromise[VimeoCameraProps, Error] = js.native
  
  def getChapters(): VimeoPromise[js.Array[VimeoChapter], Error] = js.native
  
  def getColor(): VimeoPromise[String, Error] = js.native
  
  def getCuePoints(): VimeoPromise[js.Array[VimeoCuePoint], UnsupportedError | Error] = js.native
  
  def getCurrentChapter(): VimeoPromise[VimeoChapter, Error] = js.native
  
  def getCurrentTime(): VimeoPromise[Double, Error] = js.native
  
  def getDuration(): VimeoPromise[Double, Error] = js.native
  
  def getEnded(): VimeoPromise[Boolean, Error] = js.native
  
  def getFullscreen(): VimeoPromise[Boolean, Error] = js.native
  
  def getLoop(): VimeoPromise[Boolean, Error] = js.native
  
  def getMuted(): VimeoPromise[Boolean, Error] = js.native
  
  def getPaused(): VimeoPromise[Boolean, Error] = js.native
  
  def getPictureInPicture(): VimeoPromise[Boolean, Error] = js.native
  
  def getPlaybackRate(): VimeoPromise[Double, Error] = js.native
  
  def getPlayed(): VimeoPromise[js.Array[VimeoTimeRange], Error] = js.native
  
  def getQualities(): VimeoPromise[js.Array[VimeoVideoQualityObject], Error] = js.native
  
  def getQuality(): VimeoPromise[VimeoVideoQuality, Error] = js.native
  
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
  def loadVideo(options: Options): VimeoPromise[StringDictionary[Any], TypeError | PasswordError | PrivacyError | Error] = js.native
  def loadVideo(url: String): VimeoPromise[String, TypeError | PasswordError | PrivacyError | Error] = js.native
  
  def off(event: String): Unit = js.native
  def off(event: String, callback: EventCallback[Any]): Unit = js.native
  @JSName("off")
  def off_bufferend(event: bufferend, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("off")
  def off_bufferstart(event: bufferstart, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("off")
  def off_camerachange(event: camerachange, callback: EventCallback[VimeoCameraProps]): Unit = js.native
  @JSName("off")
  def off_chapterchange(event: chapterchange, callback: EventCallback[VimeoChapter]): Unit = js.native
  @JSName("off")
  def off_cuechange(event: cuechange, callback: EventCallback[CueChangeEvent]): Unit = js.native
  @JSName("off")
  def off_cuepoint(event: cuepoint, callback: EventCallback[CuePointEvent]): Unit = js.native
  @JSName("off")
  def off_durationchange(event: durationchange, callback: EventCallback[DurationChangeEvent]): Unit = js.native
  @JSName("off")
  def off_ended(event: ended, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_enterpictureinpicture(event: enterpictureinpicture, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("off")
  def off_error(event: error, callback: EventCallback[Error]): Unit = js.native
  @JSName("off")
  def off_fullscreenchange(event: fullscreenchange, callback: EventCallback[FullScreenChangeEvent]): Unit = js.native
  @JSName("off")
  def off_leavepictureinpicture(event: leavepictureinpicture, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("off")
  def off_loaded(event: loaded, callback: EventCallback[LoadedEvent]): Unit = js.native
  @JSName("off")
  def off_pause(event: pause, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_play(event: play, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_playbackratechange(event: playbackratechange, callback: EventCallback[PlaybackRateEvent]): Unit = js.native
  @JSName("off")
  def off_playing(event: playing, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_progress(event: progress, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_qualitychange(event: qualitychange, callback: EventCallback[QualityChangeEvent]): Unit = js.native
  @JSName("off")
  def off_resize(event: resize, callback: EventCallback[ResizeEvent]): Unit = js.native
  @JSName("off")
  def off_seeked(event: seeked, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_seeking(event: seeking, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_texttrackchange(event: texttrackchange, callback: EventCallback[TextTrackChangeEvent]): Unit = js.native
  @JSName("off")
  def off_timeupdate(event: timeupdate, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("off")
  def off_volumechange(event: volumechange, callback: EventCallback[VolumeChangeEvent]): Unit = js.native
  
  def on(event: String, callback: EventCallback[Any]): Unit = js.native
  @JSName("on")
  def on_bufferend(event: bufferend, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("on")
  def on_bufferstart(event: bufferstart, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("on")
  def on_camerachange(event: camerachange, callback: EventCallback[VimeoCameraProps]): Unit = js.native
  @JSName("on")
  def on_chapterchange(event: chapterchange, callback: EventCallback[VimeoChapter]): Unit = js.native
  @JSName("on")
  def on_cuechange(event: cuechange, callback: EventCallback[CueChangeEvent]): Unit = js.native
  @JSName("on")
  def on_cuepoint(event: cuepoint, callback: EventCallback[CuePointEvent]): Unit = js.native
  @JSName("on")
  def on_durationchange(event: durationchange, callback: EventCallback[DurationChangeEvent]): Unit = js.native
  @JSName("on")
  def on_ended(event: ended, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_enterpictureinpicture(event: enterpictureinpicture, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("on")
  def on_error(event: error, callback: EventCallback[Error]): Unit = js.native
  @JSName("on")
  def on_fullscreenchange(event: fullscreenchange, callback: EventCallback[FullScreenChangeEvent]): Unit = js.native
  @JSName("on")
  def on_leavepictureinpicture(event: leavepictureinpicture, callback: EventCallback[scala.Nothing]): Unit = js.native
  @JSName("on")
  def on_loaded(event: loaded, callback: EventCallback[LoadedEvent]): Unit = js.native
  @JSName("on")
  def on_pause(event: pause, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_play(event: play, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_playbackratechange(event: playbackratechange, callback: EventCallback[PlaybackRateEvent]): Unit = js.native
  @JSName("on")
  def on_playing(event: playing, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_progress(event: progress, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_qualitychange(event: qualitychange, callback: EventCallback[QualityChangeEvent]): Unit = js.native
  @JSName("on")
  def on_resize(event: resize, callback: EventCallback[ResizeEvent]): Unit = js.native
  @JSName("on")
  def on_seeked(event: seeked, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_seeking(event: seeking, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_texttrackchange(event: texttrackchange, callback: EventCallback[TextTrackChangeEvent]): Unit = js.native
  @JSName("on")
  def on_timeupdate(event: timeupdate, callback: EventCallback[TimeEvent]): Unit = js.native
  @JSName("on")
  def on_volumechange(event: volumechange, callback: EventCallback[VolumeChangeEvent]): Unit = js.native
  
  def pause(): VimeoPromise[Unit, PasswordError | PrivacyError | Error] = js.native
  
  def play(): VimeoPromise[Unit, PasswordError | PrivacyError | Error] = js.native
  
  def ready(): VimeoPromise[Unit, Error] = js.native
  
  def removeCuePoint(id: String): VimeoPromise[String, UnsupportedError | InvalidCuePoint | Error] = js.native
  
  def requestFullscreen(): VimeoPromise[Unit, Error] = js.native
  
  def requestPictureInPicture(): VimeoPromise[Unit, Error] = js.native
  
  def setAutopause(autopause: Boolean): VimeoPromise[Boolean, UnsupportedError | Error] = js.native
  
  def setCameraProps(cameraProps: VimeoCameraProps): VimeoPromise[VimeoCameraProps, RangeError | Error] = js.native
  
  def setColor(color: String): VimeoPromise[String, ContrastError | TypeError | Error] = js.native
  
  def setCurrentTime(seconds: Double): VimeoPromise[Double, RangeError | Error] = js.native
  
  def setLoop(loop: Boolean): VimeoPromise[Boolean, Error] = js.native
  
  def setMuted(muted: Boolean): VimeoPromise[Boolean, Error] = js.native
  
  def setPlaybackRate(playbackRate: Double): VimeoPromise[Double, RangeError | Error] = js.native
  
  def setQuality(quality: VimeoVideoQuality): VimeoPromise[VimeoVideoQuality, TypeError | Error] = js.native
  
  def setVolume(volume: Double): VimeoPromise[Double, RangeError | Error] = js.native
  
  def unload(): VimeoPromise[Unit, Error] = js.native
}
