package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var nodes: Unit
  
  var source: Input
}
object Nodes {
  
  inline def apply(nodes: Unit, source: Input): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: Unit): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Input): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
