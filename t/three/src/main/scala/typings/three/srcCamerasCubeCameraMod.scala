package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcRenderersWebGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCamerasCubeCameraMod {
  
  @JSImport("three/src/cameras/CubeCamera", "CubeCamera")
  @js.native
  open class CubeCamera protected () extends Object3D[Event] {
    /**
      * Constructs a {@link CubeCamera} that contains 6 {@link PerspectiveCamera | PerspectiveCameras} that render to a {@link THREE.WebGLCubeRenderTarget | WebGLCubeRenderTarget}.
      * @param near The near clipping distance.
      * @param far The far clipping distance.
      * @param renderTarget The destination cube render target.
      */
    def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()
    
    /**
      * The destination cube render target.
      */
    var renderTarget: WebGLCubeRenderTarget = js.native
    
    /**
      * @override
      * @defaultValue `CubeCamera`
      */
    @JSName("type")
    val type_CubeCamera: String | typings.three.threeStrings.CubeCamera = js.native
    
    /**
      * Call this to update the {@link CubeCamera.renderTarget | renderTarget}.
      * @param renderer The current WebGL renderer
      * @param scene The current scene
      */
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
}
