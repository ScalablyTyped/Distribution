package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAstWalker extends StObject {
  
  var options: AstWalkOptions
  
  var state: Any
}
object IAstWalker {
  
  inline def apply(options: AstWalkOptions, state: Any): IAstWalker = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAstWalker]
  }
  
  extension [Self <: IAstWalker](x: Self) {
    
    inline def setOptions(value: AstWalkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
