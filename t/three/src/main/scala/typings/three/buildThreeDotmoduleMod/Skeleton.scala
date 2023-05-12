package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "Skeleton")
@js.native
/**
  * Creates a new Skeleton.
  * @param bones The array of {@link THREE.Bone | bones}. Default `[]`.
  * @param boneInverses An array of {@link THREE.Matrix4 | Matrix4s}. Default `[]`.
  */
open class Skeleton ()
  extends typings.three.srcThreeMod.Skeleton {
  def this(bones: js.Array[typings.three.srcObjectsBoneMod.Bone]) = this()
  def this(
    bones: js.Array[typings.three.srcObjectsBoneMod.Bone],
    boneInverses: js.Array[typings.three.srcMathMatrix4Mod.Matrix4]
  ) = this()
  def this(bones: Unit, boneInverses: js.Array[typings.three.srcMathMatrix4Mod.Matrix4]) = this()
}
