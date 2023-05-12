package typings.web3StorageMultipartParser

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@web3-storage/multipart-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterateMultipart(body: ReadableStream[js.typedarray.Uint8Array], boundary: String): AsyncIterable[FilePart] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateMultipart")(body.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FilePart]]
  
  inline def streamMultipart(body: Any, boundary: Any): AsyncGenerator[Any, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamMultipart")(body.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Any, Unit, Any]]
  
  trait FilePart extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var data: js.typedarray.Uint8Array
    
    var filename: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object FilePart {
    
    inline def apply(data: js.typedarray.Uint8Array, name: String): FilePart = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePart] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
