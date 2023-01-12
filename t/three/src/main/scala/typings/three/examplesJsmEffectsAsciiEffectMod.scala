package typings.three

import typings.std.HTMLElement
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Scene
import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmEffectsAsciiEffectMod {
  
  @JSImport("three/examples/jsm/effects/AsciiEffect", "AsciiEffect")
  @js.native
  open class AsciiEffect protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, charSet: String) = this()
    def this(renderer: WebGLRenderer, charSet: String, options: AsciiEffectOptions) = this()
    def this(renderer: WebGLRenderer, charSet: Unit, options: AsciiEffectOptions) = this()
    
    var domElement: HTMLElement = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
  
  trait AsciiEffectOptions extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var invert: js.UndefOr[Boolean] = js.undefined
    
    var resolution: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object AsciiEffectOptions {
    
    inline def apply(): AsciiEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsciiEffectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsciiEffectOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
