package typings.typeorm.anon

import typings.typeorm.mongodbTypingsMod.ClientSession
import typings.typeorm.mongodbTypingsMod.CollationDocument
import typings.typeorm.mongodbTypingsMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typeorm.typeorm/driver/mongodb/typings.ChangeStreamOptions & {  startAtClusterTime :typeorm.typeorm/driver/mongodb/typings.Timestamp | undefined,   session :typeorm.typeorm/driver/mongodb/typings.ClientSession | undefined} */
@js.native
trait ChangeStreamOptionsstartABatchSize extends js.Object {
  
  /**
    * The number of documents to return per batch.
    */
  var batchSize: js.UndefOr[Double] = js.native
  
  /**
    * Specify collation settings for operation.
    */
  var collation: js.UndefOr[CollationDocument] = js.native
  
  /**
    * Allowed values: ‘default’, ‘updateLookup’.
    * When set to ‘updateLookup’, the change stream will include both a delta describing the changes to the document,
    * as well as a copy of the entire document that was changed from some time after the change occurred.
    */
  var fullDocument: js.UndefOr[String] = js.native
  
  /**
    * The maximum amount of time for the server to wait on new documents to satisfy a change stream query
    */
  var maxAwaitTimeMS: js.UndefOr[Double] = js.native
  
  /**
    * The read preference. Defaults to the read preference of the database or collection.
    */
  var readPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference] = js.native
  
  /**
    * Specifies the logical starting point for the new change stream.
    * This should be the _id field from a previously returned change stream document.
    */
  var resumeAfter: js.UndefOr[js.Object] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
  
  var startAtClusterTime: js.UndefOr[Timestamp] = js.native
}
object ChangeStreamOptionsstartABatchSize {
  
  @scala.inline
  def apply(): ChangeStreamOptionsstartABatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptionsstartABatchSize]
  }
  
  @scala.inline
  implicit class ChangeStreamOptionsstartABatchSizeOps[Self <: ChangeStreamOptionsstartABatchSize] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setFullDocument(value: String): Self = this.set("fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullDocument: Self = this.set("fullDocument", js.undefined)
    
    @scala.inline
    def setMaxAwaitTimeMS(value: Double): Self = this.set("maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAwaitTimeMS: Self = this.set("maxAwaitTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setResumeAfter(value: js.Object): Self = this.set("resumeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeAfter: Self = this.set("resumeAfter", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setStartAtClusterTime(value: Timestamp): Self = this.set("startAtClusterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAtClusterTime: Self = this.set("startAtClusterTime", js.undefined)
  }
}
