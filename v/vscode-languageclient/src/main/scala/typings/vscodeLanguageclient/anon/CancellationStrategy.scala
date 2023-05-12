package typings.vscodeLanguageclient.anon

import typings.vscodeJsonrpc.libCommonConnectionMod.MessageStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationStrategy extends StObject {
  
  var cancellationStrategy: js.UndefOr[typings.vscodeJsonrpc.libCommonConnectionMod.CancellationStrategy] = js.undefined
  
  var maxRestartCount: js.UndefOr[Double] = js.undefined
  
  var messageStrategy: js.UndefOr[MessageStrategy] = js.undefined
}
object CancellationStrategy {
  
  inline def apply(): CancellationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancellationStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancellationStrategy] (val x: Self) extends AnyVal {
    
    inline def setCancellationStrategy(value: typings.vscodeJsonrpc.libCommonConnectionMod.CancellationStrategy): Self = StObject.set(x, "cancellationStrategy", value.asInstanceOf[js.Any])
    
    inline def setCancellationStrategyUndefined: Self = StObject.set(x, "cancellationStrategy", js.undefined)
    
    inline def setMaxRestartCount(value: Double): Self = StObject.set(x, "maxRestartCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRestartCountUndefined: Self = StObject.set(x, "maxRestartCount", js.undefined)
    
    inline def setMessageStrategy(value: MessageStrategy): Self = StObject.set(x, "messageStrategy", value.asInstanceOf[js.Any])
    
    inline def setMessageStrategyUndefined: Self = StObject.set(x, "messageStrategy", js.undefined)
  }
}
