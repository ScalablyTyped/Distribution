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
  
  @scala.inline
  def apply(filename: String, id: String, source: String): SFCAsyncStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCAsyncStyleCompileOptions]
  }
  
  @scala.inline
  implicit class SFCAsyncStyleCompileOptionsMutableBuilder[Self <: SFCAsyncStyleCompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAsyncUndefined: Self = StObject.set(x, "isAsync", js.undefined)
    
    @scala.inline
    def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesOptions(value: GenerateScopedName): Self = StObject.set(x, "modulesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesOptionsUndefined: Self = StObject.set(x, "modulesOptions", js.undefined)
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
  }
}
