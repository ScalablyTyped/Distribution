package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongodbFindOneOptions extends StObject {
  
  /**
    * Set the batchSize for the getMoreCommand when iterating over the query results.
    */
  var batchSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * You can put a $comment field on a query to make looking in the profiler logs simpler.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Explain the query instead of returning the data.
    */
  var explain: js.UndefOr[Boolean] = js.native
  
  /**
    * The fields to return in the query. Object of fields to include or exclude (not both), {'a':1}.
    */
  var fields: js.UndefOr[js.Object] = js.native
  
  /**
    * Tell the query to use specific indexes in the query. Object of indexes to use, {'_id':1}.
    */
  var hint: js.UndefOr[js.Object] = js.native
  
  /**
    * Sets the limit of documents returned in the query.
    */
  var limit: js.UndefOr[scala.Double] = js.native
  
  /**
    * Set index bounds.
    */
  var max: js.UndefOr[scala.Double] = js.native
  
  /**
    * Limit the number of items to scan.
    */
  var maxScan: js.UndefOr[scala.Double] = js.native
  
  /**
    * Number of milliseconds to wait before aborting the query.
    */
  var maxTimeMs: js.UndefOr[scala.Double] = js.native
  
  /**
    * Set index bounds.
    */
  var min: js.UndefOr[scala.Double] = js.native
  
  /**
    * Specify if the cursor should return partial results when querying against a sharded system.
    */
  var partial: js.UndefOr[Boolean] = js.native
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Only return the index key.
    */
  var returnKey: js.UndefOr[Boolean] = js.native
  
  /**
    * Show disk location of results.
    */
  var showDiskLoc: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to skip N documents ahead in your query (useful for pagination).
    */
  var skip: js.UndefOr[scala.Double] = js.native
  
  /**
    * Snapshot query.
    */
  var snapshot: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to sort the documents coming back from the query. Array of indexes, [['a', 1]] etc.
    */
  var sort: js.UndefOr[js.Array[_] | js.Object] = js.native
  
  /**
    * Specify if the cursor is tailable.
    */
  var tailable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify if the cursor can timeout.
    */
  var timeout: js.UndefOr[Boolean] = js.native
}
object MongodbFindOneOptions {
  
  @scala.inline
  def apply(): MongodbFindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongodbFindOneOptions]
  }
  
  @scala.inline
  implicit class MongodbFindOneOptionsMutableBuilder[Self <: MongodbFindOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setHint(value: js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScan(value: scala.Double): Self = StObject.set(x, "maxScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScanUndefined: Self = StObject.set(x, "maxScan", js.undefined)
    
    @scala.inline
    def setMaxTimeMs(value: scala.Double): Self = StObject.set(x, "maxTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMsUndefined: Self = StObject.set(x, "maxTimeMs", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setReturnKey(value: Boolean): Self = StObject.set(x, "returnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnKeyUndefined: Self = StObject.set(x, "returnKey", js.undefined)
    
    @scala.inline
    def setShowDiskLoc(value: Boolean): Self = StObject.set(x, "showDiskLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDiskLocUndefined: Self = StObject.set(x, "showDiskLoc", js.undefined)
    
    @scala.inline
    def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setSort(value: js.Array[_] | js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: js.Any*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def setTailable(value: Boolean): Self = StObject.set(x, "tailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailableUndefined: Self = StObject.set(x, "tailable", js.undefined)
    
    @scala.inline
    def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
