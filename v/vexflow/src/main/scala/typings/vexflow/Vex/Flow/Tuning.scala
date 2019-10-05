package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Tuning")
@js.native
class Tuning () extends js.Object {
  def this(tuningString: String) = this()
  def getNoteForFret(fretNum: String, stringNum: String): String = js.native
  def getValueForFret(fretNum: String, stringNum: String): Double = js.native
  def getValueForString(stringNum: String): Double = js.native
  def noteToInteger(noteString: String): Double = js.native
  def setTuning(tuningString: String): Unit = js.native
}

@JSGlobal("Vex.Flow.Tuning")
@js.native
object Tuning extends js.Object {
  @js.native
  object names extends /* name */ StringDictionary[String]
  
}

