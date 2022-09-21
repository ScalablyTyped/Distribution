package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnclosingTypeWalkerState extends StObject {
  
  var _currentSymbols: js.Array[PullSymbol]
  
  var _hasSetEnclosingType: Boolean
}
object EnclosingTypeWalkerState {
  
  inline def apply(_currentSymbols: js.Array[PullSymbol], _hasSetEnclosingType: Boolean): EnclosingTypeWalkerState = {
    val __obj = js.Dynamic.literal(_currentSymbols = _currentSymbols.asInstanceOf[js.Any], _hasSetEnclosingType = _hasSetEnclosingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosingTypeWalkerState]
  }
  
  extension [Self <: EnclosingTypeWalkerState](x: Self) {
    
    inline def set_currentSymbols(value: js.Array[PullSymbol]): Self = StObject.set(x, "_currentSymbols", value.asInstanceOf[js.Any])
    
    inline def set_currentSymbolsVarargs(value: PullSymbol*): Self = StObject.set(x, "_currentSymbols", js.Array(value*))
    
    inline def set_hasSetEnclosingType(value: Boolean): Self = StObject.set(x, "_hasSetEnclosingType", value.asInstanceOf[js.Any])
  }
}
