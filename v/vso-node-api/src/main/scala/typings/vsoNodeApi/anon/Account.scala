package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  var account: scala.Double = js.native
  
  var all: scala.Double = js.native
  
  var collection: scala.Double = js.native
  
  var deployment: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object Account {
  
  @scala.inline
  def apply(
    account: scala.Double,
    all: scala.Double,
    collection: scala.Double,
    deployment: scala.Double,
    none: scala.Double
  ): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: scala.Double): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: scala.Double): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: scala.Double): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
}
