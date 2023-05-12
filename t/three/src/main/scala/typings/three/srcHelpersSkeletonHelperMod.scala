package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import typings.three.srcThreeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersSkeletonHelperMod {
  
  @JSImport("three/src/helpers/SkeletonHelper", "SkeletonHelper")
  @js.native
  open class SkeletonHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(`object`: Object3D[Event]) = this()
    /**
      * Create a new instance of {@link SkeletonHelper}
      * @param object Usually an instance of {@link THREE.SkinnedMesh | SkinnedMesh}.
      * However, any instance of {@link THREE.Object3D | Object3D} can be used if it represents a hierarchy of {@link Bone | Bone}s (via {@link THREE.Object3D.children | Object3D.children}).
      */
    def this(`object`: SkinnedMesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]) = this()
    
    /**
      * The list of bones that the helper renders as {@link Line | Lines}.
      */
    var bones: js.Array[Bone] = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link SkeletonHelper}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSkeletonHelper: /* true */ Boolean = js.native
    
    /**
      * The object passed in the constructor.
      */
    var root: (SkinnedMesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]) | Object3D[Event] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `SkeletonHelper`
      */
    @JSName("type")
    val type_SkeletonHelper: String | typings.three.threeStrings.SkeletonHelper = js.native
    
    /**
      * Updates the helper.
      */
    def update(): Unit = js.native
  }
}
