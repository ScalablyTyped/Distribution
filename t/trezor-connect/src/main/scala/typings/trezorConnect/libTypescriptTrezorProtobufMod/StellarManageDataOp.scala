package typings.trezorConnect.libTypescriptTrezorProtobufMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarManageDataOp extends StObject {
  
  var key: String
  
  var source_account: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Buffer | String] = js.undefined
}
object StellarManageDataOp {
  
  inline def apply(key: String): StellarManageDataOp = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarManageDataOp]
  }
  
  extension [Self <: StellarManageDataOp](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
    
    inline def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
