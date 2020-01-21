package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.three.skeletonMod.Skeleton {
  def this(bones: js.Array[typings.three.boneMod.Bone]) = this()
  def this(
    bones: js.Array[typings.three.boneMod.Bone],
    boneInverses: js.Array[typings.three.matrix4Mod.Matrix4]
  ) = this()
}

