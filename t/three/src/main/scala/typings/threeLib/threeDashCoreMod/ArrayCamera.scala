package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ArrayCamera")
@js.native
class ArrayCamera () extends PerspectiveCamera {
  def this(cameras: js.Array[PerspectiveCamera]) = this()
  var cameras: js.Array[PerspectiveCamera] = js.native
  var isArrayCamera: threeLib.threeLibNumbers.`true` = js.native
}

