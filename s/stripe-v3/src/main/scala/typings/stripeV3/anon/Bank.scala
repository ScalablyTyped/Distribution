package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bank extends StObject {
  
  var bank: String = js.native
}
object Bank {
  
  @scala.inline
  def apply(bank: String): Bank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
  
  @scala.inline
  implicit class BankMutableBuilder[Self <: Bank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank(value: String): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
  }
}
