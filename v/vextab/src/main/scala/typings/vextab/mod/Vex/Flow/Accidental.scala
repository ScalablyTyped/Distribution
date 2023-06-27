package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Accidental")
@js.native
open class Accidental protected ()
  extends typings.vexflow.mod.Flow.Accidental {
  def this(`type`: String) = this()
}
object Accidental {
  
  @JSImport("vextab", "Vex.Flow.Accidental")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Accidental.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Accidental.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyAccidentals")(voices.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyAccidentals(voices: js.Array[typings.vexflow.Vex.Flow.Voice], keySignature: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAccidentals")(voices.asInstanceOf[js.Any], keySignature.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def format(accidentals: js.Array[typings.vexflow.Vex.Flow.Accidental], state: Leftshift): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(accidentals.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
