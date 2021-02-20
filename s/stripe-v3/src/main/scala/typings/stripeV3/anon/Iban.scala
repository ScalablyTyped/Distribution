package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iban extends StObject {
  
  /*
    * An IBAN account number.
    */
  var iban: String = js.native
}
object Iban {
  
  @scala.inline
  def apply(iban: String): Iban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iban]
  }
  
  @scala.inline
  implicit class IbanMutableBuilder[Self <: Iban] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
  }
}
