package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofStatusDetailsBlocked extends StObject {
  
  val Blocked: Any
}
object TypeofStatusDetailsBlocked {
  
  inline def apply(Blocked: Any): TypeofStatusDetailsBlocked = {
    val __obj = js.Dynamic.literal(Blocked = Blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStatusDetailsBlocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofStatusDetailsBlocked] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: Any): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
  }
}
