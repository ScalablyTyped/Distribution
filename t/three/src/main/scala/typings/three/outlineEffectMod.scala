package typings.three

import typings.std.HTMLElement
import typings.three.threeMod.Camera
import typings.three.threeMod.Scene
import typings.three.threeMod.Vector2
import typings.three.threeMod.Vector4
import typings.three.threeMod.WebGLRenderTarget
import typings.three.threeMod.WebGLRenderer
import typings.three.threeMod.WebGLShadowMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outlineEffectMod {
  
  @JSImport("three/examples/jsm/effects/OutlineEffect", "OutlineEffect")
  @js.native
  open class OutlineEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, parameters: OutlineEffectParameters) = this()
    
    var autoClear: Boolean = js.native
    
    def clear(): Unit = js.native
    def clear(color: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Unit, stencil: Boolean): Unit = js.native
    def clear(color: Unit, depth: Boolean): Unit = js.native
    def clear(color: Unit, depth: Boolean, stencil: Boolean): Unit = js.native
    def clear(color: Unit, depth: Unit, stencil: Boolean): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    var enabled: Boolean = js.native
    
    def getPixelRatio(): Double = js.native
    
    def getSize(target: Vector2): Vector2 = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def renderOutline(scene: Scene, camera: Camera): Unit = js.native
    
    def setPixelRatio(value: Double): Unit = js.native
    
    def setRenderTarget(): Unit = js.native
    def setRenderTarget(renderTarget: WebGLRenderTarget): Unit = js.native
    
    def setScissor(x: Double): Unit = js.native
    def setScissor(x: Double, y: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Unit, height: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Double, height: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
    def setScissor(x: Vector4): Unit = js.native
    def setScissor(x: Vector4, y: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Unit, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Double, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Unit, height: Double): Unit = js.native
    
    def setScissorTest(enable: Boolean): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
    
    def setViewport(x: Double): Unit = js.native
    def setViewport(x: Double, y: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Unit, height: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Double, height: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
    def setViewport(x: Vector4): Unit = js.native
    def setViewport(x: Vector4, y: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Unit, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Double, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Unit, height: Double): Unit = js.native
    
    var shadowMap: WebGLShadowMap = js.native
  }
  
  trait OutlineEffectParameters extends StObject {
    
    var defaultAlpha: js.UndefOr[Double] = js.undefined
    
    var defaultColor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var defaultKeepAlive: js.UndefOr[Boolean] = js.undefined
    
    var defaultThickness: js.UndefOr[Double] = js.undefined
  }
  object OutlineEffectParameters {
    
    inline def apply(): OutlineEffectParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutlineEffectParameters]
    }
    
    extension [Self <: OutlineEffectParameters](x: Self) {
      
      inline def setDefaultAlpha(value: Double): Self = StObject.set(x, "defaultAlpha", value.asInstanceOf[js.Any])
      
      inline def setDefaultAlphaUndefined: Self = StObject.set(x, "defaultAlpha", js.undefined)
      
      inline def setDefaultColor(value: js.Array[Double]): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
      
      inline def setDefaultColorVarargs(value: Double*): Self = StObject.set(x, "defaultColor", js.Array(value*))
      
      inline def setDefaultKeepAlive(value: Boolean): Self = StObject.set(x, "defaultKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setDefaultKeepAliveUndefined: Self = StObject.set(x, "defaultKeepAlive", js.undefined)
      
      inline def setDefaultThickness(value: Double): Self = StObject.set(x, "defaultThickness", value.asInstanceOf[js.Any])
      
      inline def setDefaultThicknessUndefined: Self = StObject.set(x, "defaultThickness", js.undefined)
    }
  }
}
