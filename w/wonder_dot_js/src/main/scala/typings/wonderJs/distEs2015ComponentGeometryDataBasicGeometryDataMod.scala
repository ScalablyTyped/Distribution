package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryDataBasicGeometryDataMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicGeometryData", "BasicGeometryData")
  @js.native
  open class BasicGeometryData protected () extends GeometryData {
    def this(geometry: Geometry) = this()
  }
  /* static members */
  object BasicGeometryData {
    
    @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicGeometryData", "BasicGeometryData")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(geometry: Geometry): BasicGeometryData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(geometry.asInstanceOf[js.Any]).asInstanceOf[BasicGeometryData]
  }
}
