package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAba extends StObject {
  
  val StatusDetail: Any
}
object TypeofAba {
  
  inline def apply(StatusDetail: Any): TypeofAba = {
    val __obj = js.Dynamic.literal(StatusDetail = StatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAba]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAba] (val x: Self) extends AnyVal {
    
    inline def setStatusDetail(value: Any): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
  }
}
