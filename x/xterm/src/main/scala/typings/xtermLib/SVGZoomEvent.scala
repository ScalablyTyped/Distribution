package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGZoomEvent extends UIEvent {
  val newScale: scala.Double = js.native
  val newTranslate: SVGPoint = js.native
  val previousScale: scala.Double = js.native
  val previousTranslate: SVGPoint = js.native
  val zoomRectScreen: SVGRect = js.native
}

@JSGlobal("SVGZoomEvent")
@js.native
object SVGZoomEvent
  extends ScalablyTyped.runtime.Instantiable0[SVGZoomEvent]

