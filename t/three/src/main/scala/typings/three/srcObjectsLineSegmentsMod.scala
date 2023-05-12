package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineMod.Line
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLineSegmentsMod {
  
  @JSImport("three/src/objects/LineSegments", "LineSegments")
  @js.native
  /**
    * Create a new instance of {@link LineSegments}
    * @param geometry Pair(s) of vertices representing each line segment(s). Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material Material for the line. Default {@link THREE.LineBasicMaterial | `new THREE.LineBasicMaterial()`}.
    */
  open class LineSegments[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Line[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link LineSegments}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLineSegments: `true` = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `LineSegments`
      */
    @JSName("type")
    val type_LineSegments: String | typings.three.threeStrings.LineSegments = js.native
  }
}
