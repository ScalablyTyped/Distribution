package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamOptions extends StObject {
  
  /**
    * The number of documents to return per batch.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
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
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The read preference. Defaults to the read preference of the database or collection.
    */
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  
  /**
    * Specifies the logical starting point for the new change stream.
    * This should be the _id field from a previously returned change stream document.
    */
  var resumeAfter: js.UndefOr[js.Object] = js.undefined
}
object ChangeStreamOptions {
  
  @scala.inline
  def apply(): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptions]
  }
  
  @scala.inline
  implicit class ChangeStreamOptionsMutableBuilder[Self <: ChangeStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFullDocument(value: String): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    @scala.inline
    def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setResumeAfter(value: js.Object): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
  }
}
