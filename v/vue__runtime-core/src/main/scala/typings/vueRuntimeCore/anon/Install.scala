package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.PluginInstallFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install extends StObject {
  
  var install: js.UndefOr[PluginInstallFunction] = js.undefined
}
object Install {
  
  inline def apply(): Install = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Install]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Install] (val x: Self) extends AnyVal {
    
    inline def setInstall(value: PluginInstallFunction): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
  }
}
