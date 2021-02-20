package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
class PedalMarking protected ()
  extends typings.vexflow.Vex.Flow.PedalMarking {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.Note]) = this()
}
object PedalMarking {
  
  @JSGlobal("Vex.Flow.PedalMarking")
  @js.native
  val ^ : js.Any = js.native
  
  //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  /* static member */
  @JSGlobal("Vex.Flow.PedalMarking.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.PedalMarking.Styles")
  @js.native
  object Styles extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.PedalMarking.Styles with Double] = js.native
    
    /* 0 */ val BRACKET: typings.vexflow.Vex.Flow.PedalMarking.Styles.BRACKET with Double = js.native
    
    /* 1 */ val MIXED: typings.vexflow.Vex.Flow.PedalMarking.Styles.MIXED with Double = js.native
    
    /* 1 */ val TEXT: typings.vexflow.Vex.Flow.PedalMarking.Styles.TEXT with Double = js.native
  }
  
  /* static member */
  @JSGlobal("Vex.Flow.PedalMarking.createSostenuto")
  @js.native
  def createSostenuto(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.PedalMarking.createSustain")
  @js.native
  def createSustain(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.PedalMarking.createUnaCorda")
  @js.native
  def createUnaCorda(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.PedalMarking = js.native
}
