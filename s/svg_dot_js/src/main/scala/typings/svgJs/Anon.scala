package typings.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName(">")
  def Greaterthansign(pos: Double): Double
  @JSName("<")
  def Lessthansign(pos: Double): Double
  @JSName("<>")
  def LessthansignGreaterthansign(pos: Double): Double
  @JSName("-")
  def _dash(pos: Double): Double
}

object Anon {
  @scala.inline
  def apply(
    Greaterthansign: Double => Double,
    Lessthansign: Double => Double,
    LessthansignGreaterthansign: Double => Double,
    _dash: Double => Double
  ): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(js.Any.fromFunction1(Greaterthansign))
    __obj.updateDynamic("<")(js.Any.fromFunction1(Lessthansign))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(LessthansignGreaterthansign))
    __obj.updateDynamic("-")(js.Any.fromFunction1(_dash))
    __obj.asInstanceOf[Anon]
  }
}

