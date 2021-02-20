package typings.stylableCore.anon

import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends StObject {
  
  var meta: StylableMeta = js.native
  
  var symbol: StylableSymbol = js.native
}
object Symbol {
  
  @scala.inline
  def apply(meta: StylableMeta, symbol: StylableSymbol): Symbol = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: StylableMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: StylableSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
