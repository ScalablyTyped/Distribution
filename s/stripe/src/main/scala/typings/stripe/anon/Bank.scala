package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bank extends js.Object {
  
  var bank: js.UndefOr[String] = js.native
}
object Bank {
  
  @scala.inline
  def apply(): Bank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bank]
  }
  
  @scala.inline
  implicit class BankOps[Self <: Bank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBank(value: String): Self = this.set("bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBank: Self = this.set("bank", js.undefined)
  }
}
