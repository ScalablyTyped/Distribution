package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.TextTrackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextTrack {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js", "default.TextTrack")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.videoJs.mod.videojs.TextTrack {
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
    def this(options: TextTrackOptions) = this()
  }
}
