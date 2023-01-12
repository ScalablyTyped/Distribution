package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUsDomesticWire extends StObject {
  
  val StatusDetail: Any
}
object TypeofUsDomesticWire {
  
  inline def apply(StatusDetail: Any): TypeofUsDomesticWire = {
    val __obj = js.Dynamic.literal(StatusDetail = StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUsDomesticWire]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUsDomesticWire] (val x: Self) extends AnyVal {
    
    inline def setStatusDetail(value: Any): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
  }
}
