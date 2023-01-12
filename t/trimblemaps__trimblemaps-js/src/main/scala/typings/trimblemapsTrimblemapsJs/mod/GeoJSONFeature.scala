package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.trimblemapsTrimblemapsJs.geojsonMod.Feature
import typings.trimblemapsTrimblemapsJs.geojsonMod.GeoJsonProperties
import typings.trimblemapsTrimblemapsJs.geojsonMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONFeature
  extends StObject
     with Feature[Geometry, GeoJsonProperties] {
  
  var layer: Layer
  
  var source: String
  
  var sourceLayer: String
  
  var state: StringDictionary[Any]
}
object GeoJSONFeature {
  
  inline def apply(
    geometry: Geometry,
    layer: Layer,
    source: String,
    sourceLayer: String,
    state: StringDictionary[Any]
  ): GeoJSONFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLayer = sourceLayer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], properties = null)
    __obj.updateDynamic("type")("Feature")
    __obj.asInstanceOf[GeoJSONFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONFeature] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceLayer(value: String): Self = StObject.set(x, "sourceLayer", value.asInstanceOf[js.Any])
    
    inline def setState(value: StringDictionary[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
