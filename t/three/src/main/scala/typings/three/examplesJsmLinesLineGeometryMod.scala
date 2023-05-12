package typings.three

import typings.three.examplesJsmLinesLineSegmentsGeometryMod.LineSegmentsGeometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Line
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLinesLineGeometryMod {
  
  @JSImport("three/examples/jsm/lines/LineGeometry", "LineGeometry")
  @js.native
  open class LineGeometry () extends LineSegmentsGeometry {
    
    def fromLine(line: Line[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]): this.type = js.native
    
    val isLineGeometry: `true` = js.native
  }
}
