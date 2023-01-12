package typings.three

import typings.three.srcRenderersWebGLRendererMod.Renderer
import typings.three.srcThreeMod.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsShadowMapViewerMod {
  
  @JSImport("three/examples/jsm/utils/ShadowMapViewer", "ShadowMapViewer")
  @js.native
  open class ShadowMapViewer protected () extends StObject {
    def this(light: Light) = this()
    
    var enabled: Boolean = js.native
    
    var position: Position = js.native
    
    def render(renderer: Renderer): Unit = js.native
    
    var size: Size = js.native
    
    def update(): Unit = js.native
    
    def updateForWindowResize(): Unit = js.native
  }
  
  trait Position extends StObject {
    
    def set(x: Double, y: Double): Unit
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(set: (Double, Double) => Unit, x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setSet(value: (Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    def set(width: Double, height: Double): Unit
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, set: (Double, Double) => Unit, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
