package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Triggered when some kind of error is generated in the player. In general if you are using this API library, you should use `.catch()` on each method call instead of globally listening for
    * error events.
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
    * Triggered when the playback rate of the video in the player changes. The ability to change rate can be disabled by the creator and the event will not fire for those videos. The new playback
    * rate is returned with the event.
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
  
  extension [Self <: EventMap](x: Self) {
    
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
