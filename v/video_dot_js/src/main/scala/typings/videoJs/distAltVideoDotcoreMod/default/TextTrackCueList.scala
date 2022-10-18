package typings.videoJs.distAltVideoDotcoreMod.default

import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextTrackCueList {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core", "default.TextTrackCueList")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.videoJs.mod.videojs.TextTrackCueList {
    /**
      * Create an instance of this class..
      *
      * @param cues
      *        A list of cues to be initialized with
      */
    def this(cues: js.Array[TextTrackCue]) = this()
    
    /**
      * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
      *
      * @param id
      *        The id of the cue that should be searched for.
      *
      * @return A single cue or null if none was found.
      */
    /* CompleteClass */
    override def getCueById(id: String): TextTrackCue = js.native
    
    /**
      * The current number of `TextTrackCue`s in the TextTrackCueList.
      */
    /* CompleteClass */
    var length: Double = js.native
  }
}
