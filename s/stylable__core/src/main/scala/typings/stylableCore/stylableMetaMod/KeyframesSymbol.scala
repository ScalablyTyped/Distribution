package typings.stylableCore.stylableMetaMod

import typings.stylableCore.stylableCoreStrings.keyframes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframesSymbol extends StylableSymbol {
  
  var _kind: keyframes = js.native
  
  var alias: String = js.native
  
  var `import`: js.UndefOr[Imported] = js.native
  
  var name: String = js.native
}
object KeyframesSymbol {
  
  @scala.inline
  def apply(_kind: keyframes, alias: String, name: String): KeyframesSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesSymbol]
  }
  
  @scala.inline
  implicit class KeyframesSymbolOps[Self <: KeyframesSymbol] (val x: Self) extends AnyVal {
    
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
    def set_kind(value: keyframes): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Imported): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
  }
}
