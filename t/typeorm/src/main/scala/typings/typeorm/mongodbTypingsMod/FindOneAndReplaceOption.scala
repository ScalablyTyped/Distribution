package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOneAndReplaceOption extends StObject {
  
  /**
    * The maximum amount of time to allow the query to run.
    */
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Limits the fields to return for all matching documents.
    */
  var projection: js.UndefOr[js.Object] = js.undefined
  
  /**
    * When false, returns the updated document rather than the original. The default is true.
    */
  var returnOriginal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines which document the operation modifies if the query selects multiple documents.
    */
  var sort: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Upsert the document if it does not exist.
    */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object FindOneAndReplaceOption {
  
  @scala.inline
  def apply(): FindOneAndReplaceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOption]
  }
  
  @scala.inline
  implicit class FindOneAndReplaceOptionMutableBuilder[Self <: FindOneAndReplaceOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setReturnOriginal(value: Boolean): Self = StObject.set(x, "returnOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnOriginalUndefined: Self = StObject.set(x, "returnOriginal", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
