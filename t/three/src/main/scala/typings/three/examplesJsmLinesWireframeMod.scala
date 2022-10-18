package typings.three

import typings.three.examplesJsmLinesLineMaterialMod.LineMaterial
import typings.three.examplesJsmLinesLineSegmentsGeometryMod.LineSegmentsGeometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesWireframeMod {
  
  @JSImport("three/examples/jsm/lines/Wireframe", "Wireframe")
  @js.native
  open class Wireframe ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: LineSegmentsGeometry) = this()
    def this(geometry: Unit, material: LineMaterial) = this()
    def this(geometry: LineSegmentsGeometry, material: LineMaterial) = this()
    
    def computeLineDistances(): this.type = js.native
    
    val isWireframe: `true` = js.native
  }
}
