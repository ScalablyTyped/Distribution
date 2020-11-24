package typings.stylableCore.stylableMetaMod

import typings.stylableCore.stylableCoreStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementSymbol
  extends StylableDirectives
     with StylableSymbol {
  
  var _kind: element = js.native
  
  var alias: js.UndefOr[ImportSymbol] = js.native
  
  var name: String = js.native
}
object ElementSymbol {
  
  @scala.inline
  def apply(_kind: element, name: String): ElementSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementSymbol]
  }
  
  @scala.inline
  implicit class ElementSymbolOps[Self <: ElementSymbol] (val x: Self) extends AnyVal {
    
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
    def set_kind(value: element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: ImportSymbol): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
  }
}
