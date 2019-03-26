package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlaybackEvent extends js.Object {
  var bubbles: scala.Boolean
  var cancelable: scala.Boolean
  var currentTarget: Animation
  val currentTime: scala.Double | scala.Null
  var defaultPrevented: scala.Boolean
  var eventPhase: scala.Double
  var target: Animation
  var timeStamp: scala.Double
  val timelineTime: scala.Double | scala.Null
  var `type`: java.lang.String
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
class AnimationPlaybackEventCls protected () extends AnimationPlaybackEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: AnimationPlaybackEventInit) = this()
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override var currentTarget: Animation = js.native
  /* CompleteClass */
  override val currentTime: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var eventPhase: scala.Double = js.native
  /* CompleteClass */
  override var target: Animation = js.native
  /* CompleteClass */
  override var timeStamp: scala.Double = js.native
  /* CompleteClass */
  override val timelineTime: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, AnimationPlaybackEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

