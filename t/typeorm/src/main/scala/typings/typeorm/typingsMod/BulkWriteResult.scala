package typings.typeorm.typingsMod

import typings.typeorm.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteResult extends js.Object {
  
  /**
    * Return an array of inserted ids.
    */
  def getInsertedIds(): js.Array[js.Object] = js.native
  
  /**
    * Retrieve lastOp if available.
    */
  def getLastOp(): js.Object = js.native
  
  /**
    * Return raw internal result.
    */
  def getRawResponse(): js.Object = js.native
  
  /**
    * Return the upserted id at position x.
    */
  def getUpsertedIdAt(index: scala.Double): js.Object = js.native
  
  /**
    * Return an array of upserted ids.
    */
  def getUpsertedIds(): js.Array[Index] = js.native
  
  /**
    * Retrieve the write concern error if any.
    */
  def getWriteConcernError(): WriteConcernError = js.native
  
  /**
    * Returns a specific write error object.
    */
  def getWriteErrorAt(index: scala.Double): WriteError = js.native
  
  /**
    * Returns the number of write errors off the bulk operation.
    */
  def getWriteErrorCount(): scala.Double = js.native
  
  /**
    * Retrieve all write errors.
    */
  def getWriteErrors(): js.Array[js.Object] = js.native
  
  /**
    * Returns true if the bulk operation contains a write error.
    */
  def hasWriteErrors(): Boolean = js.native
  
  /**
    * number of inserted documents.
    */
  var nInserted: scala.Double = js.native
  
  /**
    *
    Number of documents updated physically on disk.
    */
  var nModified: scala.Double = js.native
  
  /**
    * Number of removed documents.
    */
  var nRemoved: scala.Double = js.native
  
  /**
    * number of documents updated logically.
    */
  var nUpdated: scala.Double = js.native
  
  /**
    * Number of upserted documents.
    */
  var nUpserted: scala.Double = js.native
  
  /**
    * Did bulk operation correctly execute.
    */
  var ok: scala.Double = js.native
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
  implicit class BulkWriteResultOps[Self <: BulkWriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetInsertedIds(value: () => js.Array[js.Object]): Self = this.set("getInsertedIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastOp(value: () => js.Object): Self = this.set("getLastOp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawResponse(value: () => js.Object): Self = this.set("getRawResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpsertedIdAt(value: scala.Double => js.Object): Self = this.set("getUpsertedIdAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUpsertedIds(value: () => js.Array[Index]): Self = this.set("getUpsertedIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteConcernError(value: () => WriteConcernError): Self = this.set("getWriteConcernError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteErrorAt(value: scala.Double => WriteError): Self = this.set("getWriteErrorAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWriteErrorCount(value: () => scala.Double): Self = this.set("getWriteErrorCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriteErrors(value: () => js.Array[js.Object]): Self = this.set("getWriteErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasWriteErrors(value: () => Boolean): Self = this.set("hasWriteErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNInserted(value: scala.Double): Self = this.set("nInserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModified(value: scala.Double): Self = this.set("nModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNRemoved(value: scala.Double): Self = this.set("nRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUpdated(value: scala.Double): Self = this.set("nUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUpserted(value: scala.Double): Self = this.set("nUpserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: scala.Double): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
