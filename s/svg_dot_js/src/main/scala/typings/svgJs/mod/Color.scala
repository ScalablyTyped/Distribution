package typings.svgJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color
  extends ColorLike
     with Instantiable0[Color]
     with Instantiable1[/* color */ ColorAlias, Color] {
  def at(pos: Double): Color = js.native
  def brightness(): Double = js.native
  def morph(color: ColorAlias): Color = js.native
  def toHex(): String = js.native
  def toRgb(): String = js.native
}

