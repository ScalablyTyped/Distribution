package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Tuning")
@js.native
open class Tuning ()
  extends StObject
     with typings.vexflow.Vex.Flow.Tuning {
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
