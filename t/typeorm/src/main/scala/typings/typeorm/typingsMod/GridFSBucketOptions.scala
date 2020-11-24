package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFSBucketOptions extends js.Object {
  
  /**
    * Optional read preference to be passed to read operations.
    */
  var ReadPreference: js.UndefOr[typings.typeorm.typingsMod.ReadPreference] = js.native
  
  /**
    * The 'files' and 'chunks' collections will be prefixed with the bucket name followed by a dot.
    */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * Number of bytes stored in each chunk. Defaults to 255KB.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  
  /**
    * Optional write concern to be passed to write operations, for instance { w: 1 }.
    */
  var writeConcern: js.UndefOr[WriteConcern] = js.native
}
object GridFSBucketOptions {
  
  @scala.inline
  def apply(): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketOptionsOps[Self <: GridFSBucketOptions] (val x: Self) extends AnyVal {
    
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
    def setReadPreference(value: ReadPreference): Self = this.set("ReadPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("ReadPreference", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setChunkSizeBytes(value: scala.Double): Self = this.set("chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSizeBytes: Self = this.set("chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setWriteConcern(value: WriteConcern): Self = this.set("writeConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteConcern: Self = this.set("writeConcern", js.undefined)
  }
}
