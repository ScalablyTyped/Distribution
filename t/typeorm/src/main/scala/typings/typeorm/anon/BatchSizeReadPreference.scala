package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSizeReadPreference extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var readPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference | String] = js.undefined
}
object BatchSizeReadPreference {
  
  inline def apply(): BatchSizeReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeReadPreference]
  }
  
  extension [Self <: BatchSizeReadPreference](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
