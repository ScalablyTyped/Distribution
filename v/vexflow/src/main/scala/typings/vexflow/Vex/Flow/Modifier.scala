package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifier extends js.Object {
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): Unit
   //inconsistent type: void -> Modifier
  def draw(): Unit
  def getCategory(): String
  def getContext(): IRenderContext
  def getIndex(): Double
  def getModifierContext(): ModifierContext
  def getNote(): Note
  def getPosition(): Position
  def getWidth(): Double
  def setContext(context: IRenderContext): Modifier
  def setIndex(index: Double): Modifier
  def setModifierContext(c: ModifierContext): Modifier
  def setNote(note: Note): Modifier
  def setPosition(position: Position): Modifier
  def setTextLine(line: Double): Modifier
  def setWidth(width: Double): Modifier
  def setXShift(x: Double): Unit
  def setYShift(y: Double): Modifier
}

@JSGlobal("Vex.Flow.Modifier")
@js.native
object Modifier extends js.Object {
  @js.native
  sealed trait Position extends js.Object
  
  @js.native
  object Position extends js.Object {
    @js.native
    sealed trait ABOVE extends Position
    
    @js.native
    sealed trait BELOW extends Position
    
    @js.native
    sealed trait LEFT extends Position
    
    @js.native
    sealed trait RIGHT extends Position
    
  }
  
}

