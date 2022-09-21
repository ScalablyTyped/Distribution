package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.lineSegmentsGeometryMod.LineSegmentsGeometry
import typings.three.materialMod.Material
import typings.three.threeBooleans.`true`
import typings.three.threeMod.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineGeometryMod {
  
  @JSImport("three/examples/jsm/lines/LineGeometry", "LineGeometry")
  @js.native
  open class LineGeometry () extends LineSegmentsGeometry {
    
    def fromLine(line: Line[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    val isLineGeometry: `true` = js.native
  }
}
