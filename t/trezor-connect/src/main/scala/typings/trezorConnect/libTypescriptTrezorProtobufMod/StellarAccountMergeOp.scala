package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarAccountMergeOp extends StObject {
  
  var destination_account: String
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarAccountMergeOp {
  
  inline def apply(destination_account: String): StellarAccountMergeOp = {
    val __obj = js.Dynamic.literal(destination_account = destination_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarAccountMergeOp]
  }
  
  extension [Self <: StellarAccountMergeOp](x: Self) {
    
    inline def setDestination_account(value: String): Self = StObject.set(x, "destination_account", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
