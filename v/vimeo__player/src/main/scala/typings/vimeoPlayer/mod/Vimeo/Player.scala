package typings.vimeoPlayer.mod.Vimeo

import org.scalablytyped.runtime.StringDictionary
import typings.vimeoPlayer.mod.Vimeo.Player.CueChangeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.CuePointEvent
import typings.vimeoPlayer.mod.Vimeo.Player.DurationChangeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.Error
import typings.vimeoPlayer.mod.Vimeo.Player.EventCallback
import typings.vimeoPlayer.mod.Vimeo.Player.FullScreenChangeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.LoadedEvent
import typings.vimeoPlayer.mod.Vimeo.Player.Options
import typings.vimeoPlayer.mod.Vimeo.Player.PlaybackRateEvent
import typings.vimeoPlayer.mod.Vimeo.Player.QualityChangeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.ResizeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.TextTrackChangeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.TimeEvent
import typings.vimeoPlayer.mod.Vimeo.Player.TrackKind
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoCameraProps
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoChapter
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoCuePoint
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoCuePointData
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoTextTrack
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoTimeRange
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoVideoQuality
import typings.vimeoPlayer.mod.Vimeo.Player.VimeoVideoQualityObject
import typings.vimeoPlayer.mod.Vimeo.Player.VolumeChangeEvent
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

@js.native
trait Player extends StObject {
  
  def addCuePoint(time: Double, data: VimeoCuePointData): js.Promise[String] = js.native
  
  def destroy(): js.Promise[Unit] = js.native
  
  def disableTextTrack(): js.Promise[Unit] = js.native
  
  def enableTextTrack(language: String): js.Promise[VimeoTextTrack] = js.native
  def enableTextTrack(language: String, kind: TrackKind): js.Promise[VimeoTextTrack] = js.native
  
  def exitFullscreen(): js.Promise[Unit] = js.native
  
  def exitPictureInPicture(): js.Promise[Unit] = js.native
  
  def getAutopause(): js.Promise[Boolean] = js.native
  
  def getBuffered(): js.Promise[js.Array[VimeoTimeRange]] = js.native
  
  def getCameraProps(): js.Promise[VimeoCameraProps] = js.native
  
  def getChapters(): js.Promise[js.Array[VimeoChapter]] = js.native
  
  def getColor(): js.Promise[String] = js.native
  
  def getCuePoints(): js.Promise[js.Array[VimeoCuePoint]] = js.native
  
  def getCurrentChapter(): js.Promise[VimeoChapter] = js.native
  
  def getCurrentTime(): js.Promise[Double] = js.native
  
  def getDuration(): js.Promise[Double] = js.native
  
  def getEnded(): js.Promise[Boolean] = js.native
  
  def getFullscreen(): js.Promise[Boolean] = js.native
  
  def getLoop(): js.Promise[Boolean] = js.native
  
  def getMuted(): js.Promise[Boolean] = js.native
  
  def getPaused(): js.Promise[Boolean] = js.native
  
  def getPictureInPicture(): js.Promise[Boolean] = js.native
  
  def getPlaybackRate(): js.Promise[Double] = js.native
  
  def getPlayed(): js.Promise[js.Array[VimeoTimeRange]] = js.native
  
  def getQualities(): js.Promise[js.Array[VimeoVideoQualityObject]] = js.native
  
  def getQuality(): js.Promise[VimeoVideoQuality] = js.native
  
  def getSeekable(): js.Promise[js.Array[VimeoTimeRange]] = js.native
  
  def getSeeking(): js.Promise[Boolean] = js.native
  
  def getTextTracks(): js.Promise[js.Array[VimeoTextTrack]] = js.native
  
  def getVideoEmbedCode(): js.Promise[String] = js.native
  
  def getVideoHeight(): js.Promise[Double] = js.native
  
  def getVideoId(): js.Promise[Double] = js.native
  
  def getVideoTitle(): js.Promise[String] = js.native
  
  def getVideoUrl(): js.Promise[String] = js.native
  
  def getVideoWidth(): js.Promise[Double] = js.native
  
  def getVolume(): js.Promise[Double] = js.native
  
  def loadVideo(id: Double): js.Promise[Double] = js.native
  def loadVideo(options: Options): js.Promise[StringDictionary[Any]] = js.native
  def loadVideo(url: String): js.Promise[String] = js.native
  
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
  
  def pause(): js.Promise[Unit] = js.native
  
  def play(): js.Promise[Unit] = js.native
  
