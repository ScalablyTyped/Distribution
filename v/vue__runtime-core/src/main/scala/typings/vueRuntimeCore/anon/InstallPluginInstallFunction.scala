package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.PluginInstallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallPluginInstallFunction[Options] extends StObject {
  
  var install: PluginInstallFunction[Options]
}
object InstallPluginInstallFunction {
  
  inline def apply[Options](install: (/* app */ App[Any], Options) => Any): InstallPluginInstallFunction[Options] = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
    __obj.asInstanceOf[InstallPluginInstallFunction[Options]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallPluginInstallFunction[?], Options] (val x: Self & InstallPluginInstallFunction[Options]) extends AnyVal {
    
    inline def setInstall(value: (/* app */ App[Any], Options) => Any): Self = StObject.set(x, "install", js.Any.fromFunction2(value))
  }
}
