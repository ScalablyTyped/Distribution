package typings.videoJs.videoCoreNovttMod.default

import typings.videoJs.mod.videojs.AudioTrackOptions
import typings.videoJs.mod.videojs.Track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a single `AudioTrack`. If it is part of an {@link AudioTrackList}
  * only one `AudioTrack` in the list will be enabled at a time.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#audiotrack}
  */
object AudioTrack {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core.novtt", "default.AudioTrack")
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
}
