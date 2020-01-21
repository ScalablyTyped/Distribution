package typings.topojson.mod

import typings.topojsonSpecification.mod.GeometryObject
import typings.topojsonSpecification.mod.MultiLineString
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
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

