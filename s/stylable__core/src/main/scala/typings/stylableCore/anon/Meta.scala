package typings.stylableCore.anon

import typings.stylableCore.stylableMetaMod.KeyframesSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  var meta: StylableMeta = js.native
  
  var symbol: KeyframesSymbol = js.native
}
object Meta {
  
  @scala.inline
  def apply(meta: StylableMeta, symbol: KeyframesSymbol): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: StylableMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: KeyframesSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
