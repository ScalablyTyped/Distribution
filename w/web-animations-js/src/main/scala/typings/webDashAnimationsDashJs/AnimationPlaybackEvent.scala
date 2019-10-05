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
object AnimationPlaybackEvent
  extends Instantiable1[/* type */ String, AnimationPlaybackEvent]
     with Instantiable2[
      /* type */ String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

