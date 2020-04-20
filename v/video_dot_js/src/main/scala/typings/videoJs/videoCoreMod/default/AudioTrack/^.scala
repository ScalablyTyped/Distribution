package typings.videoJs.videoCoreMod.default.AudioTrack

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.videoJs.mod.videojs.AudioTrackOptions
import typings.videoJs.mod.videojs.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "AudioTrack")
@js.native
/**
  * Create an instance of this class.
  *
  * @param [options={}]
  *        Object of option names and values
  *
  * @param [options.kind='']
  *        A valid audio track kind
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this AudioTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.enabled]
  *        If this track is the one that is currently playing. If this track is part of
  *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
  */
class ^ () extends Track {
  def this(options: AudioTrackOptions) = this()
}

@JSImport("video.js/dist/alt/video.core", "AudioTrack")
@js.native
object ^
  extends TopLevel[
      (/**
  * Create an instance of this class.
  *
  * @param [options={}]
  *        Object of option names and values
  *
  * @param [options.kind='']
  *        A valid audio track kind
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this AudioTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.enabled]
  *        If this track is the one that is currently playing. If this track is part of
  *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
  */
Instantiable0[Track]) with (Instantiable1[/* options */ AudioTrackOptions, Track])
    ]

