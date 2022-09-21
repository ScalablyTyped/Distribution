package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var app: typings.vueDevtoolsApi.appMod.App
  
  var root: typings.vueDevtoolsApi.componentMod.ComponentInstance
}
object Root {
  
  inline def apply(
    app: typings.vueDevtoolsApi.appMod.App,
    root: typings.vueDevtoolsApi.componentMod.ComponentInstance
  ): Root = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.appMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
