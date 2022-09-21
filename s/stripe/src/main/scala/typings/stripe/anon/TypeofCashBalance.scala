package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCashBalance extends StObject {
  
  val Settings: Any
}
object TypeofCashBalance {
  
  inline def apply(Settings: Any): TypeofCashBalance = {
    val __obj = js.Dynamic.literal(Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCashBalance]
  }
  
  extension [Self <: TypeofCashBalance](x: Self) {
    
    inline def setSettings(value: Any): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
