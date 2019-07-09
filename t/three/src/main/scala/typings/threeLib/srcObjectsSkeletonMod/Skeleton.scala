package typings
package threeLib.srcObjectsSkeletonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Skeleton", "Skeleton")
@js.native
class Skeleton protected () extends js.Object {
  def this(bones: js.Array[threeLib.srcObjectsBoneMod.Bone]) = this()
  def this(bones: js.Array[threeLib.srcObjectsBoneMod.Bone], boneInverses: js.Array[threeLib.srcMathMatrix4Mod.Matrix4]) = this()
  var boneInverses: js.Array[threeLib.srcMathMatrix4Mod.Matrix4] = js.native
  var boneMatrices: stdLib.Float32Array = js.native
  var boneTexture: threeLib.srcTexturesDataTextureMod.DataTexture = js.native
  var boneTextureHeight: scala.Double = js.native
  var boneTextureWidth: scala.Double = js.native
  var bones: js.Array[threeLib.srcObjectsBoneMod.Bone] = js.native
  var identityMatrix: threeLib.srcMathMatrix4Mod.Matrix4 = js.native
  /**
  	 * @deprecated This property has been removed completely.
  	 */
  var useVertexTexture: scala.Boolean = js.native
  def calculateInverses(bone: threeLib.srcObjectsBoneMod.Bone): scala.Unit = js.native
  def pose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

