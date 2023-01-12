package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPromotionCodeUpdate extends StObject {
  
  val Restrictions: Any
}
object TypeofPromotionCodeUpdate {
  
  inline def apply(Restrictions: Any): TypeofPromotionCodeUpdate = {
    val __obj = js.Dynamic.literal(Restrictions = Restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPromotionCodeUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPromotionCodeUpdate] (val x: Self) extends AnyVal {
    
    inline def setRestrictions(value: Any): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
  }
}
