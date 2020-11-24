package typings.stylableCore.stylableResolverMod

import typings.stylableCore.stylableCoreStrings.css
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSResolve[T /* <: StylableSymbol */] extends js.Object {
  
  var _kind: css = js.native
  
  var meta: StylableMeta = js.native
  
  var symbol: T = js.native
}
object CSSResolve {
  
  @scala.inline
  def apply[T /* <: StylableSymbol */](_kind: css, meta: StylableMeta, symbol: T): CSSResolve[T] = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSResolve[T]]
  }
  
  @scala.inline
  implicit class CSSResolveOps[Self <: CSSResolve[_], T /* <: StylableSymbol */] (val x: Self with CSSResolve[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_kind(value: css): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: StylableMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: T): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
