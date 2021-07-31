package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wireframeGeometryMod {
  
  @JSImport("three/src/geometries/WireframeGeometry", "WireframeGeometry")
  @js.native
  class WireframeGeometry protected () extends BufferGeometry {
    def this(geometry: BufferGeometry) = this()
    def this(geometry: Geometry) = this()
  }
}
