package typings.three

import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typings.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/CubeCamera", JSImport.Namespace)
@js.native
object cubeCameraMod extends js.Object {
  @js.native
  class CubeCamera () extends Object3D {
    def this(near: Double) = this()
    def this(near: Double, far: Double) = this()
    def this(near: Double, far: Double, cubeResolution: Double) = this()
    def this(near: Double, far: Double, cubeResolution: Double, options: WebGLRenderTargetOptions) = this()
    var renderTarget: WebGLCubeRenderTarget = js.native
    @JSName("type")
    var type_CubeCamera: typings.three.threeStrings.CubeCamera = js.native
    def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
  
}

