package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONTransform
  extends StObject
     with Transforms {
  
  var fields: js.UndefOr[Vector2[FieldRef] | SignalRef] = js.undefined
  
  var geojson: js.UndefOr[FieldRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var `type`: geojson
}
object GeoJSONTransform {
  
  inline def apply(): GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[GeoJSONTransform]
  }
  
  extension [Self <: GeoJSONTransform](x: Self) {
    
    inline def setFields(value: Vector2[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setGeojson(value: FieldRef): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    inline def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
    
    inline def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setType(value: geojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
