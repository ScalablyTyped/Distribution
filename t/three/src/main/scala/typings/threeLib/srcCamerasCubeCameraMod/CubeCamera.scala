package typings
package threeLib.srcCamerasCubeCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/CubeCamera", "CubeCamera")
@js.native
class CubeCamera ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(near: scala.Double) = this()
  def this(near: scala.Double, far: scala.Double) = this()
  def this(near: scala.Double, far: scala.Double, cubeResolution: scala.Double) = this()
  var renderTarget: threeLib.srcRenderersWebGLRenderTargetCubeMod.WebGLRenderTargetCube = js.native
  @JSName("type")
  var type_CubeCamera: threeLib.threeLibStrings.CubeCamera = js.native
  def clear(
    renderer: threeLib.srcRenderersWebGLRendererMod.WebGLRenderer,
    color: scala.Boolean,
    depth: scala.Boolean,
    stencil: scala.Boolean
  ): scala.Unit = js.native
  def update(
    renderer: threeLib.srcRenderersWebGLRendererMod.WebGLRenderer,
    scene: threeLib.srcScenesSceneMod.Scene
  ): scala.Unit = js.native
}

