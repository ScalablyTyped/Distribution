package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.TextNote.Justification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNote extends Note {
  
  def draw(): Unit = js.native
  
  def setJustification(just: Justification): TextNote = js.native
  
  def setLine(line: Double): TextNote = js.native
}
@JSGlobal("Vex.Flow.TextNote")
@js.native
object TextNote extends js.Object {
  
  @js.native
  sealed trait Justification extends js.Object
  @js.native
  object Justification extends js.Object {
    
    @js.native
    sealed trait CENTER extends Justification
    
    @js.native
    sealed trait LEFT extends Justification
    
    @js.native
    sealed trait RIGHT extends Justification
  }
}
