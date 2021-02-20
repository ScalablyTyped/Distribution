package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveTie extends StObject {
  
  def draw(): Boolean = js.native
  
  def isPartial(): Boolean = js.native
  
  def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  
  def renderTie(params: Firstxpx): Unit = js.native
  
  def setContext(context: IRenderContext): StaveTie = js.native
  
  def setFont(font: Family): StaveTie = js.native
  
  def setNotes(notes: Lastindices): StaveTie = js.native
}
object StaveTie {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StaveTieMutableBuilder[Self <: StaveTie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: () => Boolean): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPartial(value: () => Boolean): Self = StObject.set(x, "isPartial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderText(value: (Double, Double) => Unit): Self = StObject.set(x, "renderText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderTie(value: Firstxpx => Unit): Self = StObject.set(x, "renderTie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => StaveTie): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFont(value: Family => StaveTie): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotes(value: Lastindices => StaveTie): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
  }
}
