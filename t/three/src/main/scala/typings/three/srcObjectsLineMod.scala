package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLineMod {
  
  @JSImport("three/src/objects/Line", "Line")
  @js.native
  /**
    * Create a new instance of {@link Line}
    * @param geometry Vertices representing the {@link Line} segment(s). Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material Material for the line. Default {@link THREE.LineBasicMaterial | `new THREE.LineBasicMaterial()`}.
    */
  open class Line[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * Computes an array of distance values which are necessary for {@link THREE.LineDashedMaterial | LineDashedMaterial}
      * @remarks
      * For each vertex in the geometry, the method calculates the cumulative length from the current point to the very beginning of the line.
      */
    def computeLineDistances(): this.type = js.native
    
    /**
      * Vertices representing the {@link Line} segment(s).
      */
    var geometry: TGeometry = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Line}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLine: `true` = js.native
    
    /**
      * Material for the line.
      */
    var material: TMaterial = js.native
    
    /**
      * A dictionary of morphTargets based on the `morphTarget.name` property.
      * @defaultValue `undefined`, but reset to a blank array by {@link updateMorphTargets | .updateMorphTargets()}.
      */
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    /**
      * An array of weights typically from `0-1` that specify how much of the morph is applied.
      * @defaultValue `undefined`, but reset to a blank array by {@link updateMorphTargets | .updateMorphTargets()}.
      */
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @override
      * @defaultValue `Line`
      */
    @JSName("type")
    val type_Line: String | typings.three.threeStrings.Line = js.native
    
    /**
      * Updates the morphTargets to have no influence on the object
      * @remarks
      * Resets the {@link morphTargetInfluences | .morphTargetInfluences} and {@link morphTargetDictionary | .morphTargetDictionary} properties.
      */
    def updateMorphTargets(): Unit = js.native
  }
}
