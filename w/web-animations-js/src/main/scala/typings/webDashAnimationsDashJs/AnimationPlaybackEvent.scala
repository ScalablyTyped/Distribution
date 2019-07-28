package typings.webDashAnimationsDashJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlaybackEvent extends js.Object {
  var bubbles: Boolean
  var cancelable: Boolean
  var currentTarget: Animation
  val currentTime: Double | Null
  var defaultPrevented: Boolean
  var eventPhase: Double
  var target: Animation
  var timeStamp: Double
  val timelineTime: Double | Null
  var `type`: String
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
class AnimationPlaybackEventCls protected () extends AnimationPlaybackEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: AnimationPlaybackEventInit) = this()
  /* CompleteClass */
  override var bubbles: Boolean = js.native
  /* CompleteClass */
  override var cancelable: Boolean = js.native
  /* CompleteClass */
  override var currentTarget: Animation = js.native
  /* CompleteClass */
  override val currentTime: Double | Null = js.native
  /* CompleteClass */
  override var defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var target: Animation = js.native
  /* CompleteClass */
  override var timeStamp: Double = js.native
  /* CompleteClass */
  override val timelineTime: Double | Null = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends Instantiable1[/* type */ String, AnimationPlaybackEvent]
     with Instantiable2[
      /* type */ String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

