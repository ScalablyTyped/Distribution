package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An enumeration of Media commands that the transport bar buttons support.
  **/
@js.native
trait MediaCommand extends js.Object {
  
  var audioTracks: String = js.native
  
  var cast: String = js.native
  
  var chapterSkipBack: String = js.native
  
  var chapterSkipForward: String = js.native
  
  var closedCaptions: String = js.native
  
  var fastForward: String = js.native
  
  var goToLive: String = js.native
  
  var nextTrack: String = js.native
  
  var pause: String = js.native
  
  var play: String = js.native
  
  var playFromBeginning: String = js.native
  
  var playbackRate: String = js.native
  
  var previousTrack: String = js.native
  
  var rewind: String = js.native
  
  var seek: String = js.native
  
  var stop: String = js.native
  
  var timeSkipBack: String = js.native
  
  var timeSkipForward: String = js.native
  
  var volume: String = js.native
  
  var zoom: String = js.native
}
object MediaCommand {
  
  @scala.inline
  def apply(
    audioTracks: String,
    cast: String,
    chapterSkipBack: String,
    chapterSkipForward: String,
    closedCaptions: String,
    fastForward: String,
    goToLive: String,
    nextTrack: String,
    pause: String,
    play: String,
    playFromBeginning: String,
    playbackRate: String,
    previousTrack: String,
    rewind: String,
    seek: String,
    stop: String,
    timeSkipBack: String,
    timeSkipForward: String,
    volume: String,
    zoom: String
  ): MediaCommand = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], chapterSkipBack = chapterSkipBack.asInstanceOf[js.Any], chapterSkipForward = chapterSkipForward.asInstanceOf[js.Any], closedCaptions = closedCaptions.asInstanceOf[js.Any], fastForward = fastForward.asInstanceOf[js.Any], goToLive = goToLive.asInstanceOf[js.Any], nextTrack = nextTrack.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playFromBeginning = playFromBeginning.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], previousTrack = previousTrack.asInstanceOf[js.Any], rewind = rewind.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], timeSkipBack = timeSkipBack.asInstanceOf[js.Any], timeSkipForward = timeSkipForward.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommand]
  }
  
  @scala.inline
  implicit class MediaCommandOps[Self <: MediaCommand] (val x: Self) extends AnyVal {
    
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
    def setAudioTracks(value: String): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCast(value: String): Self = this.set("cast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapterSkipBack(value: String): Self = this.set("chapterSkipBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapterSkipForward(value: String): Self = this.set("chapterSkipForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptions(value: String): Self = this.set("closedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastForward(value: String): Self = this.set("fastForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToLive(value: String): Self = this.set("goToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTrack(value: String): Self = this.set("nextTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: String): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: String): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayFromBeginning(value: String): Self = this.set("playFromBeginning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRate(value: String): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTrack(value: String): Self = this.set("previousTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewind(value: String): Self = this.set("rewind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: String): Self = this.set("seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: String): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSkipBack(value: String): Self = this.set("timeSkipBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSkipForward(value: String): Self = this.set("timeSkipForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: String): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: String): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
