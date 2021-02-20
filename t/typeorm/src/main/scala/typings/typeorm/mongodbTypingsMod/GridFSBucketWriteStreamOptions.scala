package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFSBucketWriteStreamOptions extends StObject {
  
  /**
    * The chunk size to use, in bytes.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[String | scala.Double | js.Object] = js.native
  
  /**
    * The journal write concern.
    */
  var j: js.UndefOr[scala.Double] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object GridFSBucketWriteStreamOptions {
  
  @scala.inline
  def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketWriteStreamOptionsMutableBuilder[Self <: GridFSBucketWriteStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setId(value: String | scala.Double | js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJ(value: scala.Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
