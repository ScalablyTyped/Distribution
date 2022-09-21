package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.componentMod.ComponentTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var app: typings.vueDevtoolsApi.appMod.App
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance
  
  var filter: String
  
  var treeNode: ComponentTreeNode
}
object Filter {
  
  inline def apply(
    app: typings.vueDevtoolsApi.appMod.App,
    componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance,
    filter: String,
    treeNode: ComponentTreeNode
  ): Filter = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], treeNode = treeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setApp(value: typings.vueDevtoolsApi.appMod.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setTreeNode(value: ComponentTreeNode): Self = StObject.set(x, "treeNode", value.asInstanceOf[js.Any])
  }
}
