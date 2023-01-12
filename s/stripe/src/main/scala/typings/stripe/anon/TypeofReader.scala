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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReader] (val x: Self) extends AnyVal {
    
    inline def setAction(value: TypeofAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
  }
}
