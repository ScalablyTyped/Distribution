package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfigurationCreate extends StObject {
  
  val Features: TypeofFeatures
}
object TypeofConfigurationCreate {
  
  inline def apply(Features: TypeofFeatures): TypeofConfigurationCreate = {
    val __obj = js.Dynamic.literal(Features = Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfigurationCreate]
  }
  
  extension [Self <: TypeofConfigurationCreate](x: Self) {
    
    inline def setFeatures(value: TypeofFeatures): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
  }
}
