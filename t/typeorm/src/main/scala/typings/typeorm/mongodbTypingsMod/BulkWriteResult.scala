package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteResult extends StObject {
  
  /**
    * Return an array of inserted ids.
    */
  def getInsertedIds(): js.Array[js.Object]
  
  /**
    * Retrieve lastOp if available.
    */
  def getLastOp(): js.Object
  
  /**
    * Return raw internal result.
    */
  def getRawResponse(): js.Object
  
  /**
    * Return the upserted id at position x.
    */
  def getUpsertedIdAt(index: scala.Double): js.Object
  
  /**
    * Return an array of upserted ids.
    */
  def getUpsertedIds(): js.Array[Index]
  
  /**
    * Retrieve the write concern error if any.
    */
  def getWriteConcernError(): WriteConcernError
  
  /**
    * Returns a specific write error object.
    */
  def getWriteErrorAt(index: scala.Double): WriteError
  
  /**
    * Returns the number of write errors off the bulk operation.
    */
  def getWriteErrorCount(): scala.Double
  
  /**
    * Retrieve all write errors.
    */
  def getWriteErrors(): js.Array[js.Object]
  
  /**
    * Returns true if the bulk operation contains a write error.
    */
  def hasWriteErrors(): Boolean
  
  /**
    * number of inserted documents.
    */
  var nInserted: scala.Double
  
  /**
    *
    Number of documents updated physically on disk.
    */
  var nModified: scala.Double
  
  /**
    * Number of removed documents.
    */
  var nRemoved: scala.Double
  
  /**
    * number of documents updated logically.
    */
  var nUpdated: scala.Double
  
  /**
    * Number of upserted documents.
    */
  var nUpserted: scala.Double
  
  /**
    * Did bulk operation correctly execute.
    */
  var ok: scala.Double
}
object BulkWriteResult {
  
  @scala.inline
  def apply(
    getInsertedIds: () => js.Array[js.Object],
    getLastOp: () => js.Object,
    getRawResponse: () => js.Object,
    getUpsertedIdAt: scala.Double => js.Object,
    getUpsertedIds: () => js.Array[Index],
    getWriteConcernError: () => WriteConcernError,
    getWriteErrorAt: scala.Double => WriteError,
    getWriteErrorCount: () => scala.Double,
    getWriteErrors: () => js.Array[js.Object],
    hasWriteErrors: () => Boolean,
    nInserted: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpdated: scala.Double,
    nUpserted: scala.Double,
    ok: scala.Double
  ): BulkWriteResult = {
    val __obj = js.Dynamic.literal(getInsertedIds = js.Any.fromFunction0(getInsertedIds), getLastOp = js.Any.fromFunction0(getLastOp), getRawResponse = js.Any.fromFunction0(getRawResponse), getUpsertedIdAt = js.Any.fromFunction1(getUpsertedIdAt), getUpsertedIds = js.Any.fromFunction0(getUpsertedIds), getWriteConcernError = js.Any.fromFunction0(getWriteConcernError), getWriteErrorAt = js.Any.fromFunction1(getWriteErrorAt), getWriteErrorCount = js.Any.fromFunction0(getWriteErrorCount), getWriteErrors = js.Any.fromFunction0(getWriteErrors), hasWriteErrors = js.Any.fromFunction0(hasWriteErrors), nInserted = nInserted.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any], nUpdated = nUpdated.asInstanceOf[js.Any], nUpserted = nUpserted.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteResult]
  }
  
  @scala.inline
  implicit class BulkWriteResultMutableBuilder[Self <: BulkWriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInsertedIds(value: () => js.Array[js.Object]): Self = StObject.set(x, "getInsertedIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastOp(value: () => js.Object): Self = StObject.set(x, "getLastOp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawResponse(value: () => js.Object): Self = StObject.set(x, "getRawResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpsertedIdAt(value: scala.Double => js.Object): Self = StObject.set(x, "getUpsertedIdAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUpsertedIds(value: () => js.Array[Index]): Self = StObject.set(x, "getUpsertedIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteConcernError(value: () => WriteConcernError): Self = StObject.set(x, "getWriteConcernError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteErrorAt(value: scala.Double => WriteError): Self = StObject.set(x, "getWriteErrorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWriteErrorCount(value: () => scala.Double): Self = StObject.set(x, "getWriteErrorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteErrors(value: () => js.Array[js.Object]): Self = StObject.set(x, "getWriteErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasWriteErrors(value: () => Boolean): Self = StObject.set(x, "hasWriteErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNInserted(value: scala.Double): Self = StObject.set(x, "nInserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModified(value: scala.Double): Self = StObject.set(x, "nModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNRemoved(value: scala.Double): Self = StObject.set(x, "nRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUpdated(value: scala.Double): Self = StObject.set(x, "nUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUpserted(value: scala.Double): Self = StObject.set(x, "nUpserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
