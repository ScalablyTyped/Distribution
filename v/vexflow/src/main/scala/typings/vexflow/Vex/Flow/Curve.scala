package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curve extends StObject {
  
  def draw(): Boolean
  
  def isPartial(): Boolean
  
  def renderCurve(params: Direction): Unit
  
  def setContext(context: IRenderContext): Curve
  
  def setNotes(from: Note, to: Note): Curve
}
object Curve {
  
  inline def apply(
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderCurve: Direction => Unit,
    setContext: IRenderContext => Curve,
    setNotes: (Note, Note) => Curve
  ): Curve = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderCurve = js.Any.fromFunction1(renderCurve), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction2(setNotes))
    __obj.asInstanceOf[Curve]
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("Vex.Flow.Curve.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait NEAR_HEAD
      extends StObject
         with Position
    
    @js.native
    sealed trait NEAR_TOP
      extends StObject
         with Position
  }
  
  extension [Self <: Curve](x: Self) {
    
    inline def setDraw(value: () => Boolean): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setIsPartial(value: () => Boolean): Self = StObject.set(x, "isPartial", js.Any.fromFunction0(value))
    
    inline def setRenderCurve(value: Direction => Unit): Self = StObject.set(x, "renderCurve", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: IRenderContext => Curve): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: (Note, Note) => Curve): Self = StObject.set(x, "setNotes", js.Any.fromFunction2(value))
  }
}
