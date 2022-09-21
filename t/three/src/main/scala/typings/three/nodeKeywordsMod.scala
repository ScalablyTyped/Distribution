package typings.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeKeywordsMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeKeywords", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeKeywords {
    
    /* CompleteClass */
    override def addKeyword(name: String, callback: js.Function1[/* name */ String, typings.three.nodeMod.default]): Unit = js.native
    
    /* CompleteClass */
    override def getNode(name: String): typings.three.nodeMod.default = js.native
    
    /* CompleteClass */
    override def include(builder: typings.three.nodeBuilderMod.default, code: String): Unit = js.native
    
    /* CompleteClass */
    var keywords: js.Array[String] = js.native
    
    /* CompleteClass */
    var keywordsCallback: StringDictionary[js.Function1[/* name */ String, typings.three.nodeMod.default]] = js.native
    
    /* CompleteClass */
    var nodes: js.Array[typings.three.nodeMod.default] = js.native
    
    /* CompleteClass */
    override def parse(code: String): js.Array[typings.three.nodeMod.default] = js.native
  }
  
  trait NodeKeywords extends StObject {
    
    def addKeyword(name: String, callback: js.Function1[/* name */ String, typings.three.nodeMod.default]): Unit
    
    def getNode(name: String): typings.three.nodeMod.default
    
    def include(builder: typings.three.nodeBuilderMod.default, code: String): Unit
    
    var keywords: js.Array[String]
    
    var keywordsCallback: StringDictionary[js.Function1[/* name */ String, typings.three.nodeMod.default]]
    
    var nodes: js.Array[typings.three.nodeMod.default]
    
    def parse(code: String): js.Array[typings.three.nodeMod.default]
  }
  object NodeKeywords {
    
    inline def apply(
      addKeyword: (String, js.Function1[/* name */ String, typings.three.nodeMod.default]) => Unit,
      getNode: String => typings.three.nodeMod.default,
      include: (typings.three.nodeBuilderMod.default, String) => Unit,
      keywords: js.Array[String],
      keywordsCallback: StringDictionary[js.Function1[/* name */ String, typings.three.nodeMod.default]],
      nodes: js.Array[typings.three.nodeMod.default],
      parse: String => js.Array[typings.three.nodeMod.default]
    ): NodeKeywords = {
      val __obj = js.Dynamic.literal(addKeyword = js.Any.fromFunction2(addKeyword), getNode = js.Any.fromFunction1(getNode), include = js.Any.fromFunction2(include), keywords = keywords.asInstanceOf[js.Any], keywordsCallback = keywordsCallback.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[NodeKeywords]
    }
    
    extension [Self <: NodeKeywords](x: Self) {
      
      inline def setAddKeyword(value: (String, js.Function1[/* name */ String, typings.three.nodeMod.default]) => Unit): Self = StObject.set(x, "addKeyword", js.Any.fromFunction2(value))
      
      inline def setGetNode(value: String => typings.three.nodeMod.default): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
      
      inline def setInclude(value: (typings.three.nodeBuilderMod.default, String) => Unit): Self = StObject.set(x, "include", js.Any.fromFunction2(value))
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsCallback(value: StringDictionary[js.Function1[/* name */ String, typings.three.nodeMod.default]]): Self = StObject.set(x, "keywordsCallback", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setNodes(value: js.Array[typings.three.nodeMod.default]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: typings.three.nodeMod.default*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setParse(value: String => js.Array[typings.three.nodeMod.default]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
