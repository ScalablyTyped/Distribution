package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongodbFindOneOptions extends StObject {
  
  /**
    * Set the batchSize for the getMoreCommand when iterating over the query results.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * You can put a $comment field on a query to make looking in the profiler logs simpler.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Explain the query instead of returning the data.
    */
  var explain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fields to return in the query. Object of fields to include or exclude (not both), {'a':1}.
    */
  var fields: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Tell the query to use specific indexes in the query. Object of indexes to use, {'_id':1}.
    */
  var hint: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Sets the limit of documents returned in the query.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Set index bounds.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Limit the number of items to scan.
    */
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of milliseconds to wait before aborting the query.
    */
  var maxTimeMs: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Set index bounds.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Specify if the cursor should return partial results when querying against a sharded system.
    */
  var partial: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  
  /**
    * Only return the index key.
    */
  var returnKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show disk location of results.
    */
  var showDiskLoc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to skip N documents ahead in your query (useful for pagination).
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Snapshot query.
    */
  var snapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to sort the documents coming back from the query. Array of indexes, [['a', 1]] etc.
    */
  var sort: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
  
  /**
    * Specify if the cursor is tailable.
    */
  var tailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify if the cursor can timeout.
    */
  var timeout: js.UndefOr[Boolean] = js.undefined
}
object MongodbFindOneOptions {
  
  inline def apply(): MongodbFindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongodbFindOneOptions]
  }
  
  extension [Self <: MongodbFindOneOptions](x: Self) {
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHint(value: js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxScan(value: scala.Double): Self = StObject.set(x, "maxScan", value.asInstanceOf[js.Any])
    
    inline def setMaxScanUndefined: Self = StObject.set(x, "maxScan", js.undefined)
    
    inline def setMaxTimeMs(value: scala.Double): Self = StObject.set(x, "maxTimeMs", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMsUndefined: Self = StObject.set(x, "maxTimeMs", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setReturnKey(value: Boolean): Self = StObject.set(x, "returnKey", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyUndefined: Self = StObject.set(x, "returnKey", js.undefined)
    
    inline def setShowDiskLoc(value: Boolean): Self = StObject.set(x, "showDiskLoc", value.asInstanceOf[js.Any])
    
    inline def setShowDiskLocUndefined: Self = StObject.set(x, "showDiskLoc", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSort(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: js.Any*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
    
    inline def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
    
    inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
