package typings.vueRuntimeCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppContext extends StObject {
  
  var app: App[Any]
  
  var components: Record[String, Component[Any, Any, Any, ComputedOptions, MethodOptions]]
  
  var config: AppConfig
  
  var directives: Record[String, Directive[Any, Any]]
  
  var mixins: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]
  
  var provides: Record[String | js.Symbol, Any]
}
object AppContext {
  
  inline def apply(
    app: App[Any],
    components: Record[String, Component[Any, Any, Any, ComputedOptions, MethodOptions]],
    config: AppConfig,
    directives: Record[String, Directive[Any, Any]],
    mixins: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]],
    provides: Record[String | js.Symbol, Any]
  ): AppContext = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], provides = provides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppContext] (val x: Self) extends AnyVal {
    
    inline def setApp(value: App[Any]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: Record[String, Component[Any, Any, Any, ComputedOptions, MethodOptions]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: AppConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDirectives(value: Record[String, Directive[Any, Any]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setMixins(value: js.Array[ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsVarargs(value: (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any])*): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setProvides(value: Record[String | js.Symbol, Any]): Self = StObject.set(x, "provides", value.asInstanceOf[js.Any])
  }
}
