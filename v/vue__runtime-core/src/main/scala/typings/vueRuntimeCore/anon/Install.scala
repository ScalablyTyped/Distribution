package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.PluginInstallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install[Options] extends StObject {
  
  var install: js.UndefOr[PluginInstallFunction[Options]] = js.undefined
}
object Install {
  
  inline def apply[Options](): Install[Options] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Install[Options]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Install[?], Options] (val x: Self & Install[Options]) extends AnyVal {
    
    inline def setInstall(value: (/* app */ App[Any], Options) => Any): Self = StObject.set(x, "install", js.Any.fromFunction2(value))
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
  }
}
