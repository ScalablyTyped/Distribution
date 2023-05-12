package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalOrGLBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPointsMod {
  
  @JSImport("three/src/objects/Points", "Points")
  @js.native
  /**
    * Create a new instance of {@link Points}
    * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.PointsMaterial | `new THREE.PointsMaterial()`}.
    */
  open class Points[TGeometry /* <: BufferGeometry[NormalOrGLBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * An instance of {@link THREE.BufferGeometry | BufferGeometry} (or derived classes), defining the object's structure.
      * @remarks each vertex designates the position of a particle in the system.
      */
    var geometry: TGeometry = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Points}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isPoints: `true` = js.native
    
    /**
      * An instance of {@link THREE.Material | Material}, defining the object's appearance.
      * @defaultValue {@link THREE.PointsMaterial | `new THREE.PointsMaterial()`}, _with randomised colour_.
      */
    var material: TMaterial = js.native
    
    /**
      * A dictionary of morphTargets based on the `morphTarget.name` property.
      * @defaultValue `undefined`, _but rebuilt by {@link updateMorphTargets | .updateMorphTargets()}._
      *
      */
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * An array of weights typically from `0-1` that specify how much of the morph is applied.
      * @defaultValue `undefined`, _but reset to a blank array by {@link updateMorphTargets | .updateMorphTargets()}._
      */
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @override
      * @defaultValue `Points`
      */
    @JSName("type")
    val type_Points: String | typings.three.threeStrings.Points = js.native
    
    /**
      * Updates the morphTargets to have no influence on the object
      * @remarks Resets the {@link morphTargetInfluences} and {@link morphTargetDictionary} properties.
      */
    def updateMorphTargets(): Unit = js.native
  }
}
