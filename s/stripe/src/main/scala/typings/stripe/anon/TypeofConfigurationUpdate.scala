package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfigurationUpdate extends StObject {
  
  val Features: TypeofFeatures
}
object TypeofConfigurationUpdate {
  
  inline def apply(Features: TypeofFeatures): TypeofConfigurationUpdate = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfigurationUpdate]
  }
  
  extension [Self <: TypeofConfigurationUpdate](x: Self) {
    
    inline def setFeatures(value: TypeofFeatures): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
  }
}
