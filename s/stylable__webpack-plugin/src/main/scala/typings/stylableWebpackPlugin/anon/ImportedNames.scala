package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedNames extends StObject {
  
  var importedNames: js.Array[String]
  
  var module: StylableModule
  
  var weak: js.UndefOr[Boolean] = js.undefined
}
object ImportedNames {
  
  inline def apply(importedNames: js.Array[String], module: StylableModule): ImportedNames = {
    val __obj = js.Dynamic.literal(importedNames = importedNames.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportedNames]
  }
  
  extension [Self <: ImportedNames](x: Self) {
    
    inline def setImportedNames(value: js.Array[String]): Self = StObject.set(x, "importedNames", value.asInstanceOf[js.Any])
    
    inline def setImportedNamesVarargs(value: String*): Self = StObject.set(x, "importedNames", js.Array(value :_*))
    
    inline def setModule(value: StylableModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
