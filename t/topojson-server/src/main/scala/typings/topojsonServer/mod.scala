package typings.topojsonServer

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.GeoJsonObject
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-server", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  @JSImport("topojson-server", "topology")
  @js.native
  def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}
