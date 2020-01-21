package typings.wonderJs

import typings.wonderJs.geometryDataMod.GeometryData
import typings.wonderJs.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/BasicGeometryData", JSImport.Namespace)
@js.native
object basicGeometryDataMod extends js.Object {
  @js.native
  class BasicGeometryData () extends GeometryData
  
  /* static members */
  @js.native
  object BasicGeometryData extends js.Object {
    def create(geometry: Geometry): BasicGeometryData = js.native
  }
  
}

