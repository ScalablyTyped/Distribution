package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Firstnote
import typings.vexflow.anon.Firstx
import typings.vexflow.anon.Leftshiftpx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveHairpin extends js.Object {
  
  def draw(): Boolean = js.native
  
  def renderHairpin(params: Firstx): Unit = js.native
  
  def setContext(context: IRenderContext): StaveHairpin = js.native
  
  def setNotes(notes: Firstnote): StaveHairpin = js.native
  
  def setPosition(position: Position): StaveHairpin = js.native
  
  def setRenderOptions(options: Leftshiftpx): StaveHairpin = js.native
}
@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  
  @js.native
  sealed trait `type` extends js.Object
  @js.native
  object `type` extends js.Object {
    
    @js.native
    sealed trait CRESC extends `type`
    
    @js.native
    sealed trait DECRESC extends `type`
  }
}
