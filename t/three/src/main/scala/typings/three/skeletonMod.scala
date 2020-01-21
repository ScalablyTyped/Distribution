package typings.three

import typings.std.Float32Array
import typings.three.boneMod.Bone
import typings.three.dataTextureMod.DataTexture
import typings.three.matrix4Mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Skeleton", JSImport.Namespace)
@js.native
object skeletonMod extends js.Object {
  @js.native
  class Skeleton protected () extends js.Object {
    def this(bones: js.Array[Bone]) = this()
    def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
    var boneInverses: js.Array[Matrix4] = js.native
    var boneMatrices: Float32Array = js.native
    var boneTexture: DataTexture = js.native
    var boneTextureHeight: Double = js.native
    var boneTextureWidth: Double = js.native
    var bones: js.Array[Bone] = js.native
    var identityMatrix: Matrix4 = js.native
    /**
    	 * @deprecated This property has been removed completely.
    	 */
    var useVertexTexture: Boolean = js.native
    def calculateInverses(bone: Bone): Unit = js.native
    def pose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

