package typings.topojson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.GeoJsonObject
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "topology")
@js.native
object topology extends js.Object {
  def apply(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def apply(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

