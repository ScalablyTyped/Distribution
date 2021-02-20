package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.TextNote.Justification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNote extends Note {
  
  def draw(): Unit = js.native
  
  def setJustification(just: Justification): TextNote = js.native
  
  def setLine(line: Double): TextNote = js.native
}
object TextNote {
  
  @js.native
  sealed trait Justification extends StObject
  @JSGlobal("Vex.Flow.TextNote.Justification")
  @js.native
  object Justification extends StObject {
    
    @js.native
    sealed trait CENTER extends Justification
    
    @js.native
    sealed trait LEFT extends Justification
    
    @js.native
    sealed trait RIGHT extends Justification
  }
}
