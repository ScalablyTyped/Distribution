package typings.webAnimationsJs

import typings.std.AnimationEffect
import typings.std.KeyframeEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Animation")
  @js.native
  class Animation ()
    extends StObject
       with typings.webAnimationsJs.Animation {
    def this(effect: AnimationEffect) = this()
    def this(effect: Null, timeline: AnimationTimeline) = this()
    def this(effect: Unit, timeline: AnimationTimeline) = this()
    def this(effect: AnimationEffect, timeline: AnimationTimeline) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AnimationPlaybackEvent")
  @js.native
  class AnimationPlaybackEvent protected ()
    extends StObject
       with typings.webAnimationsJs.AnimationPlaybackEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: AnimationPlaybackEventInit) = this()
    
    /* CompleteClass */
    var bubbles: Boolean = js.native
    
    /* CompleteClass */
    var cancelable: Boolean = js.native
    
    /* CompleteClass */
    var currentTarget: typings.webAnimationsJs.Animation = js.native
    
    /* CompleteClass */
    override val currentTime: Double | Null = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /* CompleteClass */
    var eventPhase: Double = js.native
    
    /* CompleteClass */
    var target: typings.webAnimationsJs.Animation = js.native
    
    /* CompleteClass */
    var timeStamp: Double = js.native
    
    /* CompleteClass */
    override val timelineTime: Double | Null = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @JSGlobal("GroupEffect")
  @js.native
  class GroupEffect protected ()
    extends StObject
       with KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
  
  @JSGlobal("SequenceEffect")
  @js.native
  class SequenceEffect protected ()
    extends StObject
       with KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
}
