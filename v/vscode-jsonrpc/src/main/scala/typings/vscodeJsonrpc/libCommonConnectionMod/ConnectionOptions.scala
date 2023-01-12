package typings.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptions extends StObject {
  
  var cancellationStrategy: js.UndefOr[CancellationStrategy] = js.undefined
  
  var connectionStrategy: js.UndefOr[ConnectionStrategy] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "ConnectionOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.ConnectionOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.ConnectionOptions */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
    inline def setCancellationStrategy(value: CancellationStrategy): Self = StObject.set(x, "cancellationStrategy", value.asInstanceOf[js.Any])
    
    inline def setCancellationStrategyUndefined: Self = StObject.set(x, "cancellationStrategy", js.undefined)
    
    inline def setConnectionStrategy(value: ConnectionStrategy): Self = StObject.set(x, "connectionStrategy", value.asInstanceOf[js.Any])
    
    inline def setConnectionStrategyUndefined: Self = StObject.set(x, "connectionStrategy", js.undefined)
  }
}
