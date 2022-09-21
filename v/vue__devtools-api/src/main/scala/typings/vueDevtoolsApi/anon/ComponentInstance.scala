package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.componentMod.ComponentTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInstance extends StObject {
  
  var componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance
  
  var componentTreeData: js.Array[ComponentTreeNode]
  
  var filter: String
  
  var maxDepth: Double
}
object ComponentInstance {
  
  inline def apply(
    componentInstance: typings.vueDevtoolsApi.componentMod.ComponentInstance,
    componentTreeData: js.Array[ComponentTreeNode],
    filter: String,
    maxDepth: Double
  ): ComponentInstance = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], componentTreeData = componentTreeData.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInstance]
  }
  
  extension [Self <: ComponentInstance](x: Self) {
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.componentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setComponentTreeData(value: js.Array[ComponentTreeNode]): Self = StObject.set(x, "componentTreeData", value.asInstanceOf[js.Any])
    
    inline def setComponentTreeDataVarargs(value: ComponentTreeNode*): Self = StObject.set(x, "componentTreeData", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
  }
}
