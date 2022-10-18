package typings.tern.anon

import typings.tern.libInferMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: typings.estree.mod.Node
  
  var state: Scope | Null
}
object Node {
  
  inline def apply(node: typings.estree.mod.Node): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = null)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: typings.estree.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setState(value: Scope): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
  }
}
