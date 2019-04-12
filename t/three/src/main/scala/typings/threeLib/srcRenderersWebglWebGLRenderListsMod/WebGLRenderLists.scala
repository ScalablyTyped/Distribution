package typings
package threeLib.srcRenderersWebglWebGLRenderListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderLists")
@js.native
class WebGLRenderLists () extends js.Object {
  def dispose(): scala.Unit = js.native
  /**
    *
    * returns {<String> : <WebGLRenderList>}
    */
  def get(scene: threeLib.srcScenesSceneMod.Scene, camera: threeLib.srcCamerasCameraMod.Camera): WebGLRenderList = js.native
}

