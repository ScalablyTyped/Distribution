package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.geojsonMod.Feature
import typings.trimblemapsTrimblemapsJs.geojsonMod.FeatureCollection
import typings.trimblemapsTrimblemapsJs.geojsonMod.GeoJsonProperties
import typings.trimblemapsTrimblemapsJs.geojsonMod.Geometry
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.`raster-dem`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.canvas
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.geojson
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.image_
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.raster
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.vector
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "GeoJSONSource")
@js.native
open class GeoJSONSource ()
  extends StObject
     with GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  
  def getClusterChildren(
    clusterId: Double,
    callback: js.Function2[/* error */ Any, /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], Unit]
  ): this.type = js.native
  
  def getClusterExpansionZoom(clusterId: Double, callback: js.Function2[/* error */ Any, /* zoom */ Double, Unit]): this.type = js.native
  
  def getClusterLeaves(
    cluserId: Double,
    limit: Double,
    offset: Double,
    callback: js.Function2[/* error */ Any, /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], Unit]
  ): this.type = js.native
  
  def setData(data: String): this.type = js.native
  def setData(data: Feature[Geometry, GeoJsonProperties]): this.type = js.native
  def setData(data: FeatureCollection[Geometry, GeoJsonProperties]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson = js.native
}
