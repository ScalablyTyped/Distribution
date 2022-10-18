package typings.webgme

import typings.webgme.Core.DataObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobBlobMetadataMod {
  
  @JSImport("blob/BlobMetadata", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BlobMetadata {
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    var context: DataObject = js.native
    
    /* CompleteClass */
    var mime: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  trait BlobMetadata
    extends StObject
       with typings.webgme.Blobs.BlobMetadata
  object BlobMetadata {
    
    inline def apply(contentType: String, context: DataObject, mime: String, name: String, size: Double): BlobMetadata = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlobMetadata]
    }
  }
}
