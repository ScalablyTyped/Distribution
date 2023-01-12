package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.AccountTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor extends StObject {
  
  var descriptor: String
  
  var tx: AccountTransaction
}
object Descriptor {
  
  inline def apply(descriptor: String, tx: AccountTransaction): Descriptor = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setTx(value: AccountTransaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
