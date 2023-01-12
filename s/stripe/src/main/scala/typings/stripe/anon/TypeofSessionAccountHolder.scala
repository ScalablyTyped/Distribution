package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionAccountHolder extends StObject {
  
  val AccountHolder: Any
}
object TypeofSessionAccountHolder {
  
  inline def apply(AccountHolder: Any): TypeofSessionAccountHolder = {
    val __obj = js.Dynamic.literal(AccountHolder = AccountHolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionAccountHolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSessionAccountHolder] (val x: Self) extends AnyVal {
    
    inline def setAccountHolder(value: Any): Self = StObject.set(x, "AccountHolder", value.asInstanceOf[js.Any])
  }
}
