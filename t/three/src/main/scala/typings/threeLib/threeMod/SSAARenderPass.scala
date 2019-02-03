package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SSAARenderPass")
@js.native
class SSAARenderPass protected ()
  extends threeLib.threeDashSsaapassMod.SSAARenderPass {
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: java.lang.String) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: threeLib.threeDashCoreMod.Color) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: java.lang.String, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: scala.Double, clearAlpha: scala.Double) = this()
  def this(scene: threeLib.threeDashCoreMod.Scene, camera: threeLib.threeDashCoreMod.Camera, clearColor: threeLib.threeDashCoreMod.Color, clearAlpha: scala.Double) = this()
}

/* static members */
@JSImport("three", "SSAARenderPass")
@js.native
object SSAARenderPass extends js.Object {
  val JitterVectors: js.Array[js.Array[js.Array[scala.Double]]] = js.native
}

