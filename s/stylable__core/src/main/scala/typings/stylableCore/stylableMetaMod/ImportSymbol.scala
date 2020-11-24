package typings.stylableCore.stylableMetaMod

import typings.stylableCore.stylableCoreStrings.`import`
import typings.stylableCore.stylableCoreStrings.default
import typings.stylableCore.stylableCoreStrings.named
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSymbol extends StylableSymbol {
  
  var _kind: `import` = js.native
  
  var context: String = js.native
  
  var `import`: Imported = js.native
  
  var name: String = js.native
  
  var `type`: named | default = js.native
}
object ImportSymbol {
  
  @scala.inline
  def apply(_kind: `import`, context: String, `import`: Imported, name: String, `type`: named | default): ImportSymbol = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSymbol]
  }
  
  @scala.inline
  implicit class ImportSymbolOps[Self <: ImportSymbol] (val x: Self) extends AnyVal {
    
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
    def set_kind(value: `import`): Self = this.set("_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Imported): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: named | default): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
