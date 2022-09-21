package typings.three

import typings.three.lineGeometryMod.LineGeometry
import typings.three.lineMaterialMod.LineMaterial
import typings.three.lineSegments2Mod.LineSegments2
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object line2Mod {
  
  @JSImport("three/examples/jsm/lines/Line2", "Line2")
  @js.native
  open class Line2 () extends LineSegments2 {
    def this(geometry: LineGeometry) = this()
    def this(geometry: Unit, material: LineMaterial) = this()
    def this(geometry: LineGeometry, material: LineMaterial) = this()
    
    @JSName("geometry")
    var geometry_Line2: LineGeometry = js.native
    
    val isLine2: `true` = js.native
  }
}
