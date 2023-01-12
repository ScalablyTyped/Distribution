package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPromotionCodeCreate extends StObject {
  
  val Restrictions: Any
}
object TypeofPromotionCodeCreate {
  
  inline def apply(Restrictions: Any): TypeofPromotionCodeCreate = {
    val __obj = js.Dynamic.literal(Restrictions = Restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPromotionCodeCreate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPromotionCodeCreate] (val x: Self) extends AnyVal {
    
    inline def setRestrictions(value: Any): Self = StObject.set(x, "Restrictions", value.asInstanceOf[js.Any])
  }
}
