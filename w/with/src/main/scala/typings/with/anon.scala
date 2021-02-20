package typings.`with`

import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.ThisExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var nodes: js.Array[Identifier_ | ThisExpression_] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, nodes: js.Array[Identifier_ | ThisExpression_]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[Identifier_ | ThisExpression_]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: (Identifier_ | ThisExpression_)*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
}
