package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportedNames extends js.Object {
  
  var importedNames: js.Array[String] = js.native
  
  var module: StylableModule = js.native
  
  var weak: js.UndefOr[Boolean] = js.native
}
object ImportedNames {
  
  @scala.inline
  def apply(importedNames: js.Array[String], module: StylableModule): ImportedNames = {
    val __obj = js.Dynamic.literal(importedNames = importedNames.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportedNames]
  }
  
  @scala.inline
  implicit class ImportedNamesOps[Self <: ImportedNames] (val x: Self) extends AnyVal {
    
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
    def setImportedNamesVarargs(value: String*): Self = this.set("importedNames", js.Array(value :_*))
    
    @scala.inline
    def setImportedNames(value: js.Array[String]): Self = this.set("importedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: StylableModule): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeak(value: Boolean): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
}
