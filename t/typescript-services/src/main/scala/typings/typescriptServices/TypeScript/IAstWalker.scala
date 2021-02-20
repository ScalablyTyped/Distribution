package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAstWalker extends StObject {
  
  var options: AstWalkOptions = js.native
  
  var state: js.Any = js.native
}
object IAstWalker {
  
  @scala.inline
  def apply(options: AstWalkOptions, state: js.Any): IAstWalker = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAstWalker]
  }
  
  @scala.inline
  implicit class IAstWalkerMutableBuilder[Self <: IAstWalker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AstWalkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
