package typings.three

import typings.three.anon.NeedsUpdate
import typings.three.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLClipping", JSImport.Namespace)
@js.native
object webGLClippingMod extends js.Object {
  @js.native
  class WebGLClipping () extends js.Object {
    var numIntersection: Double = js.native
    var numPlanes: Double = js.native
    var uniform: NeedsUpdate = js.native
    def beginShadows(): Unit = js.native
    def endShadows(): Unit = js.native
    def init(planes: js.Array[_], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
    def setState(
      planes: js.Array[_],
      clipIntersection: Boolean,
      clipShadows: Boolean,
      camera: Camera,
      cache: js.Any,
      fromCache: Boolean
    ): Unit = js.native
  }
  
}

