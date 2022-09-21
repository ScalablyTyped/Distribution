package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  @JSImport("vscode-languageserver", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tests if the given message is a notification message
    */
  inline def isNotification(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotification")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean]
  inline def isNotification(message: typings.vscodeJsonrpc.messagesMod.Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotification")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.NotificationMessage */ Boolean]
  
  /**
    * Tests if the given message is a request message
    */
  inline def isRequest(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean]
  inline def isRequest(message: typings.vscodeJsonrpc.messagesMod.Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.RequestMessage */ Boolean]
  
  /**
    * Tests if the given message is a response message
    */
  inline def isResponse(): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResponse")().asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean]
  inline def isResponse(message: typings.vscodeJsonrpc.messagesMod.Message): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResponse")(message.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/messages.ResponseMessage */ Boolean]
}
