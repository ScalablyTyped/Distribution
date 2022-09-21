package typings.waterline.mod

import typings.std.Record
import typings.waterline.anon.DatastoreConfigidentityun
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOptions extends StObject {
  
  var adapters: Record[String, Adapter]
  
  var datastores: Record[String, DatastoreConfigidentityun]
  
  var defaultModelSettings: js.UndefOr[CollectionDefinition] = js.undefined
  
  var models: Record[String, CollectionDefinition]
}
object StartOptions {
  
  inline def apply(
    adapters: Record[String, Adapter],
    datastores: Record[String, DatastoreConfigidentityun],
    models: Record[String, CollectionDefinition]
  ): StartOptions = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], datastores = datastores.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
  
  extension [Self <: StartOptions](x: Self) {
    
    inline def setAdapters(value: Record[String, Adapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setDatastores(value: Record[String, DatastoreConfigidentityun]): Self = StObject.set(x, "datastores", value.asInstanceOf[js.Any])
    
    inline def setDefaultModelSettings(value: CollectionDefinition): Self = StObject.set(x, "defaultModelSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultModelSettingsUndefined: Self = StObject.set(x, "defaultModelSettings", js.undefined)
    
    inline def setModels(value: Record[String, CollectionDefinition]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
  }
}
