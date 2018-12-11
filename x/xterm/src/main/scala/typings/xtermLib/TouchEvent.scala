package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchEvent extends UIEvent {
  val altKey: scala.Boolean = js.native
  val changedTouches: TouchList = js.native
  val ctrlKey: scala.Boolean = js.native
  val metaKey: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  val targetTouches: TouchList = js.native
  val touches: TouchList = js.native
}

@JSGlobal("TouchEvent")
@js.native
object TouchEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, TouchEvent]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ TouchEventInit, TouchEvent]

