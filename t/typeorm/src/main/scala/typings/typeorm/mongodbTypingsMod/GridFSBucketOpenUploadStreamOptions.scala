package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketOpenUploadStreamOptions extends StObject {
  
  /**
    * Optional array of strings to store in the file document's aliases field.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional overwrite this bucket's chunkSizeBytes for this file.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional string to store in the file document's contentType field.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional object to store in the file document's metadata field.
    */
  var metadata: js.UndefOr[js.Object] = js.undefined
}
object GridFSBucketOpenUploadStreamOptions {
  
  @scala.inline
  def apply(): GridFSBucketOpenUploadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketOpenUploadStreamOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketOpenUploadStreamOptionsMutableBuilder[Self <: GridFSBucketOpenUploadStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
