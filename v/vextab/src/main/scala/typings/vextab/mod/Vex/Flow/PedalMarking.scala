package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.PedalMarking")
@js.native
open class PedalMarking protected ()
  extends typings.vexflow.mod.Flow.PedalMarking {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.Note]) = this()
}
object PedalMarking {
  
  @JSImport("vextab", "Vex.Flow.PedalMarking")
  @js.native
  val ^ : js.Any = js.native
  
  //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  /* static member */
  @JSImport("vextab", "Vex.Flow.PedalMarking.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.PedalMarking.Styles")
  @js.native
  object Styles extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.PedalMarking.Styles & Double] = js.native
    
    /* 0 */ val BRACKET: typings.vexflow.Vex.Flow.PedalMarking.Styles.BRACKET & Double = js.native
    
    /* 1 */ val MIXED: typings.vexflow.Vex.Flow.PedalMarking.Styles.MIXED & Double = js.native
    
    /* 1 */ val TEXT: typings.vexflow.Vex.Flow.PedalMarking.Styles.TEXT & Double = js.native
  }
  
  /* static member */
  inline def createSostenuto(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = ^.asInstanceOf[js.Dynamic].applyDynamic("createSostenuto")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.PedalMarking]
  
  /* static member */
  inline def createSustain(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = ^.asInstanceOf[js.Dynamic].applyDynamic("createSustain")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.PedalMarking]
  
  /* static member */
  inline def createUnaCorda(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnaCorda")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.PedalMarking]
}
