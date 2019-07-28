package typings.svgDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  def `-`(pos: Double): Double
  def `<`(pos: Double): Double
  def `<>`(pos: Double): Double
  def `>`(pos: Double): Double
}

object Anon_ {
  @scala.inline
  def apply(`-`: Double => Double, `<`: Double => Double, `<>`: Double => Double, `>`: Double => Double): Anon_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(js.Any.fromFunction1(`-`))
    __obj.updateDynamic("<")(js.Any.fromFunction1(`<`))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(`<>`))
    __obj.updateDynamic(">")(js.Any.fromFunction1(`>`))
    __obj.asInstanceOf[Anon_]
  }
}

