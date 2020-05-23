package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tuning extends js.Object {
  def getNoteForFret(fretNum: String, stringNum: String): String
  def getValueForFret(fretNum: String, stringNum: String): Double
  def getValueForString(stringNum: String): Double
  def noteToInteger(noteString: String): Double
  def setTuning(tuningString: String): Unit
}

object Tuning {
  @scala.inline
  def apply(
    getNoteForFret: (String, String) => String,
    getValueForFret: (String, String) => Double,
    getValueForString: String => Double,
    noteToInteger: String => Double,
    setTuning: String => Unit
  ): Tuning = {
    val __obj = js.Dynamic.literal(getNoteForFret = js.Any.fromFunction2(getNoteForFret), getValueForFret = js.Any.fromFunction2(getValueForFret), getValueForString = js.Any.fromFunction1(getValueForString), noteToInteger = js.Any.fromFunction1(noteToInteger), setTuning = js.Any.fromFunction1(setTuning))
    __obj.asInstanceOf[Tuning]
  }
}

