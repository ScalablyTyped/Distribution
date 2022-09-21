package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEvidence extends StObject {
  
  val Canceled: Any
  
  val MerchandiseNotAsDescribed: Any
  
  val NotReceived: Any
  
  val Other: Any
}
object TypeofEvidence {
  
  inline def apply(Canceled: Any, MerchandiseNotAsDescribed: Any, NotReceived: Any, Other: Any): TypeofEvidence = {
    val __obj = js.Dynamic.literal(Canceled = Canceled.asInstanceOf[js.Any], MerchandiseNotAsDescribed = MerchandiseNotAsDescribed.asInstanceOf[js.Any], NotReceived = NotReceived.asInstanceOf[js.Any], Other = Other.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEvidence]
  }
  
  extension [Self <: TypeofEvidence](x: Self) {
    
    inline def setCanceled(value: Any): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
    
    inline def setMerchandiseNotAsDescribed(value: Any): Self = StObject.set(x, "MerchandiseNotAsDescribed", value.asInstanceOf[js.Any])
    
    inline def setNotReceived(value: Any): Self = StObject.set(x, "NotReceived", value.asInstanceOf[js.Any])
    
    inline def setOther(value: Any): Self = StObject.set(x, "Other", value.asInstanceOf[js.Any])
  }
}
