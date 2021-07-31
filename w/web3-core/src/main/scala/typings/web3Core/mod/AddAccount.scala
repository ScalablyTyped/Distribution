package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAccount extends StObject {
  
  var address: String
  
  var privateKey: String
}
object AddAccount {
  
  @scala.inline
  def apply(address: String, privateKey: String): AddAccount = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAccount]
  }
  
  @scala.inline
  implicit class AddAccountMutableBuilder[Self <: AddAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
