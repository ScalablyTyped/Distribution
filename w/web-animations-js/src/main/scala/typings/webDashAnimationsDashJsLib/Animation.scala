package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation
  extends stdLib.EventTarget {
  var currentTime: scala.Double | scala.Null = js.native
  var effect: AnimationEffectReadOnly = js.native
  val finished: js.Promise[Animation] = js.native
  var id: java.lang.String = js.native
  @JSName("oncancel")
  var oncancel_Original: AnimationEventListener = js.native
  @JSName("onfinish")
  var onfinish_Original: AnimationEventListener = js.native
  val playState: AnimationPlayState = js.native
  var playbackRate: scala.Double = js.native
  val ready: js.Promise[Animation] = js.native
  var startTime: scala.Double = js.native
  var timeline: AnimationTimeline = js.native
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
  def oncancel(`this`: Animation, evt: AnimationPlaybackEvent): js.Any = js.native
  def onfinish(`this`: Animation, evt: AnimationPlaybackEvent): js.Any = js.native
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
  extends ScalablyTyped.runtime.Instantiable0[Animation]
     with ScalablyTyped.runtime.Instantiable1[/* effect */ AnimationEffectReadOnly, Animation]
     with ScalablyTyped.runtime.Instantiable2[/* effect */ AnimationEffectReadOnly, /* timeline */ AnimationTimeline, Animation]

