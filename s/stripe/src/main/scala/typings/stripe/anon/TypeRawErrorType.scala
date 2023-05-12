package typings.stripe.anon

import typings.stripe.mod.Stripe.RawErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeRawErrorType extends StObject {
  
  var `type`: RawErrorType
}
object TypeRawErrorType {
  
  inline def apply(`type`: RawErrorType): TypeRawErrorType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeRawErrorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeRawErrorType] (val x: Self) extends AnyVal {
    
    inline def setType(value: RawErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