  def ready(): js.Promise[Unit] = js.native
  
  def removeCuePoint(id: String): js.Promise[String] = js.native
  
  def requestFullscreen(): js.Promise[Unit] = js.native
  
  def requestPictureInPicture(): js.Promise[Unit] = js.native
  
  def setAutopause(autopause: Boolean): js.Promise[Boolean] = js.native
  
  def setCameraProps(cameraProps: VimeoCameraProps): js.Promise[VimeoCameraProps] = js.native
  
  def setColor(color: String): js.Promise[String] = js.native
  
  def setCurrentTime(seconds: Double): js.Promise[Double] = js.native
  
  def setLoop(loop: Boolean): js.Promise[Boolean] = js.native
  
  def setMuted(muted: Boolean): js.Promise[Boolean] = js.native
  
  def setPlaybackRate(playbackRate: Double): js.Promise[Double] = js.native
  
  def setQuality(quality: VimeoVideoQuality): js.Promise[VimeoVideoQuality] = js.native
  
  def setVolume(volume: Double): js.Promise[Double] = js.native
  
  def unload(): js.Promise[Unit] = js.native
}
object Player {
  
  trait Cue extends StObject {
    
    /**
      * The `html` property contains the HTML that the Player renders for that cue.
      */
    var html: String
    
    /**
      * The `text` property of each cue is the raw value parsed from the caption or subtitle file.
      */
    var text: String
  }
  object Cue {
    
    inline def apply(html: String, text: String): Cue = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cue] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait CueChangeEvent extends StObject {
    
    var cues: js.Array[Cue]
    
    var kind: TrackKind
    
    var label: String
    
    var language: String
  }
  object CueChangeEvent {
    
