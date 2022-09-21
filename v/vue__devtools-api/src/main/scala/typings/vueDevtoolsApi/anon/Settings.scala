package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var settings: /* import warning: importer.ImportType#apply Failed type conversion: infer S */ js.Any
}
object Settings {
  
  inline def apply(settings: /* import warning: importer.ImportType#apply Failed type conversion: infer S */ js.Any): Settings = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setSettings(value: /* import warning: importer.ImportType#apply Failed type conversion: infer S */ js.Any): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
