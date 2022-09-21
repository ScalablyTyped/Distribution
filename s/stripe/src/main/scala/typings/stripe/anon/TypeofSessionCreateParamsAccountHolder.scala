package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionCreateParamsAccountHolder extends StObject {
  
  val AccountHolder: Any
}
object TypeofSessionCreateParamsAccountHolder {
  
  inline def apply(AccountHolder: Any): TypeofSessionCreateParamsAccountHolder = {
    val __obj = js.Dynamic.literal(AccountHolder = AccountHolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionCreateParamsAccountHolder]
  }
  
  extension [Self <: TypeofSessionCreateParamsAccountHolder](x: Self) {
    
    inline def setAccountHolder(value: Any): Self = StObject.set(x, "AccountHolder", value.asInstanceOf[js.Any])
  }
}
