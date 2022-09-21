package typings.twig.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagTokenWithOutput
  extends StObject
     with TagToken {
  
  var output: js.Array[RawOutput]
}
object TagTokenWithOutput {
  
  inline def apply(`match`: RegExpExecArray, output: js.Array[RawOutput], `type`: String): TagTokenWithOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagTokenWithOutput]
  }
  
  extension [Self <: TagTokenWithOutput](x: Self) {
    
    inline def setOutput(value: js.Array[RawOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputVarargs(value: RawOutput*): Self = StObject.set(x, "output", js.Array(value*))
  }
}
