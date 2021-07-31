package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bank extends StObject {
  
  var bank: js.UndefOr[String] = js.undefined
}
object Bank {
  
  @scala.inline
  def apply(): Bank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bank]
  }
  
  @scala.inline
  implicit class BankMutableBuilder[Self <: Bank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBank(value: String): Self = StObject.set(x, "bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankUndefined: Self = StObject.set(x, "bank", js.undefined)
  }
}
