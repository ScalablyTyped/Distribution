package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Nodes extends StObject {
    
    var nodes: StringDictionary[js.Array[String]]
    
    var rootIds: js.Array[String]
  }
  object Nodes {
    
    inline def apply(nodes: StringDictionary[js.Array[String]], rootIds: js.Array[String]): Nodes = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nodes]
    }
    
    extension [Self <: Nodes](x: Self) {
      
      inline def setNodes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setRootIds(value: js.Array[String]): Self = StObject.set(x, "rootIds", value.asInstanceOf[js.Any])
      
      inline def setRootIdsVarargs(value: String*): Self = StObject.set(x, "rootIds", js.Array(value :_*))
    }
  }
}
