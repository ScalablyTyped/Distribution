package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPromotionCode extends StObject {
  
  val Restrictions: Any
}
object TypeofPromotionCode {
  
  inline def apply(Restrictions: Any): TypeofPromotionCode = {
    val __obj = js.Dynamic.literal(Restrictions = Restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPromotionCode]
  }
  
  extension [Self <: TypeofPromotionCode](x: Self) {
    
    inline def setRestrictions(value: Any): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
  }
}
