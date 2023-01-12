package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProductCreateParams extends StObject {
  
  val DefaultPriceData: TypeofDefaultPriceData
}
object TypeofProductCreateParams {
  
  inline def apply(DefaultPriceData: TypeofDefaultPriceData): TypeofProductCreateParams = {
    val __obj = js.Dynamic.literal(DefaultPriceData = DefaultPriceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProductCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofProductCreateParams] (val x: Self) extends AnyVal {
    
    inline def setDefaultPriceData(value: TypeofDefaultPriceData): Self = StObject.set(x, "DefaultPriceData", value.asInstanceOf[js.Any])
  }
}
