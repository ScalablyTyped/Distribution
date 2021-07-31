package typings.tern.anon

import typings.tern.inferMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: typings.estree.mod.Node
  
  var state: Scope
}
object Node {
  
  @scala.inline
  def apply(node: typings.estree.mod.Node, state: Scope): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: typings.estree.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Scope): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
