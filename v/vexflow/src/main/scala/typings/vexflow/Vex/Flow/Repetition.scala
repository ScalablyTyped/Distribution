package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repetition extends StaveModifier {
  def draw(stave: Stave, x: Double): Repetition
  def drawCodaFixed(stave: Stave, x: Double): Repetition
  def drawSignoFixed(stave: Stave, x: Double): Repetition
   //inconsistent name: drawSignoFixed -> drawSegnoFixed
  def drawSymbolText(stave: Stave, x: Double, text: String, draw_coda: Boolean): Repetition
  def setShiftX(x: Double): Repetition
  def setShiftY(y: Double): Repetition
}

@JSGlobal("Vex.Flow.Repetition")
@js.native
object Repetition extends js.Object {
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  object `type` extends js.Object {
    @js.native
    sealed trait CODA_LEFT extends `type`
    
    @js.native
    sealed trait CODA_RIGHT extends `type`
    
    @js.native
    sealed trait DC extends `type`
    
    @js.native
    sealed trait DC_AL_CODA extends `type`
    
    @js.native
    sealed trait DC_AL_FINE extends `type`
    
    @js.native
    sealed trait DS extends `type`
    
    @js.native
    sealed trait DS_AL_CODA extends `type`
    
    @js.native
    sealed trait DS_AL_FINE extends `type`
    
    @js.native
    sealed trait FINE extends `type`
    
    @js.native
    sealed trait NONE extends `type`
    
    @js.native
    sealed trait SEGNO_LEFT extends `type`
    
    @js.native
    sealed trait SEGNO_RIGHT extends `type`
    
  }
  
}

