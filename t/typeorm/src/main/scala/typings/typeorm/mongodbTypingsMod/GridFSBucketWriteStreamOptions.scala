package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketWriteStreamOptions extends StObject {
  
  /**
    * The chunk size to use, in bytes.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[String | scala.Double | js.Object] = js.undefined
  
  /**
    * The journal write concern.
    */
  var j: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}
object GridFSBucketWriteStreamOptions {
  
  inline def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  
  extension [Self <: GridFSBucketWriteStreamOptions](x: Self) {
    
    inline def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setId(value: String | scala.Double | js.Object): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setJ(value: scala.Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    inline def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    inline def setW(value: scala.Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    inline def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
