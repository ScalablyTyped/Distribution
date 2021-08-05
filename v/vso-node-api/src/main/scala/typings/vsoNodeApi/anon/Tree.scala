package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tree extends StObject {
  
  var none: scala.Double
  
  var tree: scala.Double
  
  var workItem: scala.Double
  
  var workItemLink: scala.Double
  
  var workItemTypeExtension: scala.Double
}
object Tree {
  
  inline def apply(
    none: scala.Double,
    tree: scala.Double,
    workItem: scala.Double,
    workItemLink: scala.Double,
    workItemTypeExtension: scala.Double
  ): Tree = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any], workItemTypeExtension = workItemTypeExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  extension [Self <: Tree](x: Self) {
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTree(value: scala.Double): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setWorkItem(value: scala.Double): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
    
    inline def setWorkItemLink(value: scala.Double): Self = StObject.set(x, "workItemLink", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeExtension(value: scala.Double): Self = StObject.set(x, "workItemTypeExtension", value.asInstanceOf[js.Any])
  }
}
