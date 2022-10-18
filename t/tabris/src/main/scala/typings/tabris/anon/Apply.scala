package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  @JSName("apply")
  var apply: js.Object
}
object Apply {
  
  inline def apply(apply: js.Object): Apply = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apply]
  }
  
  extension [Self <: Apply](x: Self) {
    
    inline def setApply(value: js.Object): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
  }
}
