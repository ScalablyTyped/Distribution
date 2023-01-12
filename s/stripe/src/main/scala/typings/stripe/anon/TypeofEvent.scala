package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEvent extends StObject {
  
  val Data: Any
}
object TypeofEvent {
  
  inline def apply(Data: Any): TypeofEvent = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
