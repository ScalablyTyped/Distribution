package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.StaveConnector.`type`
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Shiftx
import typings.vexflow.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveConnector extends StObject {
  
  var bottom_stave: Stave = js.native
  
  def draw(): Unit = js.native
  
  def drawBoldDoubleLine(ctx: js.Object, `type`: `type`, topX: Double, topY: Double, botY: Double): Unit = js.native
  
  def setContext(ctx: IRenderContext): StaveConnector = js.native
  
  def setFont(font: Size): Unit = js.native
  
  def setText(text: String): StaveConnector = js.native
  def setText(text: String, text_options: Shiftx): StaveConnector = js.native
  
  def setType(`type`: `type`): StaveConnector = js.native
  
  //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: Double): StaveConnector = js.native
  
  var thickness: Double = js.native
  
  var top_stave: Stave = js.native
  
  var x_shift: Double = js.native
}
object StaveConnector {
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.StaveConnector.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait BOLD_DOUBLE_LEFT
      extends StObject
         with `type`
    
    @js.native
    sealed trait BOLD_DOUBLE_RIGHT
      extends StObject
         with `type`
    
    @js.native
    sealed trait BRACE
      extends StObject
         with `type`
    
    @js.native
    sealed trait BRACKET
      extends StObject
         with `type`
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with `type`
    
    @js.native
    sealed trait NONE
      extends StObject
         with `type`
    
    @js.native
    sealed trait SINGLE
      extends StObject
         with `type`
    
    @js.native
    sealed trait SINGLE_LEFT
      extends StObject
         with `type`
    
    @js.native
    sealed trait SINGLE_RIGHT
      extends StObject
         with `type`
    
    @js.native
    sealed trait THIN_DOUBLE
      extends StObject
         with `type`
  }
}
