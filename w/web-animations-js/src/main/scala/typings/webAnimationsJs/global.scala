package typings.webAnimationsJs

import typings.std.AnimationEffect
import typings.std.KeyframeEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Animation")
  @js.native
  class Animation ()
    extends typings.webAnimationsJs.Animation {
    def this(effect: AnimationEffect) = this()
    def this(effect: js.UndefOr[scala.Nothing], timeline: AnimationTimeline) = this()
    def this(effect: Null, timeline: AnimationTimeline) = this()
    def this(effect: AnimationEffect, timeline: AnimationTimeline) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AnimationPlaybackEvent")
  @js.native
  class AnimationPlaybackEvent protected ()
    extends typings.webAnimationsJs.AnimationPlaybackEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: AnimationPlaybackEventInit) = this()
  }
  
  @JSGlobal("GroupEffect")
  @js.native
  class GroupEffect protected () extends KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
  
  @JSGlobal("SequenceEffect")
  @js.native
  class SequenceEffect protected () extends KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
}
