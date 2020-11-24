package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongodbFindOneOptions extends js.Object {
  
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
  implicit class MongodbFindOneOptionsOps[Self <: MongodbFindOneOptions] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: scala.Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    
    @scala.inline
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHint(value: js.Object): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxScan(value: scala.Double): Self = this.set("maxScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScan: Self = this.set("maxScan", js.undefined)
    
    @scala.inline
    def setMaxTimeMs(value: scala.Double): Self = this.set("maxTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimeMs: Self = this.set("maxTimeMs", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setReturnKey(value: Boolean): Self = this.set("returnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKey: Self = this.set("returnKey", js.undefined)
    
    @scala.inline
    def setShowDiskLoc(value: Boolean): Self = this.set("showDiskLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDiskLoc: Self = this.set("showDiskLoc", js.undefined)
    
    @scala.inline
    def setSkip(value: scala.Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: js.Any*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: js.Array[_] | js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setTailable(value: Boolean): Self = this.set("tailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailable: Self = this.set("tailable", js.undefined)
    
    @scala.inline
    def setTimeout(value: Boolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
