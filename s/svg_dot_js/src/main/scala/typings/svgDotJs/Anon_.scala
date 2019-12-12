package typings.svgDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  @JSName("-")
  def `-_`(pos: Double): Double
  def `<`(pos: Double): Double
  def `<>`(pos: Double): Double
  def `>`(pos: Double): Double
}

object Anon_ {
  @scala.inline
  def apply(`-_`: Double => Double, `<`: Double => Double, `<>`: Double => Double, `>`: Double => Double): Anon_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(js.Any.fromFunction1(`-_`))
    __obj.updateDynamic("<")(js.Any.fromFunction1(`<`))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(`<>`))
    __obj.updateDynamic(">")(js.Any.fromFunction1(`>`))
    __obj.asInstanceOf[Anon_]
  }
}

