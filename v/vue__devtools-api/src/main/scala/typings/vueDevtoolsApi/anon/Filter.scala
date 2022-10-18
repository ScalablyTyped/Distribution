package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var app: typings.vueDevtoolsApi.libEsmApiAppMod.App
  
  var componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var filter: String
  
  var treeNode: ComponentTreeNode
}
object Filter {
  
  inline def apply(
    app: typings.vueDevtoolsApi.libEsmApiAppMod.App,
    componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    filter: String,
    treeNode: ComponentTreeNode
  ): Filter = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], treeNode = treeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.libEsmApiAppMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setTreeNode(value: ComponentTreeNode): Self = StObject.set(x, "treeNode", value.asInstanceOf[js.Any])
  }
}
