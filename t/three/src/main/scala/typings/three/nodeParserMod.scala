package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeParserMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeParser", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with NodeParser {
    
    /* CompleteClass */
    override def parseFunction(source: String): typings.three.nodeMod.default = js.native
  }
  
  trait NodeParser extends StObject {
    
    def parseFunction(source: String): typings.three.nodeMod.default
  }
  object NodeParser {
    
    inline def apply(parseFunction: String => typings.three.nodeMod.default): NodeParser = {
      val __obj = js.Dynamic.literal(parseFunction = js.Any.fromFunction1(parseFunction))
      __obj.asInstanceOf[NodeParser]
    }
    
    extension [Self <: NodeParser](x: Self) {
      
      inline def setParseFunction(value: String => typings.three.nodeMod.default): Self = StObject.set(x, "parseFunction", js.Any.fromFunction1(value))
    }
  }
}
