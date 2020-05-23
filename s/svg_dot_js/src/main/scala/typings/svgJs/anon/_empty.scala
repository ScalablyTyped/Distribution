package typings.svgJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  @JSName(">")
  def Greaterthansign(pos: Double): Double
  @JSName("<")
  def Lessthansign(pos: Double): Double
  @JSName("<>")
  def LessthansignGreaterthansign(pos: Double): Double
  @JSName("-")
  def _dash(pos: Double): Double
}

object _empty {
  @scala.inline
  def apply(
    Greaterthansign: Double => Double,
    Lessthansign: Double => Double,
    LessthansignGreaterthansign: Double => Double,
    _dash: Double => Double
  ): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(js.Any.fromFunction1(Greaterthansign))
    __obj.updateDynamic("<")(js.Any.fromFunction1(Lessthansign))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(LessthansignGreaterthansign))
    __obj.updateDynamic("-")(js.Any.fromFunction1(_dash))
    __obj.asInstanceOf[_empty]
  }
}

