package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader
import typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTransports extends StObject {
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var reader: MessageReader
  
  var writer: MessageWriter
}
object MessageTransports {
  
  inline def apply(reader: MessageReader, writer: MessageWriter): MessageTransports = {
    val __obj = js.Dynamic.literal(reader = reader.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTransports]
  }
  
  @JSImport("vscode-languageclient/lib/common/client", "MessageTransports")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageclient.vscode-languageclient/lib/common/client.MessageTransports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageclient.vscode-languageclient/lib/common/client.MessageTransports */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageTransports] (val x: Self) extends AnyVal {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setReader(value: MessageReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setWriter(value: MessageWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
  }
}
