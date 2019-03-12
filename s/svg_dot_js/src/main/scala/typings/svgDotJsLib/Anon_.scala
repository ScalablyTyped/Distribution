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
    `-`: scala.Double => scala.Double,
    `<`: scala.Double => scala.Double,
    `<>`: scala.Double => scala.Double,
    `>`: scala.Double => scala.Double
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(js.Any.fromFunction1(`-`))
    __obj.updateDynamic("<")(js.Any.fromFunction1(`<`))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(`<>`))
    __obj.updateDynamic(">")(js.Any.fromFunction1(`>`))
    __obj.asInstanceOf[Anon_]
  }
}

