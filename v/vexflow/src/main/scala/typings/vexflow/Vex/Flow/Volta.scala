package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volta extends StaveModifier {
  
  def draw(stave: Stave, x: Double): Volta = js.native
  
  def setShiftY(y: Double): Volta = js.native
}
@JSGlobal("Vex.Flow.Volta")
@js.native
object Volta extends js.Object {
  
  @js.native
  sealed trait `type` extends js.Object
  @js.native
  object `type` extends js.Object {
    
    @js.native
    sealed trait BEGIN extends `type`
    
    @js.native
    sealed trait BEGIN_END extends `type`
    
    @js.native
    sealed trait END extends `type`
    
    @js.native
    sealed trait MID extends `type`
    
    @js.native
    sealed trait NONE extends `type`
  }
}
