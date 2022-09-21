package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw
  - typings.trimblemapsTrimblemapsJs.mod.VideoSourceRaw
  - typings.trimblemapsTrimblemapsJs.mod.ImageSourceRaw
  - typings.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw
  - typings.trimblemapsTrimblemapsJs.mod.VectorSource
  - typings.trimblemapsTrimblemapsJs.mod.RasterSource
  - typings.trimblemapsTrimblemapsJs.mod.RasterDemSource
*/
trait AnySourceData extends StObject
object AnySourceData {
  
  inline def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): typings.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.CanvasSourceRaw]
  }
  
  inline def GeoJSONSourceRaw(): typings.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.GeoJSONSourceRaw]
  }
  
  inline def ImageSourceRaw(): typings.trimblemapsTrimblemapsJs.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.ImageSourceRaw]
  }
  
  inline def RasterDemSource(): typings.trimblemapsTrimblemapsJs.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster-dem")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.RasterDemSource]
  }
  
  inline def RasterSource(): typings.trimblemapsTrimblemapsJs.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.RasterSource]
  }
  
  inline def VectorSource(): typings.trimblemapsTrimblemapsJs.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.VectorSource]
  }
  
  inline def VideoSourceRaw(): typings.trimblemapsTrimblemapsJs.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.VideoSourceRaw]
  }
}
