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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofConfigurationUpdateTipping] (val x: Self) extends AnyVal {
    
    inline def setTipping(value: Any): Self = StObject.set(x, "Tipping", value.asInstanceOf[js.Any])
  }
}
