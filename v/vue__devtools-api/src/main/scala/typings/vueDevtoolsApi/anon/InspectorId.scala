package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiApiMod.CustomInspectorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorId extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var filter: String
  
  var inspectorId: String
  
  var rootNodes: js.Array[CustomInspectorNode]
}
object InspectorId {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    filter: String,
    inspectorId: String,
    rootNodes: js.Array[CustomInspectorNode]
  ): InspectorId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], inspectorId = inspectorId.asInstanceOf[js.Any], rootNodes = rootNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectorId] (val x: Self) extends AnyVal {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setInspectorId(value: String): Self = StObject.set(x, "inspectorId", value.asInstanceOf[js.Any])
    
    inline def setRootNodes(value: js.Array[CustomInspectorNode]): Self = StObject.set(x, "rootNodes", value.asInstanceOf[js.Any])
    
    inline def setRootNodesVarargs(value: CustomInspectorNode*): Self = StObject.set(x, "rootNodes", js.Array(value*))
  }
}
