package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyLine extends poly

@js.native
trait Polyline extends js.Object {
  def marker(position: java.lang.String): Marker = js.native
  def marker(position: java.lang.String, marker: Marker): Marker = js.native
  def marker(position: java.lang.String, width: scala.Double): Marker = js.native
  def marker(position: java.lang.String, width: scala.Double, height: scala.Double): Marker = js.native
  def marker(
    position: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    block: js.Function1[/* marker */ Marker, scala.Unit]
  ): Marker = js.native
}

