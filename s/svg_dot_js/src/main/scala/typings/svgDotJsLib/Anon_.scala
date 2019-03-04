package typings
package svgDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  def `-`(pos: scala.Double): scala.Double
  def `<`(pos: scala.Double): scala.Double
  def `<>`(pos: scala.Double): scala.Double
  def `>`(pos: scala.Double): scala.Double
}

object Anon_ {
  @scala.inline
  def apply(
    `-`: js.Function1[scala.Double, scala.Double],
    `<`: js.Function1[scala.Double, scala.Double],
    `<>`: js.Function1[scala.Double, scala.Double],
    `>`: js.Function1[scala.Double, scala.Double]
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(`-`)
    __obj.updateDynamic("<")(`<`)
    __obj.updateDynamic("<>")(`<>`)
    __obj.updateDynamic(">")(`>`)
    __obj.asInstanceOf[Anon_]
  }
}

