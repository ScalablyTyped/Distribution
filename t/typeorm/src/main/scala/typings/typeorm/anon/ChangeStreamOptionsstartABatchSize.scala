package typings.typeorm.anon

import typings.typeorm.mongodbTypingsMod.ClientSession
import typings.typeorm.mongodbTypingsMod.CollationDocument
import typings.typeorm.mongodbTypingsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typeorm.typeorm/driver/mongodb/typings.ChangeStreamOptions & {  startAtClusterTime :typeorm.typeorm/driver/mongodb/typings.Timestamp | undefined,   session :typeorm.typeorm/driver/mongodb/typings.ClientSession | undefined} */
trait ChangeStreamOptionsstartABatchSize extends StObject {
  
  /**
    * The number of documents to return per batch.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify collation settings for operation.
    */
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  /**
    * Allowed values: ‘default’, ‘updateLookup’.
    * When set to ‘updateLookup’, the change stream will include both a delta describing the changes to the document,
    * as well as a copy of the entire document that was changed from some time after the change occurred.
    */
  var fullDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum amount of time for the server to wait on new documents to satisfy a change stream query
    */
  var maxAwaitTimeMS: js.UndefOr[Double] = js.undefined
  
  /**
    * The read preference. Defaults to the read preference of the database or collection.
    */
  var readPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference] = js.undefined
  
  /**
    * Specifies the logical starting point for the new change stream.
    * This should be the _id field from a previously returned change stream document.
    */
  var resumeAfter: js.UndefOr[js.Object] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var startAtClusterTime: js.UndefOr[Timestamp] = js.undefined
}
object ChangeStreamOptionsstartABatchSize {
  
  inline def apply(): ChangeStreamOptionsstartABatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptionsstartABatchSize]
  }
  
  extension [Self <: ChangeStreamOptionsstartABatchSize](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFullDocument(value: String): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setMaxAwaitTimeMS(value: Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setResumeAfter(value: js.Object): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    inline def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setStartAtClusterTime(value: Timestamp): Self = StObject.set(x, "startAtClusterTime", value.asInstanceOf[js.Any])
    
    inline def setStartAtClusterTimeUndefined: Self = StObject.set(x, "startAtClusterTime", js.undefined)
  }
}
