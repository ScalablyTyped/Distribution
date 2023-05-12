package typings.web3StorageMultipartParser

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSearchMod {
  
  @JSImport("@web3-storage/multipart-parser/types/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@web3-storage/multipart-parser/types/search", "MATCH")
  @js.native
  val MATCH: js.Symbol = js.native
  
  @JSImport("@web3-storage/multipart-parser/types/search", "QueueableStreamSearch")
  @js.native
  open class QueueableStreamSearch protected () extends StObject {
    def this(needle: Any) = this()
    
    var _chunksQueue: js.Array[Any] = js.native
    
    var _closed: Boolean = js.native
    
    var _notify: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.native
    
    var _search: StreamSearch = js.native
    
    def close(): Unit = js.native
    
    def push(chunks: Any*): Unit = js.native
  }
  
  @JSImport("@web3-storage/multipart-parser/types/search", "ReadableStreamSearch")
  @js.native
  open class ReadableStreamSearch protected () extends StObject {
    def this(needle: Any, _readableStream: Any) = this()
    
    var _readableStream: Any = js.native
    
    var _search: StreamSearch = js.native
  }
  
  @JSImport("@web3-storage/multipart-parser/types/search", "StreamSearch")
  @js.native
  open class StreamSearch protected () extends StObject {
    def this(needle: Any) = this()
    
    def _charAt(data: Any, pos: Any): Any = js.native
    
    def _feed(data: Any, bufPos: Any): js.Array[Any] = js.native
    
    var _lastChar: Any = js.native
    
    var _lookbehind: js.typedarray.Uint8Array = js.native
    
    def _memcmp(data: Any, pos: Any, len: Any): Boolean = js.native
    
    var _needle: Any = js.native
    
    var _occ: js.Array[Any] = js.native
    
    def end(): js.typedarray.Uint8Array = js.native
    
    def feed(chunk: Any): js.Array[Any] = js.native
  }
  
  inline def allStrings(iter: Any): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allStrings")(iter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def arrayIterator(iter: Any): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayIterator")(iter.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Any]]
  
  inline def chunksIterator(iter: Any): AsyncGenerator[js.Array[Any], Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chunksIterator")(iter.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.Array[Any], Unit, Any]]
  
  inline def split(buf: Any, needle: Any): js.Array[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(buf.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint8Array]]
  
  inline def splitChunks(chunks: Any, needle: Any): js.Array[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitChunks")(chunks.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.Uint8Array]]
  
  inline def stringIterator(iter: Any): AsyncGenerator[String, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringIterator")(iter.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[String, Unit, Any]]
}
