package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A List of TextTrackCues.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcuelist}
  */
trait TextTrackCueList
  extends StObject
     with /**
  * Index getters for the cues.
  *
  * @param index
  */
/* index */ NumberDictionary[TextTrackCue] {
  
  /**
    * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    *
    * @param id
    *        The id of the cue that should be searched for.
    *
    * @return A single cue or null if none was found.
    */
  def getCueById(id: String): TextTrackCue
  
  /**
    * The current number of `TextTrackCue`s in the TextTrackCueList.
    */
  var length: Double
}
object TextTrackCueList {
  
  inline def apply(getCueById: String => TextTrackCue, length: Double): TextTrackCueList = {
    val __obj = js.Dynamic.literal(getCueById = js.Any.fromFunction1(getCueById), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueList]
  }
  
  extension [Self <: TextTrackCueList](x: Self) {
    
    inline def setGetCueById(value: String => TextTrackCue): Self = StObject.set(x, "getCueById", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
  
  /**
    * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
    */
  trait TextTrackCue extends StObject {
    
    /**
      * The end time for this text track cue
      */
    var endTime: Double
    
    /**
      * The unique id for this text track cue
      */
    var id: String
    
    /**
      * Pause when the end time is reached if true.
      */
    var pauseOnExit: Boolean
    
    /**
      * The start time for this text track cue
      */
    var startTime: Double
    
    /**
      * The text this cue is holding
      */
    var text: String
  }
  object TextTrackCue {
    
    inline def apply(endTime: Double, id: String, pauseOnExit: Boolean, startTime: Double, text: String): TextTrackCue = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pauseOnExit = pauseOnExit.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextTrackCue]
    }
    
    extension [Self <: TextTrackCue](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPauseOnExit(value: Boolean): Self = StObject.set(x, "pauseOnExit", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
