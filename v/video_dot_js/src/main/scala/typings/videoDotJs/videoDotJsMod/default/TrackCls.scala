package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Track
import typings.videoDotJs.videoDotJsMod.videojs.TrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Track")
@js.native
/**
  * Create an instance of this class.
  *
  * @param [options={}]
  *        Object of option names and values
  *
  * @param [options.kind='']
  *        A valid kind for the track type you are creating.
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this AudioTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  */
class TrackCls () extends Track {
  def this(options: TrackOptions) = this()
}

