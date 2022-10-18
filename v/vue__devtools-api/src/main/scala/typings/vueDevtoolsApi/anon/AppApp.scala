package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppApp extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
}
object AppApp {
  
  inline def apply(app: typings.vueDevtoolsApi.libEsmApiAppMod.App): AppApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppApp]
  }
  
  extension [Self <: AppApp](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
