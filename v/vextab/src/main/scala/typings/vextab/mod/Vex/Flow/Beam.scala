package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Beammiddleonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Beam")
@js.native
open class Beam protected ()
  extends typings.vexflow.mod.Flow.Beam {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
}
object Beam {
  
  @JSImport("vextab", "Vex.Flow.Beam")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def applyAndGetBeams(
    voice: typings.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typings.vexflow.Vex.Flow.Fraction]
  ): js.Array[typings.vexflow.Vex.Flow.Beam] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAndGetBeams")(voice.asInstanceOf[js.Any], stem_direction.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.vexflow.Vex.Flow.Beam]]
  
  /* static member */
  inline def generateBeams(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote]): js.Array[typings.vexflow.Vex.Flow.Beam] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateBeams")(notes.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.vexflow.Vex.Flow.Beam]]
  inline def generateBeams(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote], config: Beammiddleonly): js.Array[typings.vexflow.Vex.Flow.Beam] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBeams")(notes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.vexflow.Vex.Flow.Beam]]
  
  /* static member */
  inline def getDefaultBeamGroups(time_sig: String): js.Array[typings.vexflow.Vex.Flow.Fraction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBeamGroups")(time_sig.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.vexflow.Vex.Flow.Fraction]]
}
