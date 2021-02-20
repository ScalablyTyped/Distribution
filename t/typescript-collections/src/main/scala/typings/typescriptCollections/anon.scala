package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Nodes extends StObject {
    
    var nodes: StringDictionary[js.Array[String]] = js.native
    
    var rootIds: js.Array[String] = js.native
  }
  object Nodes {
    
    @scala.inline
    def apply(nodes: StringDictionary[js.Array[String]], rootIds: js.Array[String]): Nodes = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes]
    }
    
    @scala.inline
    implicit class NodesMutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIds(value: js.Array[String]): Self = StObject.set(x, "rootIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIdsVarargs(value: String*): Self = StObject.set(x, "rootIds", js.Array(value :_*))
    }
  }
}
