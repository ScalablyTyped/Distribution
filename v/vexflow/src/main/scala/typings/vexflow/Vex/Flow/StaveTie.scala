package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveTie extends StObject {
  
  def draw(): Boolean
  
  def isPartial(): Boolean
  
  def renderText(first_x_px: Double, last_x_px: Double): Unit
  
  def renderTie(params: Firstxpx): Unit
  
  def setContext(context: IRenderContext): StaveTie
  
  def setFont(font: Family): StaveTie
  
  def setNotes(notes: Lastindices): StaveTie
}
object StaveTie {
  
  inline def apply(
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): StaveTie = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[StaveTie]
  }
  
  extension [Self <: StaveTie](x: Self) {
    
    inline def setDraw(value: () => Boolean): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setIsPartial(value: () => Boolean): Self = StObject.set(x, "isPartial", js.Any.fromFunction0(value))
    
    inline def setRenderText(value: (Double, Double) => Unit): Self = StObject.set(x, "renderText", js.Any.fromFunction2(value))
    
    inline def setRenderTie(value: Firstxpx => Unit): Self = StObject.set(x, "renderTie", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: IRenderContext => StaveTie): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetFont(value: Family => StaveTie): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: Lastindices => StaveTie): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
  }
}
