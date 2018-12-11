package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEvent extends Event {
  val animationName: java.lang.String = js.native
  val elapsedTime: scala.Double = js.native
  val pseudoElement: java.lang.String = js.native
}

@JSGlobal("AnimationEvent")
@js.native
object AnimationEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, AnimationEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* animationEventInitDict */ AnimationEventInit, 
      AnimationEvent
    ]

