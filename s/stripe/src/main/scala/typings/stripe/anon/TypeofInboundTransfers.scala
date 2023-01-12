package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInboundTransfers extends StObject {
  
  val Ach: TypeofAch
}
object TypeofInboundTransfers {
  
  inline def apply(Ach: TypeofAch): TypeofInboundTransfers = {
    val __obj = js.Dynamic.literal(Ach = Ach.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInboundTransfers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInboundTransfers] (val x: Self) extends AnyVal {
    
    inline def setAch(value: TypeofAch): Self = StObject.set(x, "Ach", value.asInstanceOf[js.Any])
  }
}
