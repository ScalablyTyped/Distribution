package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var root: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
}
object Root {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    root: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  ): Root = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
