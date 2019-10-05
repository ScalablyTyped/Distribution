package typings.topojson.topojsonMod

import typings.topojsonDashSimplify.topojsonDashSimplifyMod.Filter
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.OrNull
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filter")
@js.native
object filter extends js.Object {
  def apply[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter): Topology[OrNull[K]] = js.native
}

