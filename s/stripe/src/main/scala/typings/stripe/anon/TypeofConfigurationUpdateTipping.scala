package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfigurationUpdateTipping extends StObject {
  
  val Tipping: Any
}
object TypeofConfigurationUpdateTipping {
  
  inline def apply(Tipping: Any): TypeofConfigurationUpdateTipping = {
    val __obj = js.Dynamic.literal(Tipping = Tipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfigurationUpdateTipping]
  }
  
  extension [Self <: TypeofConfigurationUpdateTipping](x: Self) {
    
    inline def setTipping(value: Any): Self = StObject.set(x, "Tipping", value.asInstanceOf[js.Any])
  }
}
