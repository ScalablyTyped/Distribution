package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTargetOptions
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebGLMultipleRenderTargetsMod {
  
  @JSImport("three/src/renderers/WebGLMultipleRenderTargets", "WebGLMultipleRenderTargets")
  @js.native
  open class WebGLMultipleRenderTargets protected () extends EventDispatcher[Event] {
    /**
      * @param width The width of the render target.
      * @param height The height of the render target.
      * @param count The number of render targets.
      * @param options object that holds texture parameters for an auto-generated target texture and depthBuffer/stencilBuffer booleans.
      * For an explanation of the texture parameters see {@link Texture}.
      */
    def this(width: Double, height: Double, count: Double) = this()
    def this(width: Double, height: Double, count: Double, options: WebGLRenderTargetOptions) = this()
    
    def copy(source: WebGLMultipleRenderTargets): this.type = js.native
    
    def dispose(): Unit = js.native
    
    val isWebGLMultipleRenderTargets: /* true */ Boolean = js.native
    
    def setSize(width: Double, height: Double): this.type = js.native
    def setSize(width: Double, height: Double, depth: Double): this.type = js.native
    
    // This is an available method, however it will break the code see https://github.com/mrdoob/three.js/issues/21930
    def setTexture(texture: Texture): Unit = js.native
    
    var texture: js.Array[Texture] = js.native
  }
}
