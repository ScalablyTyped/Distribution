package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCashBalanceUpdatePa extends StObject {
  
  val Settings: Any
}
object TypeofCashBalanceUpdatePa {
  
  inline def apply(Settings: Any): TypeofCashBalanceUpdatePa = {
    val __obj = js.Dynamic.literal(Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCashBalanceUpdatePa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCashBalanceUpdatePa] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: Any): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
