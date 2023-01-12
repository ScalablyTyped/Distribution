package typings.undici

import typings.node.NodeJS.ArrayBufferView
import typings.std.Blob
import typings.undici.undiciStrings.native
import typings.undici.undiciStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileMod {
  
  @JSImport("undici/types/file", "File")
  @js.native
  open class File protected ()
    extends StObject
       with Blob {
    /**
      * Creates a new File instance.
      *
      * @param fileBits An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
      * @param fileName The name of the file.
      * @param options An options object containing optional attributes for the file.
      */
    def this(fileBits: js.Array[String | ArrayBufferView | Blob], fileName: String) = this()
    def this(fileBits: js.Array[String | ArrayBufferView | Blob], fileName: String, options: FilePropertyBag) = this()
    
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    val lastModified: Double = js.native
    
    /**
      * Name of the file referenced by the File object.
      */
    val name: String = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  trait BlobPropertyBag extends StObject {
    
    var endings: js.UndefOr[native | transparent] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BlobPropertyBag {
    
    inline def apply(): BlobPropertyBag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobPropertyBag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlobPropertyBag] (val x: Self) extends AnyVal {
      
      inline def setEndings(value: native | transparent): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
      
      inline def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FilePropertyBag
    extends StObject
       with BlobPropertyBag {
    
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    var lastModified: js.UndefOr[Double] = js.undefined
  }
  object FilePropertyBag {
    
    inline def apply(): FilePropertyBag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePropertyBag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePropertyBag] (val x: Self) extends AnyVal {
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    }
  }
}
