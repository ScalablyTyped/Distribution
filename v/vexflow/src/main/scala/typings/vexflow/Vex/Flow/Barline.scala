package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Barline extends StaveModifier {
  
  def draw(stave: Stave): Unit = js.native
  def draw(stave: Stave, x_shift: Double): Unit = js.native
  
  def drawRepeatBar(stave: Stave, x: Double, begin: Boolean): Unit = js.native
  
  def drawVerticalBar(stave: Stave, x: Double): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double, double_bar: Boolean): Unit = js.native
  
  def drawVerticalEndBar(stave: Stave, x: Double): Unit = js.native
  
  def setX(x: Double): Barline = js.native
}
@JSGlobal("Vex.Flow.Barline")
@js.native
object Barline extends js.Object {
  
  @js.native
  sealed trait `type` extends js.Object
  @js.native
  object `type` extends js.Object {
    
    @js.native
    sealed trait DOUBLE extends `type`
    
    @js.native
    sealed trait END extends `type`
    
    @js.native
    sealed trait NONE extends `type`
    
    @js.native
    sealed trait REPEAT_BEGIN extends `type`
    
    @js.native
    sealed trait REPEAT_BOTH extends `type`
    
    @js.native
    sealed trait REPEAT_END extends `type`
    
    @js.native
    sealed trait SINGLE extends `type`
  }
}
