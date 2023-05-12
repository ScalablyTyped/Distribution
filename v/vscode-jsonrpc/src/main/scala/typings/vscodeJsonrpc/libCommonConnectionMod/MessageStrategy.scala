package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStrategy extends StObject {
  
  def handleMessage(message: Message, next: js.Function1[/* message */ Message, Unit]): Unit
}
object MessageStrategy {
  
  inline def apply(handleMessage: (Message, js.Function1[/* message */ Message, Unit]) => Unit): MessageStrategy = {
    val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction2(handleMessage))
    __obj.asInstanceOf[MessageStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "MessageStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.MessageStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.MessageStrategy */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageStrategy] (val x: Self) extends AnyVal {
    
    inline def setHandleMessage(value: (Message, js.Function1[/* message */ Message, Unit]) => Unit): Self = StObject.set(x, "handleMessage", js.Any.fromFunction2(value))
  }
}
