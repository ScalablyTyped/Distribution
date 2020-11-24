package typings.three

import typings.std.Float32Array
import typings.three.boneMod.Bone
import typings.three.dataTextureMod.DataTexture
import typings.three.matrix4Mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/Skeleton", JSImport.Namespace)
@js.native
object skeletonMod extends js.Object {
  
  @js.native
  class Skeleton protected () extends js.Object {
    def this(bones: js.Array[Bone]) = this()
    def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
    
    var boneInverses: js.Array[Matrix4] = js.native
    
    var boneMatrices: Float32Array = js.native
    
    var boneTexture: js.UndefOr[DataTexture] = js.native
    
    var bones: js.Array[Bone] = js.native
    
    def calculateInverses(bone: Bone): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getBoneByName(name: String): js.UndefOr[Bone] = js.native
    
    def pose(): Unit = js.native
    
    def update(): Unit = js.native
    
    /**
    	 * @deprecated This property has been removed completely.
    	 */
    var useVertexTexture: Boolean = js.native
  }
}
