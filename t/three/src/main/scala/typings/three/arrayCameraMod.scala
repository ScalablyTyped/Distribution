package typings.three

import typings.three.perspectiveCameraMod.PerspectiveCamera
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/ArrayCamera", JSImport.Namespace)
@js.native
object arrayCameraMod extends js.Object {
  @js.native
  class ArrayCamera () extends PerspectiveCamera {
    def this(cameras: js.Array[PerspectiveCamera]) = this()
    var cameras: js.Array[PerspectiveCamera] = js.native
    var isArrayCamera: `true` = js.native
  }
  
}

