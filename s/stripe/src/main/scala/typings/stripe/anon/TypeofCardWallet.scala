package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardWallet extends StObject {
  
  val Wallet: Any
}
object TypeofCardWallet {
  
  inline def apply(Wallet: Any): TypeofCardWallet = {
    val __obj = js.Dynamic.literal(Wallet = Wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardWallet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardWallet] (val x: Self) extends AnyVal {
    
    inline def setWallet(value: Any): Self = StObject.set(x, "Wallet", value.asInstanceOf[js.Any])
  }
}
