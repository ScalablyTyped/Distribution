package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Skeleton")
@js.native
class Skeleton protected ()
  extends threeLib.threeDashCoreMod.Skeleton {
  def this(bones: js.Array[threeLib.threeDashCoreMod.Bone]) = this()
  def this(bones: js.Array[threeLib.threeDashCoreMod.Bone], boneInverses: js.Array[threeLib.threeDashCoreMod.Matrix4]) = this()
}

