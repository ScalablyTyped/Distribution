package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration of Media commands that the transport bar buttons support.
  **/
trait MediaCommand extends js.Object {
  var audioTracks: String
  var cast: String
  var chapterSkipBack: String
  var chapterSkipForward: String
  var closedCaptions: String
  var fastForward: String
  var goToLive: String
  var nextTrack: String
  var pause: String
  var play: String
  var playFromBeginning: String
  var playbackRate: String
  var previousTrack: String
  var rewind: String
  var seek: String
  var stop: String
  var timeSkipBack: String
  var timeSkipForward: String
  var volume: String
  var zoom: String
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
}

