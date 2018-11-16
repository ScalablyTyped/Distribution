package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Skeleton")
@js.native
class Skeleton protected () extends js.Object {
  def this(bones: js.Array[Bone]) = this()
  def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
  var boneInverses: js.Array[Matrix4] = js.native
  var boneMatrices: stdLib.Float32Array = js.native
  var boneTexture: DataTexture = js.native
  var boneTextureHeight: scala.Double = js.native
  var boneTextureWidth: scala.Double = js.native
  var bones: js.Array[Bone] = js.native
  var identityMatrix: Matrix4 = js.native
  /**
       * @deprecated This property has been removed completely.
       */
  var useVertexTexture: scala.Boolean = js.native
  def calculateInverses(bone: Bone): scala.Unit = js.native
  def pose(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

