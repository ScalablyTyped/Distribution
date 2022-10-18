package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryBoxGeometryMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/BoxGeometry", "BoxGeometry")
  @js.native
  open class BoxGeometry () extends Geometry {
    
    var depth: Double = js.native
    
    var depthSegments: Double = js.native
    
    var height: Double = js.native
    
    var heightSegments: Double = js.native
    
    var width: Double = js.native
    
    var widthSegments: Double = js.native
  }
  /* static members */
  object BoxGeometry {
    
    @JSImport("wonder.js/dist/es2015/component/geometry/BoxGeometry", "BoxGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BoxGeometry]
  }
}
