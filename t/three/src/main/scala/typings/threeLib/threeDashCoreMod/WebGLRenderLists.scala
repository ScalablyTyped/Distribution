package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLRenderLists")
@js.native
class WebGLRenderLists () extends js.Object {
  def dispose(): scala.Unit = js.native
  /**
    *
    * returns {<String> : <WebGLRenderList>}
    */
  def get(scene: Scene, camera: Camera): WebGLRenderList = js.native
}

