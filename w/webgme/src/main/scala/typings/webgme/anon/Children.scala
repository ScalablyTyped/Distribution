package typings.webgme.anon

import typings.webgme.Core.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  
  var node: Node
}
object Children {
  
  @scala.inline
  def apply(node: Node): Children = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
