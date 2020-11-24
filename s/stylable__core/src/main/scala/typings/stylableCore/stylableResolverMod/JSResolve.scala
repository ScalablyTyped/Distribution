package typings.stylableCore.stylableResolverMod

import typings.stylableCore.stylableCoreStrings.js_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSResolve extends js.Object {
  
  var _kind: js_ = js.native
  
  var meta: Null = js.native
  
  var symbol: js.Any = js.native
}
object JSResolve {
  
  @scala.inline
  def apply(_kind: js_, meta: Null, symbol: js.Any): JSResolve = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSResolve]
  }
  
  @scala.inline
  implicit class JSResolveOps[Self <: JSResolve] (val x: Self) extends AnyVal {
    
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
    def set_kind(value: js_): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Null): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: js.Any): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
