package typings.winjs.WinJSNs.UINs

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
    val __obj = js.Dynamic.literal(audioTracks = audioTracks, cast = cast, chapterSkipBack = chapterSkipBack, chapterSkipForward = chapterSkipForward, closedCaptions = closedCaptions, fastForward = fastForward, goToLive = goToLive, nextTrack = nextTrack, pause = pause, play = play, playFromBeginning = playFromBeginning, playbackRate = playbackRate, previousTrack = previousTrack, rewind = rewind, seek = seek, stop = stop, timeSkipBack = timeSkipBack, timeSkipForward = timeSkipForward, volume = volume, zoom = zoom)
  
    __obj.asInstanceOf[MediaCommand]
  }
}

