package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEvent extends MouseEvent {
  val height: scala.Double = js.native
  val isPrimary: scala.Boolean = js.native
  val pointerId: scala.Double = js.native
  val pointerType: java.lang.String = js.native
  val pressure: scala.Double = js.native
  val tangentialPressure: scala.Double = js.native
  val tiltX: scala.Double = js.native
  val tiltY: scala.Double = js.native
  val twist: scala.Double = js.native
  val width: scala.Double = js.native
}

@JSGlobal("PointerEvent")
@js.native
object PointerEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, PointerEvent]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ PointerEventInit, PointerEvent]

