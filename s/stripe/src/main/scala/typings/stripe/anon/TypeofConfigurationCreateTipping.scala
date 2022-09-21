package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfigurationCreateTipping extends StObject {
  
  val Tipping: Any
}
object TypeofConfigurationCreateTipping {
  
  inline def apply(Tipping: Any): TypeofConfigurationCreateTipping = {
    val __obj = js.Dynamic.literal(Tipping = Tipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfigurationCreateTipping]
  }
  
  extension [Self <: TypeofConfigurationCreateTipping](x: Self) {
    
    inline def setTipping(value: Any): Self = StObject.set(x, "Tipping", value.asInstanceOf[js.Any])
  }
}
