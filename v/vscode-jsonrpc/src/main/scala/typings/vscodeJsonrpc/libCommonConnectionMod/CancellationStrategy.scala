package typings.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationStrategy extends StObject {
  
  var receiver: CancellationReceiverStrategy | RequestCancellationReceiverStrategy
  
  var sender: CancellationSenderStrategy
}
object CancellationStrategy {
  
  inline def apply(
    receiver: CancellationReceiverStrategy | RequestCancellationReceiverStrategy,
    sender: CancellationSenderStrategy
  ): CancellationStrategy = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationStrategy.Message")
  @js.native
  val Message: CancellationStrategy = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationStrategy */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancellationStrategy] (val x: Self) extends AnyVal {
    
    inline def setReceiver(value: CancellationReceiverStrategy | RequestCancellationReceiverStrategy): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setSender(value: CancellationSenderStrategy): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
