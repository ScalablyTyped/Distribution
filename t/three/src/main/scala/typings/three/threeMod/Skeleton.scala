package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.three.srcObjectsSkeletonMod.Skeleton {
  def this(bones: js.Array[typings.three.srcObjectsBoneMod.Bone]) = this()
  def this(
    bones: js.Array[typings.three.srcObjectsBoneMod.Bone],
    boneInverses: js.Array[typings.three.srcMathMatrix4Mod.Matrix4]
  ) = this()
}

