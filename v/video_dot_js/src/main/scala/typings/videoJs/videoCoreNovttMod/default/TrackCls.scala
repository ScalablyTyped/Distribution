package typings.videoJs.videoCoreNovttMod.default

import typings.videoJs.mod.videojs.Track
import typings.videoJs.mod.videojs.TrackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/alt/video.core.novtt", "default.Track")
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
class TrackCls ()
  extends StObject
     with Track {
  def this(options: TrackOptions) = this()
}
