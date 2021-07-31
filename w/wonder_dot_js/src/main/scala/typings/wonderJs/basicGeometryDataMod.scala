package typings.wonderJs

import typings.wonderJs.geometryDataMod.GeometryData
import typings.wonderJs.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicGeometryDataMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicGeometryData", "BasicGeometryData")
  @js.native
  class BasicGeometryData protected () extends GeometryData {
    def this(geometry: Geometry) = this()
  }
  /* static members */
  object BasicGeometryData {
    
    @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicGeometryData", "BasicGeometryData")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(geometry: Geometry): BasicGeometryData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(geometry.asInstanceOf[js.Any]).asInstanceOf[BasicGeometryData]
  }
}
