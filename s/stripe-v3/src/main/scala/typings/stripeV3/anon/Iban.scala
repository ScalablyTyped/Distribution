package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iban extends StObject {
  
  /*
    * An IBAN account number.
    */
  var iban: String
}
object Iban {
  
  inline def apply(iban: String): Iban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iban]
  }
  
  extension [Self <: Iban](x: Self) {
    
    inline def setIban(value: String): Self = StObject.set(x, "iban", value.asInstanceOf[js.Any])
  }
}
