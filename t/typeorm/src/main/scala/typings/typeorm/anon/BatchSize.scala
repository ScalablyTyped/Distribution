package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSize extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var readPreference: js.UndefOr[typings.typeorm.typingsMod.ReadPreference | String] = js.undefined
}
object BatchSize {
  
  @scala.inline
  def apply(): BatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSize]
  }
  
  @scala.inline
  implicit class BatchSizeMutableBuilder[Self <: BatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.typingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
