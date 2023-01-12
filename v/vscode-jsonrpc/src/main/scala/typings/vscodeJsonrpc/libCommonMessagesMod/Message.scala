package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var jsonrpc: String
}
object Message {
  
  inline def apply(jsonrpc: String): Message = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tests if the given message is a notification message
    */
  inline def isNotification(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotification")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean]
  inline def isNotification(message: Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotification")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean]
  
  /**
    * Tests if the given message is a request message
    */
  inline def isRequest(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean]
  inline def isRequest(message: Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean]
  
  /**
    * Tests if the given message is a response message
    */
  inline def isResponse(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResponse")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean]
  inline def isResponse(message: Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResponse")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
