package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSession extends StObject {
  
  val Flow: TypeofFlow
}
object TypeofSession {
  
  inline def apply(Flow: TypeofFlow): TypeofSession = {
    val __obj = js.Dynamic.literal(Flow = Flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSession] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: TypeofFlow): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
  }
}
