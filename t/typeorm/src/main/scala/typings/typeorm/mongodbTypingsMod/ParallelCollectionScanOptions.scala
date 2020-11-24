package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelCollectionScanOptions extends js.Object {
  
  /**
    * Set the batchSize for the getMoreCommand when iterating over the query results.
    */
  var batchSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * The maximum number of parallel command cursors to return (the number of returned cursors will be in the range 1:numCursors).
    */
  var numCursors: js.UndefOr[scala.Double] = js.native
  
  /**
    * Return all BSON documents as Raw Buffer documents.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
}
object ParallelCollectionScanOptions {
  
  @scala.inline
  def apply(): ParallelCollectionScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelCollectionScanOptions]
  }
  
  @scala.inline
  implicit class ParallelCollectionScanOptionsOps[Self <: ParallelCollectionScanOptions] (val x: Self) extends AnyVal {
    
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
    def setNumCursors(value: scala.Double): Self = this.set("numCursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCursors: Self = this.set("numCursors", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
  }
}
