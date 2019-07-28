package typings.topojsonDashServer

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.geojsonMod.GeoJsonObject
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-server", JSImport.Namespace)
@js.native
object topojsonDashServerMod extends js.Object {
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

