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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofConfigurationCreateTipping] (val x: Self) extends AnyVal {
    
    inline def setTipping(value: Any): Self = StObject.set(x, "Tipping", value.asInstanceOf[js.Any])
  }
}
