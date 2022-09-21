package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.lineMaterialMod.LineMaterial
import typings.three.lineSegmentsGeometryMod.LineSegmentsGeometry
import typings.three.materialMod.Material
import typings.three.threeBooleans.`true`
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSegments2Mod {
  
  @JSImport("three/examples/jsm/lines/LineSegments2", "LineSegments2")
  @js.native
  open class LineSegments2 ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: LineSegmentsGeometry) = this()
    def this(geometry: Unit, material: LineMaterial) = this()
    def this(geometry: LineSegmentsGeometry, material: LineMaterial) = this()
    
    def computeLineDistances(): this.type = js.native
    
    @JSName("geometry")
    var geometry_LineSegments2: LineSegmentsGeometry = js.native
    
    val isLineSegments2: `true` = js.native
    
    @JSName("material")
    var material_LineSegments2: LineMaterial = js.native
  }
}
