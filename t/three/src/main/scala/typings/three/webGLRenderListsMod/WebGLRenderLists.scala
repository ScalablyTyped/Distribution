package typings.three.webGLRenderListsMod

import typings.three.cameraMod.Camera
import typings.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderLists")
@js.native
class WebGLRenderLists () extends js.Object {
  def dispose(): Unit = js.native
  def get(scene: Scene, camera: Camera): WebGLRenderList = js.native
}

