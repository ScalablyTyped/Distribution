package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSizeReadPreference extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var readPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference | String] = js.native
}
object BatchSizeReadPreference {
  
  @scala.inline
  def apply(): BatchSizeReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeReadPreference]
  }
  
  @scala.inline
  implicit class BatchSizeReadPreferenceMutableBuilder[Self <: BatchSizeReadPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
