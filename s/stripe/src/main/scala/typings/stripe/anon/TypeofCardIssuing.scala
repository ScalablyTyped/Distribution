package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardIssuing extends StObject {
  
  val StatusDetail: Any
}
object TypeofCardIssuing {
  
  inline def apply(StatusDetail: Any): TypeofCardIssuing = {
    val __obj = js.Dynamic.literal(StatusDetail = StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardIssuing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardIssuing] (val x: Self) extends AnyVal {
    
    inline def setStatusDetail(value: Any): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
  }
}
