package typings.three

import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcTexturesDataTextureMod.DataTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSkeletonMod {
  
  @JSImport("three/src/objects/Skeleton", "Skeleton")
  @js.native
  open class Skeleton protected () extends StObject {
    def this(bones: js.Array[Bone]) = this()
    def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
    
    var boneInverses: js.Array[Matrix4] = js.native
    
    var boneMatrices: js.typedarray.Float32Array = js.native
    
    var boneTexture: Null | DataTexture = js.native
    
    var boneTextureSize: Double = js.native
    
    var bones: js.Array[Bone] = js.native
    
    def calculateInverses(): Unit = js.native
    
    def computeBoneTexture(): this.type = js.native
    
    def dispose(): Unit = js.native
    
    var frame: Double = js.native
    
    def getBoneByName(name: String): js.UndefOr[Bone] = js.native
    
    def init(): Unit = js.native
    
    def pose(): Unit = js.native
    
    def update(): Unit = js.native
    
    /**
      * @deprecated This property has been removed completely.
      */
    var useVertexTexture: Boolean = js.native
    
    var uuid: String = js.native
  }
}
