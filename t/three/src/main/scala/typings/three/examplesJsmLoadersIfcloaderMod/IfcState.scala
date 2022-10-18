package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfcState extends StObject {
  
  var api: IfcAPI
  
  var models: NumberDictionary[IfcModel]
  
  var useJSON: Boolean
  
  var webIfcSettings: js.UndefOr[LoaderSettings] = js.undefined
}
object IfcState {
  
  inline def apply(api: IfcAPI, models: NumberDictionary[IfcModel], useJSON: Boolean): IfcState = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any], useJSON = useJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfcState]
  }
  
  extension [Self <: IfcState](x: Self) {
    
    inline def setApi(value: IfcAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setModels(value: NumberDictionary[IfcModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setUseJSON(value: Boolean): Self = StObject.set(x, "useJSON", value.asInstanceOf[js.Any])
    
    inline def setWebIfcSettings(value: LoaderSettings): Self = StObject.set(x, "webIfcSettings", value.asInstanceOf[js.Any])
    
    inline def setWebIfcSettingsUndefined: Self = StObject.set(x, "webIfcSettings", js.undefined)
  }
}
