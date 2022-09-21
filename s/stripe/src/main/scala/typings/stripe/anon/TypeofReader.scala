package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReader extends StObject {
  
  val Action: TypeofAction
}
object TypeofReader {
  
  inline def apply(Action: TypeofAction): TypeofReader = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReader]
  }
  
  extension [Self <: TypeofReader](x: Self) {
    
    inline def setAction(value: TypeofAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
  }
}
