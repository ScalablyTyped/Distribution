package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.TextBracket.Positions
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBracket extends js.Object {
  var position: Positions = js.native
  var start: Note = js.native
  var stop: Note = js.native
  def applyStyle(context: IRenderContext): TextBracket = js.native
  def draw(): Unit = js.native
  def setContext(context: IRenderContext): TextBracket = js.native
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  def setFont(font: Family): TextBracket = js.native
  def setLine(line: Double): TextBracket = js.native
}

@JSGlobal("Vex.Flow.TextBracket")
@js.native
object TextBracket extends js.Object {
  @js.native
  sealed trait Positions extends js.Object
  
  @js.native
  object Positions extends js.Object {
    @js.native
    sealed trait BOTTOM extends Positions
    
    @js.native
    sealed trait TOP extends Positions
    
  }
  
}

