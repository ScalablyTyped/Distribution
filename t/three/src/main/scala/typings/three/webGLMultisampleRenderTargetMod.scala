package typings.three

import typings.three.threeBooleans.`true`
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/WebGLMultisampleRenderTarget", JSImport.Namespace)
@js.native
object webGLMultisampleRenderTargetMod extends js.Object {
  
  @js.native
  class WebGLMultisampleRenderTarget protected () extends WebGLRenderTarget {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
    
    val isWebGLMultisampleRenderTarget: `true` = js.native
    
    /**
    	 * Specifies the number of samples to be used for the renderbuffer storage.However, the maximum supported size for multisampling is platform dependent and defined via gl.MAX_SAMPLES.
    	 * @default 4
    	 */
    var samples: Double = js.native
  }
}
