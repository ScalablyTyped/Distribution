package typings.vscodeJsonrpc.libCommonConnectionMod

import typings.vscodeJsonrpc.libCommonCancellationMod.AbstractCancellationTokenSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationReceiverStrategy extends StObject {
  
  def createCancellationTokenSource(id: CancellationId): AbstractCancellationTokenSource
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CancellationReceiverStrategy {
  
  inline def apply(createCancellationTokenSource: CancellationId => AbstractCancellationTokenSource): CancellationReceiverStrategy = {
    val __obj = js.Dynamic.literal(createCancellationTokenSource = js.Any.fromFunction1(createCancellationTokenSource))
    __obj.asInstanceOf[CancellationReceiverStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationReceiverStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationReceiverStrategy.Message")
  @js.native
  val Message: CancellationReceiverStrategy = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationReceiverStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationReceiverStrategy */ Boolean]
  
  extension [Self <: CancellationReceiverStrategy](x: Self) {
    
    inline def setCreateCancellationTokenSource(value: CancellationId => AbstractCancellationTokenSource): Self = StObject.set(x, "createCancellationTokenSource", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
  }
}
