package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOpResultObject extends StObject {
  
  /**
    * Number of documents deleted.
    */
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of documents inserted.
    */
  var insertedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Inserted document generated Id's, hash key is the index of the originating operation.
    */
  var insertedIds: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Number of documents matched for update.
    */
  var matchedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of documents modified.
    */
  var modifiedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The command result object.
    */
  var result: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Number of documents upserted.
    */
  var upsertedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Upserted document generated Id's, hash key is the index of the originating operation.
    */
  var upsertedIds: js.UndefOr[js.Any] = js.undefined
}
object BulkWriteOpResultObject {
  
  @scala.inline
  def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  
  @scala.inline
  implicit class BulkWriteOpResultObjectMutableBuilder[Self <: BulkWriteOpResultObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCountUndefined: Self = StObject.set(x, "insertedCount", js.undefined)
    
    @scala.inline
    def setInsertedIds(value: js.Any): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIdsUndefined: Self = StObject.set(x, "insertedIds", js.undefined)
    
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCountUndefined: Self = StObject.set(x, "matchedCount", js.undefined)
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCountUndefined: Self = StObject.set(x, "modifiedCount", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedCountUndefined: Self = StObject.set(x, "upsertedCount", js.undefined)
    
    @scala.inline
    def setUpsertedIds(value: js.Any): Self = StObject.set(x, "upsertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedIdsUndefined: Self = StObject.set(x, "upsertedIds", js.undefined)
  }
}
