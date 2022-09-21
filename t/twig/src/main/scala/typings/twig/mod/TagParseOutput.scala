package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagParseOutput extends StObject {
  
  var chain: Boolean
  
  var output: String
}
object TagParseOutput {
  
  inline def apply(chain: Boolean, output: String): TagParseOutput = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagParseOutput]
  }
  
  extension [Self <: TagParseOutput](x: Self) {
    
    inline def setChain(value: Boolean): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
