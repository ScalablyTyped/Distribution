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
object AnimationPlaybackEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, AnimationPlaybackEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

