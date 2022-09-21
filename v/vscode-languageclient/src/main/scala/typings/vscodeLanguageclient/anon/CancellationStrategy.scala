package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationStrategy extends StObject {
  
  var cancellationStrategy: typings.vscodeJsonrpc.connectionMod.CancellationStrategy
  
  var maxRestartCount: js.UndefOr[Double] = js.undefined
}
object CancellationStrategy {
  
  inline def apply(cancellationStrategy: typings.vscodeJsonrpc.connectionMod.CancellationStrategy): CancellationStrategy = {
    val __obj = js.Dynamic.literal(cancellationStrategy = cancellationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationStrategy]
  }
  
  extension [Self <: CancellationStrategy](x: Self) {
    
    inline def setCancellationStrategy(value: typings.vscodeJsonrpc.connectionMod.CancellationStrategy): Self = StObject.set(x, "cancellationStrategy", value.asInstanceOf[js.Any])
    
    inline def setMaxRestartCount(value: Double): Self = StObject.set(x, "maxRestartCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRestartCountUndefined: Self = StObject.set(x, "maxRestartCount", js.undefined)
  }
}
