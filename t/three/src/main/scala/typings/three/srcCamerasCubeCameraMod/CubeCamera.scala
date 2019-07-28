package typings.three.srcCamerasCubeCameraMod

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcRenderersWebGLRenderTargetCubeMod.WebGLRenderTargetCube
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/CubeCamera", "CubeCamera")
@js.native
class CubeCamera () extends Object3D {
  def this(near: Double) = this()
  def this(near: Double, far: Double) = this()
  def this(near: Double, far: Double, cubeResolution: Double) = this()
  var renderTarget: WebGLRenderTargetCube = js.native
  @JSName("type")
  var type_CubeCamera: typings.three.threeStrings.CubeCamera = js.native
  def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
}

