package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation
  extends stdLib.EventTarget {
  var currentTime: scala.Double | scala.Null = js.native
  var effect: stdLib.AnimationEffect | scala.Null = js.native
  val finished: js.Promise[Animation] = js.native
  var id: java.lang.String = js.native
  var oncancel: AnimationEventListener = js.native
  var onfinish: AnimationEventListener = js.native
  val playState: stdLib.AnimationPlayState = js.native
  var playbackRate: scala.Double = js.native
  val ready: js.Promise[Animation] = js.native
  var startTime: scala.Double | scala.Null = js.native
  var timeline: AnimationTimeline | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: webDashAnimationsDashJsLib.webDashAnimationsDashJsLibStrings.cancel,
    handler: stdLib.EventListener
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: webDashAnimationsDashJsLib.webDashAnimationsDashJsLibStrings.finish,
    handler: stdLib.EventListener
  ): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: webDashAnimationsDashJsLib.webDashAnimationsDashJsLibStrings.cancel,
    handler: stdLib.EventListener
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: webDashAnimationsDashJsLib.webDashAnimationsDashJsLibStrings.finish,
    handler: stdLib.EventListener
  ): scala.Unit = js.native
  def reverse(): scala.Unit = js.native
}

@JSGlobal("Animation")
@js.native
object Animation
  extends org.scalablytyped.runtime.Instantiable0[Animation]
     with org.scalablytyped.runtime.Instantiable2[
      (/* effect */ stdLib.AnimationEffect) | (/* effect */ scala.Null), 
      /* timeline */ AnimationTimeline, 
      Animation
    ]
     with org.scalablytyped.runtime.Instantiable1[/* effect */ stdLib.AnimationEffect, Animation]

