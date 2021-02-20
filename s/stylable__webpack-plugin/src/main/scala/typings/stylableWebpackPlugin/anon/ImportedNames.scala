package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportedNames extends StObject {
  
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
  implicit class ImportedNamesMutableBuilder[Self <: ImportedNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportedNames(value: js.Array[String]): Self = StObject.set(x, "importedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedNamesVarargs(value: String*): Self = StObject.set(x, "importedNames", js.Array(value :_*))
    
    @scala.inline
    def setModule(value: StylableModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
