package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CubeCamera")
@js.native
class CubeCamera ()
  extends typings.three.srcCamerasCubeCameraMod.CubeCamera {
  def this(near: Double) = this()
  def this(near: Double, far: Double) = this()
  def this(near: Double, far: Double, cubeResolution: Double) = this()
}

