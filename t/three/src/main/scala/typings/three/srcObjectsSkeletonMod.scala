package typings.three

import typings.std.Record
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcTexturesDataTextureMod.DataTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSkeletonMod {
  
  @JSImport("three/src/objects/Skeleton", "Skeleton")
  @js.native
  /**
    * Creates a new Skeleton.
    * @param bones The array of {@link THREE.Bone | bones}. Default `[]`.
    * @param boneInverses An array of {@link THREE.Matrix4 | Matrix4s}. Default `[]`.
    */
  open class Skeleton () extends StObject {
    def this(bones: js.Array[Bone]) = this()
    def this(bones: js.Array[Bone], boneInverses: js.Array[Matrix4]) = this()
    def this(bones: Unit, boneInverses: js.Array[Matrix4]) = this()
    
    /**
      * An array of {@link Matrix4 | Matrix4s} that represent the inverse of the {@link THREE.Matrix4 | matrixWorld} of the individual bones.
      */
    var boneInverses: js.Array[Matrix4] = js.native
    
    /**
      * The array buffer holding the bone data when using a vertex texture.
      */
    var boneMatrices: js.typedarray.Float32Array = js.native
    
    /**
      * The {@link THREE.DataTexture | DataTexture} holding the bone data when using a vertex texture.
      */
    var boneTexture: Null | DataTexture = js.native
    
    /**
      * The size of the {@link boneTexture | .boneTexture}.
      * @remarks Expects a `Integer`
      */
    var boneTextureSize: Double = js.native
    
    /**
      * The array of {@link THREE.Bone | Bones}.
      * @remarks Note this is a copy of the original array, not a reference, so you can modify the original array without effecting this one.
      */
    var bones: js.Array[Bone] = js.native
    
    /**
      * Generates the {@link boneInverses} array if not provided in the constructor.
      */
    def calculateInverses(): Unit = js.native
    
    /**
      * Computes an instance of {@link THREE.DataTexture | DataTexture} in order to pass the bone data more efficiently to the shader
      * @remarks
      * The texture is assigned to {@link boneTexture}.
      */
    def computeBoneTexture(): this.type = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    var frame: Double = js.native
    
    def fromJSON(json: Any, bones: Record[String, Bone]): Unit = js.native
    
    /**
      * Searches through the skeleton's bone array and returns the first with a matching name.
      * @param name String to match to the Bone's {@link THREE.Bone.name | .name} property.
      */
    def getBoneByName(name: String): js.UndefOr[Bone] = js.native
    
    def init(): Unit = js.native
    
    /**
      * Returns the skeleton to the base pose.
      */
    def pose(): Unit = js.native
    
    def toJSON(): Any = js.native
    
    /**
      * Updates the {@link boneMatrices} and {@link boneTexture} after changing the bones
      * @remarks
      * This is called automatically by the {@link THREE.WebGLRenderer | WebGLRenderer} if the {@link Skeleton} is used with a {@link THREE.SkinnedMesh | SkinnedMesh}.
      */
    def update(): Unit = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
  }
}
