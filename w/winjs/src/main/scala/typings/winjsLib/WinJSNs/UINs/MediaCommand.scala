package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration of Media commands that the transport bar buttons support.
  **/
trait MediaCommand extends js.Object {
  var audioTracks: java.lang.String
  var cast: java.lang.String
  var chapterSkipBack: java.lang.String
  var chapterSkipForward: java.lang.String
  var closedCaptions: java.lang.String
  var fastForward: java.lang.String
  var goToLive: java.lang.String
  var nextTrack: java.lang.String
  var pause: java.lang.String
  var play: java.lang.String
  var playFromBeginning: java.lang.String
  var playbackRate: java.lang.String
  var previousTrack: java.lang.String
  var rewind: java.lang.String
  var seek: java.lang.String
  var stop: java.lang.String
  var timeSkipBack: java.lang.String
  var timeSkipForward: java.lang.String
  var volume: java.lang.String
  var zoom: java.lang.String
}

object MediaCommand {
  @scala.inline
  def apply(
    audioTracks: java.lang.String,
    cast: java.lang.String,
    chapterSkipBack: java.lang.String,
    chapterSkipForward: java.lang.String,
    closedCaptions: java.lang.String,
    fastForward: java.lang.String,
    goToLive: java.lang.String,
    nextTrack: java.lang.String,
    pause: java.lang.String,
    play: java.lang.String,
    playFromBeginning: java.lang.String,
    playbackRate: java.lang.String,
    previousTrack: java.lang.String,
    rewind: java.lang.String,
    seek: java.lang.String,
    stop: java.lang.String,
    timeSkipBack: java.lang.String,
    timeSkipForward: java.lang.String,
    volume: java.lang.String,
    zoom: java.lang.String
  ): MediaCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioTracks")(audioTracks)
    __obj.updateDynamic("cast")(cast)
    __obj.updateDynamic("chapterSkipBack")(chapterSkipBack)
    __obj.updateDynamic("chapterSkipForward")(chapterSkipForward)
    __obj.updateDynamic("closedCaptions")(closedCaptions)
    __obj.updateDynamic("fastForward")(fastForward)
    __obj.updateDynamic("goToLive")(goToLive)
    __obj.updateDynamic("nextTrack")(nextTrack)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playFromBeginning")(playFromBeginning)
    __obj.updateDynamic("playbackRate")(playbackRate)
    __obj.updateDynamic("previousTrack")(previousTrack)
    __obj.updateDynamic("rewind")(rewind)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("timeSkipBack")(timeSkipBack)
    __obj.updateDynamic("timeSkipForward")(timeSkipForward)
    __obj.updateDynamic("volume")(volume)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[MediaCommand]
  }
}

