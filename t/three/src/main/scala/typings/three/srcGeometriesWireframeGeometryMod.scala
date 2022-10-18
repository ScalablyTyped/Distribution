package typings.three

import typings.three.anon.GeometryTBufferGeometry
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesWireframeGeometryMod {
  
  @JSImport("three/src/geometries/WireframeGeometry", "WireframeGeometry")
  @js.native
  open class WireframeGeometry[TBufferGeometry /* <: BufferGeometry */] () extends BufferGeometry {
    def this(geometry: TBufferGeometry) = this()
    
    var parameters: GeometryTBufferGeometry[TBufferGeometry] = js.native
  }
}
