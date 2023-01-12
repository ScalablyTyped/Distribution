package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.PluginInstallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallPluginInstallFunction extends StObject {
  
  def install(app: App[Any], options: Any*): Any
  @JSName("install")
  var install_Original: PluginInstallFunction
}
object InstallPluginInstallFunction {
  
  inline def apply(install: PluginInstallFunction): InstallPluginInstallFunction = {
    val __obj = js.Dynamic.literal(install = install.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPluginInstallFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallPluginInstallFunction] (val x: Self) extends AnyVal {
    
    inline def setInstall(value: PluginInstallFunction): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
  }
}
