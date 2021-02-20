package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Accidental")
@js.native
class Accidental protected ()
  extends typings.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
}
object Accidental {
  
  @JSGlobal("Vex.Flow.Accidental")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Accidental.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Accidental.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Accidental.applyAccidentals")
  @js.native
  def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice]): Unit = js.native
  @JSGlobal("Vex.Flow.Accidental.applyAccidentals")
  @js.native
  def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice], keySignature: String): Unit = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Accidental.format")
  @js.native
  def format(accidentals: js.Array[typings.vexflow.Vex.Flow.Accidental], state: Leftshift): Unit = js.native
}
