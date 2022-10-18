package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.libCommonRalMod.MessageBuffer
import typings.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonMessageBufferMod {
  
  /* note: abstract class */ @JSImport("vscode-jsonrpc/lib/common/messageBuffer", "AbstractMessageBuffer")
  @js.native
  open class AbstractMessageBuffer ()
    extends StObject
       with MessageBuffer {
    def this(encoding: MessageBufferEncoding) = this()
    
    /* private */ var _chunks: Any = js.native
    
    /* private */ var _encoding: Any = js.native
    
    /* private */ var _read: Any = js.native
    
    /* private */ var _totalLength: Any = js.native
    
    /* protected */ def allocNative(length: Double): js.typedarray.Uint8Array = js.native
    
    /* protected */ def asNative(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    /* protected */ def asNative(buffer: js.typedarray.Uint8Array, length: Double): js.typedarray.Uint8Array = js.native
    
    /* protected */ def emptyBuffer(): js.typedarray.Uint8Array = js.native
    
    @JSName("encoding")
    def encoding_MAbstractMessageBuffer: MessageBufferEncoding = js.native
    
    /* protected */ def fromString(value: String, encoding: MessageBufferEncoding): js.typedarray.Uint8Array = js.native
    
    def numberOfBytes: Double = js.native
    
    /* protected */ def toString(value: js.typedarray.Uint8Array, encoding: MessageBufferEncoding): String = js.native
  }
}
