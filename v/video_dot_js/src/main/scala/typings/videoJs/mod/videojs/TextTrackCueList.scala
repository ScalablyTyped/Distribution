package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A List of TextTrackCues.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcuelist}
  */
@js.native
trait TextTrackCueList
  extends /**
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
  def getCueById(id: String): TextTrackCue = js.native
  
  /**
    * The current number of `TextTrackCue`s in the TextTrackCueList.
    */
  var length: Double = js.native
}
object TextTrackCueList {
  
  @scala.inline
  def apply(getCueById: String => TextTrackCue, length: Double): TextTrackCueList = {
    val __obj = js.Dynamic.literal(getCueById = js.Any.fromFunction1(getCueById), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueList]
  }
  
  /**
    * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
    */
  @js.native
  trait TextTrackCue extends StObject {
    
    /**
      * The end time for this text track cue
      */
    var endTime: Double = js.native
    
    /**
      * The unique id for this text track cue
      */
    var id: String = js.native
    
    /**
      * Pause when the end time is reached if true.
      */
    var pauseOnExit: Boolean = js.native
    
    /**
      * The start time for this text track cue
      */
    var startTime: Double = js.native
    
    /**
      * The text this cue is holding
      */
    var text: String = js.native
  }
  object TextTrackCue {
    
    @scala.inline
    def apply(endTime: Double, id: String, pauseOnExit: Boolean, startTime: Double, text: String): TextTrackCue = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pauseOnExit = pauseOnExit.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextTrackCue]
    }
    
    @scala.inline
    implicit class TextTrackCueMutableBuilder[Self <: TextTrackCue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnExit(value: Boolean): Self = StObject.set(x, "pauseOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  implicit class TextTrackCueListMutableBuilder[Self <: TextTrackCueList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCueById(value: String => TextTrackCue): Self = StObject.set(x, "getCueById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
