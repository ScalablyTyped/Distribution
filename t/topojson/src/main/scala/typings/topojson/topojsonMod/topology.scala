package typings.topojson.topojsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.geojsonMod.GeoJsonObject
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "topology")
@js.native
object topology extends js.Object {
  def apply(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def apply(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

