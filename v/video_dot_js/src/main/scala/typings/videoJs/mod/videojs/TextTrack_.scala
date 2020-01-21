package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Mode
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of this class.
  *
  * @param options={}
  *        Object of option names and values
  *
  * @param options.tech
  *        A reference to the tech that owns this TextTrack.
  *
  * @param [options.kind='subtitles']
  *        A valid text track kind.
  *
  * @param [options.mode='disabled']
  *        A valid text track mode.
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this TextTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.srclang='']
  *        A valid two character language code. An alternative, but deprioritized
  *        version of `options.language`
  *
  * @param [options.src]
  *        A url to TextTrack cues.
  *
  * @param [options.default]
  *        If this track should default to on or off.
  */
@js.native
trait TextTrack_ extends Track {
  /**
    * The list text track cues that are currently active for this TextTrack.
    */
  var activeCues: TextTrackCueList = js.native
  /**
    * @The text track cue list for this TextTrack.
    */
  var cues: TextTrackCueList = js.native
  /**
    * If this track was set to be on or off by default. Cannot be changed after creation.
    */
  val default: Boolean = js.native
  /**
    * Set the mode of this TextTrack to a valid {@link TextTrack~Mode}. Will
    * not be set if setting to an invalid mode.
    * @fires TextTrack#modechange
    */
  var mode: Mode = js.native
  /**
    * Add a cue to the internal list of cues.
    *
    * @param cue
    *        The cue to add to our internal list
    */
  def addCue(cue: TextTrackCue): Unit = js.native
  /**
    * Remove a cue from our internal list
    *
    * @param cue
    *        The cue to remove from our internal list
    */
  def removeCue(cue: TextTrackCue): Unit = js.native
}

