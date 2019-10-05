package typings.webDashAnimationsDashJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AnimationEffect
import typings.std.AnimationPlayState
import typings.std.EventListener
import typings.std.EventTarget
import typings.webDashAnimationsDashJs.webDashAnimationsDashJsStrings.cancel
import typings.webDashAnimationsDashJs.webDashAnimationsDashJsStrings.finish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends EventTarget {
  var currentTime: Double | Null = js.native
  var effect: AnimationEffect | Null = js.native
  val finished: js.Promise[Animation] = js.native
  var id: String = js.native
  var oncancel: AnimationEventListener = js.native
  var onfinish: AnimationEventListener = js.native
  val playState: AnimationPlayState = js.native
  var playbackRate: Double = js.native
  val ready: js.Promise[Animation] = js.native
  var startTime: Double | Null = js.native
  var timeline: AnimationTimeline | Null = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(`type`: cancel, handler: EventListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(`type`: finish, handler: EventListener): Unit = js.native
  def cancel(): Unit = js.native
  def finish(): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(`type`: cancel, handler: EventListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(`type`: finish, handler: EventListener): Unit = js.native
  def reverse(): Unit = js.native
}

@JSGlobal("Animation")
@js.native
object Animation
  extends Instantiable0[Animation]
     with Instantiable2[
      (/* effect */ AnimationEffect) | (/* effect */ Null), 
      /* timeline */ AnimationTimeline, 
      Animation
    ]
     with Instantiable1[/* effect */ AnimationEffect, Animation]

