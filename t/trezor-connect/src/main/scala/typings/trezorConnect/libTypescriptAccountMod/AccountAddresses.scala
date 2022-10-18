package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAddresses extends StObject {
  
  var change: js.Array[AccountAddress]
  
  var unused: js.Array[AccountAddress]
  
  var used: js.Array[AccountAddress]
}
object AccountAddresses {
  
  inline def apply(change: js.Array[AccountAddress], unused: js.Array[AccountAddress], used: js.Array[AccountAddress]): AccountAddresses = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], unused = unused.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAddresses]
  }
  
  extension [Self <: AccountAddresses](x: Self) {
    
    inline def setChange(value: js.Array[AccountAddress]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeVarargs(value: AccountAddress*): Self = StObject.set(x, "change", js.Array(value*))
    
    inline def setUnused(value: js.Array[AccountAddress]): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
    
    inline def setUnusedVarargs(value: AccountAddress*): Self = StObject.set(x, "unused", js.Array(value*))
    
    inline def setUsed(value: js.Array[AccountAddress]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedVarargs(value: AccountAddress*): Self = StObject.set(x, "used", js.Array(value*))
  }
}
