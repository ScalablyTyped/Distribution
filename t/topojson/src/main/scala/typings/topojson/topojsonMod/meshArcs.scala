package typings.topojson.topojsonMod

import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "meshArcs")
@js.native
object meshArcs extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def apply(topology: Topology[Objects[Properties]], obj: GeometryObject[js.Object]): MultiLineString[js.Object] = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    obj: GeometryObject[js.Object],
    filter: js.Function2[/* a */ GeometryObject[js.Object], /* b */ GeometryObject[js.Object], Boolean]
  ): MultiLineString[js.Object] = js.native
}

