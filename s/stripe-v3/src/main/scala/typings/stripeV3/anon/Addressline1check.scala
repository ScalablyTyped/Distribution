package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addressline1check extends StObject {
  
  var address_line1_check: Boolean | Null = js.native
  
  var address_postal_code_check: Boolean | Null = js.native
  
  var cvc_check: Boolean | Null = js.native
}
object Addressline1check {
  
  @scala.inline
  def apply(): Addressline1check = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addressline1check]
  }
  
  @scala.inline
  implicit class Addressline1checkMutableBuilder[Self <: Addressline1check] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_line1_check(value: Boolean): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_checkNull: Self = StObject.set(x, "address_line1_check", null)
    
    @scala.inline
    def setAddress_postal_code_check(value: Boolean): Self = StObject.set(x, "address_postal_code_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_postal_code_checkNull: Self = StObject.set(x, "address_postal_code_check", null)
    
    @scala.inline
    def setCvc_check(value: Boolean): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_checkNull: Self = StObject.set(x, "cvc_check", null)
  }
}
