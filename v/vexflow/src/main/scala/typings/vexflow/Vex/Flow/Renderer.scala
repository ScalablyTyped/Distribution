package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  def getContext(): IRenderContext
  
  def resize(width: Double, height: Double): Renderer
}
object Renderer {
  
  @scala.inline
  def apply(getContext: () => IRenderContext, resize: (Double, Double) => Renderer): Renderer = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), resize = js.Any.fromFunction2(resize))
    __obj.asInstanceOf[Renderer]
  }
  
  @js.native
  sealed trait Backends extends StObject
  @JSGlobal("Vex.Flow.Renderer.Backends")
  @js.native
  object Backends extends StObject {
    
    @js.native
    sealed trait CANVAS
      extends StObject
         with Backends
    
    @js.native
    sealed trait RAPHAEL
      extends StObject
         with Backends
    
    @js.native
    sealed trait SVG
      extends StObject
         with Backends
    
    @js.native
    sealed trait VML
      extends StObject
         with Backends
  }
  
  @js.native
  sealed trait LineEndType extends StObject
  @JSGlobal("Vex.Flow.Renderer.LineEndType")
  @js.native
  object LineEndType extends StObject {
    
    @js.native
    sealed trait DOWN
      extends StObject
         with LineEndType
    
    @js.native
    sealed trait NONE
      extends StObject
         with LineEndType
    
    @js.native
    sealed trait UP
      extends StObject
         with LineEndType
  }
  
  @scala.inline
  implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: () => IRenderContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: (Double, Double) => Renderer): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
  }
}
