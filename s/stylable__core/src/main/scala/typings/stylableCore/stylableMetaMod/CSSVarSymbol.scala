package typings.stylableCore.stylableMetaMod

import typings.stylableCore.stylableCoreStrings.cssVar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSVarSymbol extends StylableSymbol {
  
  var _kind: cssVar = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
}
object CSSVarSymbol {
  
  @scala.inline
  def apply(_kind: cssVar, name: String): CSSVarSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSVarSymbol]
  }
  
  @scala.inline
  implicit class CSSVarSymbolOps[Self <: CSSVarSymbol] (val x: Self) extends AnyVal {
    
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
    def set_kind(value: cssVar): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
  }
}
