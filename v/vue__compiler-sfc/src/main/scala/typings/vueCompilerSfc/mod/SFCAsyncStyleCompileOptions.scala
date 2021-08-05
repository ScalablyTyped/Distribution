package typings.vueCompilerSfc.mod

import typings.vueCompilerSfc.anon.GenerateScopedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCAsyncStyleCompileOptions
  extends StObject
     with SFCStyleCompileOptions {
  
  var isAsync: js.UndefOr[Boolean] = js.undefined
  
  var modules: js.UndefOr[Boolean] = js.undefined
  
  var modulesOptions: js.UndefOr[GenerateScopedName] = js.undefined
}
object SFCAsyncStyleCompileOptions {
  
  inline def apply(filename: String, id: String, source: String): SFCAsyncStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCAsyncStyleCompileOptions]
  }
  
  extension [Self <: SFCAsyncStyleCompileOptions](x: Self) {
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setIsAsyncUndefined: Self = StObject.set(x, "isAsync", js.undefined)
    
    inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesOptions(value: GenerateScopedName): Self = StObject.set(x, "modulesOptions", value.asInstanceOf[js.Any])
    
    inline def setModulesOptionsUndefined: Self = StObject.set(x, "modulesOptions", js.undefined)
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
  }
}
