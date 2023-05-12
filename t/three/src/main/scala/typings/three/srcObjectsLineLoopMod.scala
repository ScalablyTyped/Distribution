package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsLineMod.Line
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLineLoopMod {
  
  @JSImport("three/src/objects/LineLoop", "LineLoop")
  @js.native
  /**
    * Create a new instance of {@link LineLoop}
    * @param geometry  List of vertices representing points on the line loop. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
    * @param material Material for the line. Default {@link THREE.LineBasicMaterial | `new THREE.LineBasicMaterial()`}.
    */
  open class LineLoop[TGeometry /* <: BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: Material | js.Array[Material] */] () extends Line[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link LineLoop}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLineLoop: `true` = js.native
    
    /**
      * @override
      * @defaultValue `LineLoop`
      */
    @JSName("type")
    val type_LineLoop: String | typings.three.threeStrings.LineLoop = js.native
  }
}
