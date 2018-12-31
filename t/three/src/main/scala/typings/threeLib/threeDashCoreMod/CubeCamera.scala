package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CubeCamera")
@js.native
class CubeCamera () extends Object3D {
  def this(near: scala.Double) = this()
  def this(near: scala.Double, far: scala.Double) = this()
  def this(near: scala.Double, far: scala.Double, cubeResolution: scala.Double) = this()
  var renderTarget: WebGLRenderTargetCube = js.native
  @JSName("type")
  var type_CubeCamera: threeLib.threeLibStrings.CubeCamera = js.native
  def update(renderer: WebGLRenderer, scene: Scene): scala.Unit = js.native
  /**
    * @deprecated Use {@link CubeCamera#update .update()} instead
    */
  def updateCubeMap(renderer: Renderer, scene: Scene): scala.Unit = js.native
}

