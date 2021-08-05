package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSize extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var readPreference: js.UndefOr[typings.typeorm.typingsMod.ReadPreference | String] = js.undefined
}
object BatchSize {
  
  inline def apply(): BatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSize]
  }
  
  extension [Self <: BatchSize](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setReadPreference(value: typings.typeorm.typingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
