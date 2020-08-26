package typings.webAnimationsJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AnimationEffect
import typings.std.KeyframeEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Animation ()
    extends typings.webAnimationsJs.Animation {
    def this(effect: AnimationEffect) = this()
    def this(effect: js.UndefOr[scala.Nothing], timeline: AnimationTimeline) = this()
    def this(effect: Null, timeline: AnimationTimeline) = this()
    def this(effect: AnimationEffect, timeline: AnimationTimeline) = this()
  }
  
  @js.native
  class AnimationPlaybackEvent protected ()
    extends typings.webAnimationsJs.AnimationPlaybackEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: AnimationPlaybackEventInit) = this()
  }
  
  @js.native
  class GroupEffect protected () extends KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
  
  @js.native
  class SequenceEffect protected () extends KeyframeEffect {
    def this(effects: js.Array[KeyframeEffect]) = this()
  }
  
  @js.native
  object Animation
    extends Instantiable0[typings.webAnimationsJs.Animation]
       with Instantiable1[/* effect */ AnimationEffect, typings.webAnimationsJs.Animation]
       with Instantiable2[
          js.UndefOr[(/* effect */ AnimationEffect) | (/* effect */ Null)], 
          /* timeline */ AnimationTimeline, 
          typings.webAnimationsJs.Animation
        ]
  
  @js.native
  object AnimationPlaybackEvent
    extends Instantiable1[/* type */ String, typings.webAnimationsJs.AnimationPlaybackEvent]
       with Instantiable2[
          /* type */ String, 
          /* eventInitDict */ AnimationPlaybackEventInit, 
          typings.webAnimationsJs.AnimationPlaybackEvent
        ]
  
}

