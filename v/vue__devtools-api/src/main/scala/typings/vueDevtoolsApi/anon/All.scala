package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiApiMod.TimelineEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var data: Any
  
  var event: TimelineEvent[Any, Any]
  
  var layerId: String
}
object All {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    data: Any,
    event: TimelineEvent[Any, Any],
    layerId: String
  ): All = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TimelineEvent[Any, Any]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
