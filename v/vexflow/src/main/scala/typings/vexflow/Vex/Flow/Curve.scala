package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curve extends js.Object {
  def draw(): Boolean
  def isPartial(): Boolean
  def renderCurve(params: Direction): Unit
  def setContext(context: IRenderContext): Curve
  def setNotes(from: Note, to: Note): Curve
}

@JSGlobal("Vex.Flow.Curve")
@js.native
object Curve extends js.Object {
  @js.native
  sealed trait Position extends js.Object
  
  @js.native
  object Position extends js.Object {
    @js.native
    sealed trait NEAR_HEAD extends Position
    
    @js.native
    sealed trait NEAR_TOP extends Position
    
  }
  
}

