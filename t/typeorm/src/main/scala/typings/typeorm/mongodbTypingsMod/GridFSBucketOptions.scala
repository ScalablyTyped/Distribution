package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketOptions extends StObject {
  
  /**
    * Optional read preference to be passed to read operations.
    */
  var ReadPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference] = js.undefined
  
  /**
    * The 'files' and 'chunks' collections will be prefixed with the bucket name followed by a dot.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Number of bytes stored in each chunk. Defaults to 255KB.
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Optional write concern to be passed to write operations, for instance { w: 1 }.
    */
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}
object GridFSBucketOptions {
  
  inline def apply(): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketOptions]
  }
  
  extension [Self <: GridFSBucketOptions](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "ReadPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "ReadPreference", js.undefined)
    
    inline def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
