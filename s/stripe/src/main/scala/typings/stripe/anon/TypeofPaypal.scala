package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaypal extends StObject {
  
  val SellerProtection: Any
}
object TypeofPaypal {
  
  inline def apply(SellerProtection: Any): TypeofPaypal = {
    val __obj = js.Dynamic.literal(SellerProtection = SellerProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaypal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaypal] (val x: Self) extends AnyVal {
    
    inline def setSellerProtection(value: Any): Self = StObject.set(x, "SellerProtection", value.asInstanceOf[js.Any])
  }
}
