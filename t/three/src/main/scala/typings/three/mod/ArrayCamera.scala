package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ArrayCamera")
@js.native
class ArrayCamera ()
  extends typings.three.arrayCameraMod.ArrayCamera {
  def this(cameras: js.Array[typings.three.perspectiveCameraMod.PerspectiveCamera]) = this()
}

