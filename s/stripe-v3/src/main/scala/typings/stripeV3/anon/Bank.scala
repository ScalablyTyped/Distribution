package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bank extends StObject {
  
  var bank: String
}
object Bank {
  
  inline def apply(bank: String): Bank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bank] (val x: Self) extends AnyVal {
    
    inline def setBank(value: String): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
  }
}
