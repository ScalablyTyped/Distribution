package typings.stripe.mod.accounts

import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.bank_account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBankAccountListOptions extends IListOptions {
  
  var `object`: bank_account = js.native
}
object IBankAccountListOptions {
  
  @scala.inline
  def apply(`object`: bank_account): IBankAccountListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountListOptions]
  }
  
  @scala.inline
  implicit class IBankAccountListOptionsMutableBuilder[Self <: IBankAccountListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