    inline def apply(cues: js.Array[Cue], kind: TrackKind, label: String, language: String): CueChangeEvent = {
      val __obj = js.Dynamic.literal(cues = cues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[CueChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CueChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setCues(value: js.Array[Cue]): Self = StObject.set(x, "cues", value.asInstanceOf[js.Any])
      
      inline def setCuesVarargs(value: Cue*): Self = StObject.set(x, "cues", js.Array(value*))
      
      inline def setKind(value: TrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait CuePointEvent extends StObject {
    
    /**
      * The `data` property will be the custom data provided in the `addCuePoint()` call, or an empty object if none was provided.
      */
    var data: VimeoCuePointData
    
    var id: String
    
    var time: Double
  }
  object CuePointEvent {
    
    inline def apply(data: VimeoCuePointData, id: String, time: Double): CuePointEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CuePointEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CuePointEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: VimeoCuePointData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait DurationChangeEvent extends StObject {
    
    var duration: Double
  }
  object DurationChangeEvent {
    
    inline def apply(duration: Double): DurationChangeEvent = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DurationChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var message: String
    
    var method: String
    
    var name: String
  }
  object Error {
    
    inline def apply(message: String, method: String, name: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type EventCallback[Data] = js.Function1[/* data */ Data, Any]
  
  trait EventMap extends StObject {
    
    /**
      * Triggered when any of the camera properties change for 360° videos.
      */
    var camerachange: VimeoCameraProps
    
    /**
      * Triggered when the current chapter changes.
      */
    var chapterchange: VimeoChapter
    
    /**
      * Triggered when the active cue for the current text track changes. It also fires when the active text track changes. There may be multiple cues active.
      */
    var cuechange: CueChangeEvent
    
    /**
      * Triggered when the current time hits a registered cue point.
      */
    var cuepoint: CuePointEvent
    
    /**
      * Triggered when the duration attribute has been updated.
      */
    var durationchange: DurationChangeEvent
    
    /**
      * Triggered any time the video playback reaches the end. _Note_: when loop is turned on, the ended `event` will not fire.
      */
    var ended: TimeEvent
    
    /**
      * Triggered when some kind of error is generated in the player. In general if you are using this API library, you should use `.catch()` on each method call instead of globally listening
      * for error events.
      *
      * If the error was generated from a method call, the name of that method will be included.
      */
    var error: Error
    
    /**
      * Triggered when the player enters or exits fullscreen.
      */
    var fullscreenchange: FullScreenChangeEvent
    
    /**
      * Triggered when a new video is loaded in the player.
      */
    var loaded: LoadedEvent
    
    /**
      * Triggered when the video pauses.
      */
    var pause: TimeEvent
    
    /**
      * Triggered when video playback is initiated.
      */
    var play: TimeEvent
    
    /**
      * Triggered when the playback rate of the video in the player changes. The ability to change rate can be disabled by the creator and the event will not fire for those videos. The new
      * playback rate is returned with the event.
      */
    var playbackratechange: PlaybackRateEvent
    
    /**
      * Triggered when the video starts playing.
      */
    var playing: TimeEvent
    
    /**
      * Triggered as the video is loaded. Reports back the amount of the video that has been buffered.
      */
    var progress: TimeEvent
    
    /**
      * Triggered when the set quality changes.
      */
    var qualitychange: QualityChangeEvent
    
    /**
      * Triggered when the intrinsic size of the media changes.
      */
    var resize: ResizeEvent
    
    /**
      * Triggered when the player seeks to a specific time. A `timeupdate` event will also be fired at the same time.
      */
    var seeked: TimeEvent
    
    /**
      * Triggered when the player starts seeking to a specific time. A `timeupdate` event will also be fired at the same time.
      */
    var seeking: TimeEvent
    
    /**
      * Triggered when the active text track (captions/subtitles) changes. The values will be null if text tracks are turned off.
      */
    var texttrackchange: TextTrackChangeEvent
    
    /**
      * Triggered as the `currentTime` of the video updates. It generally fires every 250ms, but it may vary depending on the browser.
      */
    var timeupdate: TimeEvent
    
    /**
      * Triggered when the volume in the player changes. Some devices do not support setting the volume of the video independently from the system volume, so this event will never fire on those
      * devices.
      */
    var volumechange: VolumeChangeEvent
  }
  object EventMap {
    
    inline def apply(
      camerachange: VimeoCameraProps,
      chapterchange: VimeoChapter,
      cuechange: CueChangeEvent,
      cuepoint: CuePointEvent,
      durationchange: DurationChangeEvent,
      ended: TimeEvent,
      error: Error,
      fullscreenchange: FullScreenChangeEvent,
      loaded: LoadedEvent,
      pause: TimeEvent,
      play: TimeEvent,
      playbackratechange: PlaybackRateEvent,
      playing: TimeEvent,
      progress: TimeEvent,
      qualitychange: QualityChangeEvent,
      resize: ResizeEvent,
      seeked: TimeEvent,
      seeking: TimeEvent,
      texttrackchange: TextTrackChangeEvent,
      timeupdate: TimeEvent,
      volumechange: VolumeChangeEvent
    ): EventMap = {
      val __obj = js.Dynamic.literal(camerachange = camerachange.asInstanceOf[js.Any], chapterchange = chapterchange.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cuepoint = cuepoint.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playbackratechange = playbackratechange.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], qualitychange = qualitychange.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], texttrackchange = texttrackchange.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setCamerachange(value: VimeoCameraProps): Self = StObject.set(x, "camerachange", value.asInstanceOf[js.Any])
      
      inline def setChapterchange(value: VimeoChapter): Self = StObject.set(x, "chapterchange", value.asInstanceOf[js.Any])
      
      inline def setCuechange(value: CueChangeEvent): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      inline def setCuepoint(value: CuePointEvent): Self = StObject.set(x, "cuepoint", value.asInstanceOf[js.Any])
      
      inline def setDurationchange(value: DurationChangeEvent): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: TimeEvent): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFullscreenchange(value: FullScreenChangeEvent): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: LoadedEvent): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setPause(value: TimeEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: TimeEvent): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlaybackratechange(value: PlaybackRateEvent): Self = StObject.set(x, "playbackratechange", value.asInstanceOf[js.Any])
      
      inline def setPlaying(value: TimeEvent): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: TimeEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setQualitychange(value: QualityChangeEvent): Self = StObject.set(x, "qualitychange", value.asInstanceOf[js.Any])
      
      inline def setResize(value: ResizeEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setSeeked(value: TimeEvent): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      inline def setSeeking(value: TimeEvent): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setTexttrackchange(value: TextTrackChangeEvent): Self = StObject.set(x, "texttrackchange", value.asInstanceOf[js.Any])
      
      inline def setTimeupdate(value: TimeEvent): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      inline def setVolumechange(value: VolumeChangeEvent): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullScreenChangeEvent extends StObject {
    
    var fullscreen: Boolean
  }
  object FullScreenChangeEvent {
    
    inline def apply(fullscreen: Boolean): FullScreenChangeEvent = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullScreenChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullScreenChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedEvent extends StObject {
    
    var id: Double
  }
  object LoadedEvent {
    
    inline def apply(id: Double): LoadedEvent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadedEvent] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var autopause: js.UndefOr[Boolean] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[Boolean] = js.undefined
    
    var byline: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var dnt: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var interactive_params: js.UndefOr[String] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maxheight: js.UndefOr[Double] = js.undefined
    
    var maxwidth: js.UndefOr[Double] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var pip: js.UndefOr[Boolean] = js.undefined
    
    var playsinline: js.UndefOr[Boolean] = js.undefined
    
    var portrait: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[VimeoVideoQuality] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Boolean] = js.undefined
    
    var texttrack: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutopause(value: Boolean): Self = StObject.set(x, "autopause", value.asInstanceOf[js.Any])
      
      inline def setAutopauseUndefined: Self = StObject.set(x, "autopause", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setByline(value: Boolean): Self = StObject.set(x, "byline", value.asInstanceOf[js.Any])
      
      inline def setBylineUndefined: Self = StObject.set(x, "byline", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDnt(value: Boolean): Self = StObject.set(x, "dnt", value.asInstanceOf[js.Any])
      
      inline def setDntUndefined: Self = StObject.set(x, "dnt", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInteractive_params(value: String): Self = StObject.set(x, "interactive_params", value.asInstanceOf[js.Any])
      
      inline def setInteractive_paramsUndefined: Self = StObject.set(x, "interactive_params", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxheight(value: Double): Self = StObject.set(x, "maxheight", value.asInstanceOf[js.Any])
      
      inline def setMaxheightUndefined: Self = StObject.set(x, "maxheight", js.undefined)
      
      inline def setMaxwidth(value: Double): Self = StObject.set(x, "maxwidth", value.asInstanceOf[js.Any])
      
      inline def setMaxwidthUndefined: Self = StObject.set(x, "maxwidth", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPip(value: Boolean): Self = StObject.set(x, "pip", value.asInstanceOf[js.Any])
      
      inline def setPipUndefined: Self = StObject.set(x, "pip", js.undefined)
      
      inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setPortrait(value: Boolean): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
      
      inline def setPortraitUndefined: Self = StObject.set(x, "portrait", js.undefined)
      
      inline def setQuality(value: VimeoVideoQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSpeed(value: Boolean): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTexttrack(value: String): Self = StObject.set(x, "texttrack", value.asInstanceOf[js.Any])
      
      inline def setTexttrackUndefined: Self = StObject.set(x, "texttrack", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PlaybackRateEvent extends StObject {
    
    var playbackRate: Double
  }
  object PlaybackRateEvent {
    
    inline def apply(playbackRate: Double): PlaybackRateEvent = {
      val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackRateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaybackRateEvent] (val x: Self) extends AnyVal {
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    }
  }
  
  trait QualityChangeEvent extends StObject {
    
    var quality: VimeoVideoQuality
  }
  object QualityChangeEvent {
    
    inline def apply(quality: VimeoVideoQuality): QualityChangeEvent = {
      val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualityChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QualityChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: VimeoVideoQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeEvent extends StObject {
    
    var videoHeight: Double
    
    var videoWidth: Double
  }
  object ResizeEvent {
    
    inline def apply(videoHeight: Double, videoWidth: Double): ResizeEvent = {
      val __obj = js.Dynamic.literal(videoHeight = videoHeight.asInstanceOf[js.Any], videoWidth = videoWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeEvent] (val x: Self) extends AnyVal {
      
      inline def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      inline def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextTrackChangeEvent extends StObject {
    
    var kind: TrackKind | Null
    
    var label: String | Null
    
    var language: String | Null
  }
  object TextTrackChangeEvent {
    
    inline def apply(): TextTrackChangeEvent = {
      val __obj = js.Dynamic.literal(kind = null, label = null, language = null)
      __obj.asInstanceOf[TextTrackChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextTrackChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setKind(value: TrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindNull: Self = StObject.set(x, "kind", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageNull: Self = StObject.set(x, "language", null)
    }
  }
  
  trait TimeEvent extends StObject {
    
    var duration: Double
    
    var percent: Double
    
    var seconds: Double
  }
  object TimeEvent {
    
    inline def apply(duration: Double, percent: Double, seconds: Double): TimeEvent = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeEvent] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vimeoPlayer.vimeoPlayerStrings.captions
    - typings.vimeoPlayer.vimeoPlayerStrings.subtitles
  */
  trait TrackKind extends StObject
  object TrackKind {
    
    inline def captions: typings.vimeoPlayer.vimeoPlayerStrings.captions = "captions".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.captions]
    
    inline def subtitles: typings.vimeoPlayer.vimeoPlayerStrings.subtitles = "subtitles".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.subtitles]
  }
  
  trait VimeoCameraProps extends StObject {
    
    var fov: Double
    
    var pitch: Double
    
    var roll: Double
    
    var yaw: Double
  }
  object VimeoCameraProps {
    
    inline def apply(fov: Double, pitch: Double, roll: Double, yaw: Double): VimeoCameraProps = {
      val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
      __obj.asInstanceOf[VimeoCameraProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VimeoCameraProps] (val x: Self) extends AnyVal {
      
      inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    }
  }
  
  trait VimeoChapter extends StObject {
    
    /**
      * The `index` property of each chapter is the place it holds in the order of all the chapters. It starts at 1.
      */
    var index: Double
    
    var startTime: Double
    
    var title: String
  }
  object VimeoChapter {
    
    inline def apply(index: Double, startTime: Double, title: String): VimeoChapter = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[VimeoChapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VimeoChapter] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait VimeoCuePoint extends StObject {
    
    var data: VimeoCuePointData
    
    var id: String
    
    var time: Double
  }
  object VimeoCuePoint {
    
    inline def apply(data: VimeoCuePointData, id: String, time: Double): VimeoCuePoint = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[VimeoCuePoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VimeoCuePoint] (val x: Self) extends AnyVal {
      
      inline def setData(value: VimeoCuePointData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  type VimeoCuePointData = StringDictionary[Any]
  
  trait VimeoTextTrack extends StObject {
    
    var kind: TrackKind
    
    var label: String
    
    var language: String
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object VimeoTextTrack {
    
    inline def apply(kind: TrackKind, label: String, language: String): VimeoTextTrack = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[VimeoTextTrack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VimeoTextTrack] (val x: Self) extends AnyVal {
      
      inline def setKind(value: TrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  type VimeoTimeRange = js.Tuple2[Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vimeoPlayer.vimeoPlayerStrings.auto
    - typings.vimeoPlayer.vimeoPlayerStrings.`4K`
    - typings.vimeoPlayer.vimeoPlayerStrings.`2K`
    - typings.vimeoPlayer.vimeoPlayerStrings.`1080p`
    - typings.vimeoPlayer.vimeoPlayerStrings.`720p`
    - typings.vimeoPlayer.vimeoPlayerStrings.`540p`
    - typings.vimeoPlayer.vimeoPlayerStrings.`360p`
    - typings.vimeoPlayer.vimeoPlayerStrings.`240p`
  */
  trait VimeoVideoQuality extends StObject
  object VimeoVideoQuality {
    
    inline def `1080p`: typings.vimeoPlayer.vimeoPlayerStrings.`1080p` = "1080p".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`1080p`]
    
    inline def `240p`: typings.vimeoPlayer.vimeoPlayerStrings.`240p` = "240p".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`240p`]
    
    inline def `2K`: typings.vimeoPlayer.vimeoPlayerStrings.`2K` = "2K".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`2K`]
    
    inline def `360p`: typings.vimeoPlayer.vimeoPlayerStrings.`360p` = "360p".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`360p`]
    
    inline def `4K`: typings.vimeoPlayer.vimeoPlayerStrings.`4K` = "4K".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`4K`]
    
    inline def `540p`: typings.vimeoPlayer.vimeoPlayerStrings.`540p` = "540p".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`540p`]
    
    inline def `720p`: typings.vimeoPlayer.vimeoPlayerStrings.`720p` = "720p".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.`720p`]
    
    inline def auto: typings.vimeoPlayer.vimeoPlayerStrings.auto = "auto".asInstanceOf[typings.vimeoPlayer.vimeoPlayerStrings.auto]
  }
  
  trait VimeoVideoQualityObject extends StObject {
    
    var active: Boolean
    
    var id: String
    
    var label: String
  }
  object VimeoVideoQualityObject {
    
    inline def apply(active: Boolean, id: String, label: String): VimeoVideoQualityObject = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[VimeoVideoQualityObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VimeoVideoQualityObject] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait VolumeChangeEvent extends StObject {
    
    var volume: Double
  }
  object VolumeChangeEvent {
    
    inline def apply(volume: Double): VolumeChangeEvent = {
      val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[VolumeChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VolumeChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
}
