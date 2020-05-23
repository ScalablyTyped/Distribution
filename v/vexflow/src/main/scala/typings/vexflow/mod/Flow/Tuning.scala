package typings.vexflow.mod.Flow

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Tuning")
@js.native
class Tuning ()
  extends typings.vexflow.Vex.Flow.Tuning {
  def this(tuningString: String) = this()
  /* CompleteClass */
  override def getNoteForFret(fretNum: String, stringNum: String): String = js.native
  /* CompleteClass */
  override def getValueForFret(fretNum: String, stringNum: String): Double = js.native
  /* CompleteClass */
  override def getValueForString(stringNum: String): Double = js.native
  /* CompleteClass */
  override def noteToInteger(noteString: String): Double = js.native
  /* CompleteClass */
  override def setTuning(tuningString: String): Unit = js.native
}

@JSImport("vexflow", "Flow.Tuning")
@js.native
object Tuning extends js.Object {
  @js.native
  object names extends /* name */ StringDictionary[String]
  
}

