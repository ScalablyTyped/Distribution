package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Mode
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait TextTrack
  extends StObject
     with Track {
  
  /**
    * If this track was set to be on or off by default. Cannot be changed after creation.
    */
  val default: Boolean = js.native
  
  /**
    * The list text track cues that are currently active for this TextTrack.
    */
  var activeCues: TextTrackCueList = js.native
  
  /**
    * Add a cue to the internal list of cues.
    *
    * @param cue
    *        The cue to add to our internal list
    */
  def addCue(cue: TextTrackCue): Unit = js.native
  
  /**
    * @The text track cue list for this TextTrack.
    */
  var cues: TextTrackCueList = js.native
  
  /**
    * Set the mode of this TextTrack to a valid {@link TextTrack~Mode}. Will
    * not be set if setting to an invalid mode.
    * @fires TextTrack#modechange
    */
  var mode: Mode = js.native
  
  /**
    * Remove a cue from our internal list
    *
    * @param cue
    *        The cue to remove from our internal list
    */
  def removeCue(cue: TextTrackCue): Unit = js.native
}
object TextTrack {
  
  /* Rewritten from type alias, can be one of: 
    - typings.videoJs.videoJsStrings.subtitles
    - typings.videoJs.videoJsStrings.captions
    - typings.videoJs.videoJsStrings.descriptions
    - typings.videoJs.videoJsStrings.chapters
    - typings.videoJs.videoJsStrings.metadata
  */
  trait Kind extends StObject
  object Kind {
    
    @scala.inline
    def captions: typings.videoJs.videoJsStrings.captions = "captions".asInstanceOf[typings.videoJs.videoJsStrings.captions]
    
    @scala.inline
    def chapters: typings.videoJs.videoJsStrings.chapters = "chapters".asInstanceOf[typings.videoJs.videoJsStrings.chapters]
    
    @scala.inline
    def descriptions: typings.videoJs.videoJsStrings.descriptions = "descriptions".asInstanceOf[typings.videoJs.videoJsStrings.descriptions]
    
    @scala.inline
    def metadata: typings.videoJs.videoJsStrings.metadata = "metadata".asInstanceOf[typings.videoJs.videoJsStrings.metadata]
    
    @scala.inline
    def subtitles: typings.videoJs.videoJsStrings.subtitles = "subtitles".asInstanceOf[typings.videoJs.videoJsStrings.subtitles]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.videoJs.videoJsStrings.disabled
    - typings.videoJs.videoJsStrings.hidden
    - typings.videoJs.videoJsStrings.showing
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def disabled: typings.videoJs.videoJsStrings.disabled = "disabled".asInstanceOf[typings.videoJs.videoJsStrings.disabled]
    
    @scala.inline
    def hidden: typings.videoJs.videoJsStrings.hidden = "hidden".asInstanceOf[typings.videoJs.videoJsStrings.hidden]
    
    @scala.inline
    def showing: typings.videoJs.videoJsStrings.showing = "showing".asInstanceOf[typings.videoJs.videoJsStrings.showing]
  }
}
