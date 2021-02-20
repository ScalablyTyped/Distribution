package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
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
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: scala.Double): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: scala.Double): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: scala.Double): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
