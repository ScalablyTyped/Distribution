package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelCollectionScanOptions extends StObject {
  
  /**
    * Set the batchSize for the getMoreCommand when iterating over the query results.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The maximum number of parallel command cursors to return (the number of returned cursors will be in the range 1:numCursors).
    */
  var numCursors: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Return all BSON documents as Raw Buffer documents.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
}
object ParallelCollectionScanOptions {
  
  @scala.inline
  def apply(): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
  
  @scala.inline
  implicit class ParallelCollectionScanOptionsMutableBuilder[Self <: ParallelCollectionScanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setNumCursors(value: scala.Double): Self = StObject.set(x, "numCursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCursorsUndefined: Self = StObject.set(x, "numCursors", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
