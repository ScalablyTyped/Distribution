package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.TextBracket.Positions
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBracket extends StObject {
  
  def applyStyle(context: IRenderContext): TextBracket = js.native
  
  def draw(): Unit = js.native
  
  var position: Positions = js.native
  
  def setContext(context: IRenderContext): TextBracket = js.native
  
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  
  def setFont(font: Family): TextBracket = js.native
  
  def setLine(line: Double): TextBracket = js.native
  
  var start: Note = js.native
  
  var stop: Note = js.native
}
object TextBracket {
  
  @js.native
  sealed trait Positions extends StObject
  @JSGlobal("Vex.Flow.TextBracket.Positions")
  @js.native
  object Positions extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with Positions
    
    @js.native
    sealed trait TOP
      extends StObject
         with Positions
  }
}
