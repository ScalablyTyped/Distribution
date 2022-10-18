package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.EdgesGeometry
import typings.three.srcThreeMod.InstancedBufferGeometry
import typings.three.srcThreeMod.LineSegments
import typings.three.srcThreeMod.Matrix4
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.WireframeGeometry
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLineSegmentsGeometryMod {
  
  @JSImport("three/examples/jsm/lines/LineSegmentsGeometry", "LineSegmentsGeometry")
  @js.native
  open class LineSegmentsGeometry () extends InstancedBufferGeometry {
    
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    def fromEdgesGeometry(geometry: EdgesGeometry[BufferGeometry]): this.type = js.native
    
    def fromLineSegments(lineSegments: LineSegments[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    def fromMesh(mesh: Mesh[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    def fromWireframeGeometry(geometry: WireframeGeometry[BufferGeometry]): this.type = js.native
    
    val isLineSegmentsGeometry: `true` = js.native
    
    def setColors(array: js.Array[Double]): this.type = js.native
    def setColors(array: js.typedarray.Float32Array): this.type = js.native
    
    def setPositions(array: js.Array[Double]): this.type = js.native
    def setPositions(array: js.typedarray.Float32Array): this.type = js.native
  }
}
