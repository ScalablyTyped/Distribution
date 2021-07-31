package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iban extends StObject {
  
  var iban: js.UndefOr[String] = js.undefined
  
  var ideal: js.UndefOr[String] = js.undefined
}
object Iban {
  
  @scala.inline
  def apply(): Iban = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iban]
  }
  
  @scala.inline
  implicit class IbanMutableBuilder[Self <: Iban] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIbanUndefined: Self = StObject.set(x, "iban", js.undefined)
    
    @scala.inline
    def setIdeal(value: String): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
  }
}
