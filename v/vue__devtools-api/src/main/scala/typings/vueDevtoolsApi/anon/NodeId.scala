package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiApiMod.CustomInspectorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeId extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var inspectorId: String
  
  var nodeId: String
  
  var state: CustomInspectorState
}
object NodeId {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    inspectorId: String,
    nodeId: String,
    state: CustomInspectorState
  ): NodeId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], inspectorId = inspectorId.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeId] (val x: Self) extends AnyVal {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setInspectorId(value: String): Self = StObject.set(x, "inspectorId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setState(value: CustomInspectorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
