package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONTransform
  extends StObject
     with _Transforms {
  
  var fields: js.UndefOr[Vector2[FieldRef] | SignalRef] = js.undefined
  
  var geojson: js.UndefOr[FieldRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var `type`: geojson
}
object GeoJSONTransform {
  
  @scala.inline
  def apply(): GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[GeoJSONTransform]
  }
  
  @scala.inline
  implicit class GeoJSONTransformMutableBuilder[Self <: GeoJSONTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: Vector2[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setGeojson(value: FieldRef): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setType(value: geojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
