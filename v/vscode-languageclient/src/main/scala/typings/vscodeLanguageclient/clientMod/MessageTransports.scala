package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTransports extends StObject {
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader
  
  var writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
}
object MessageTransports {
  
  @scala.inline
  def apply(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): MessageTransports = {
    val __obj = js.Dynamic.literal(reader = reader.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTransports]
  }
  
  @JSImport("vscode-languageclient/lib/client", "MessageTransports")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def is(value: js.Any): /* is vscode-languageclient.vscode-languageclient/lib/client.MessageTransports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageclient.vscode-languageclient/lib/client.MessageTransports */ Boolean]
  
  @scala.inline
  implicit class MessageTransportsMutableBuilder[Self <: MessageTransports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setReader(value: typings.vscodeJsonrpc.messageReaderMod.MessageReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriter(value: typings.vscodeJsonrpc.messageWriterMod.MessageWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
  }
}
