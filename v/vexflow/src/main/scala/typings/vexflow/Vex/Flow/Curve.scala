package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Curve extends js.Object {
  
  def draw(): Boolean = js.native
  
  def isPartial(): Boolean = js.native
  
  def renderCurve(params: Direction): Unit = js.native
  
  def setContext(context: IRenderContext): Curve = js.native
  
  def setNotes(from: Note, to: Note): Curve = js.native
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
