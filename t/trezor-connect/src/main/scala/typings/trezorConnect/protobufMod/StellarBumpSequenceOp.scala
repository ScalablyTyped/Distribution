package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarBumpSequenceOp extends StObject {
  
  var bump_to: UintType
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarBumpSequenceOp {
  
  inline def apply(bump_to: UintType): StellarBumpSequenceOp = {
    val __obj = js.Dynamic.literal(bump_to = bump_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarBumpSequenceOp]
  }
  
  extension [Self <: StellarBumpSequenceOp](x: Self) {
    
    inline def setBump_to(value: UintType): Self = StObject.set(x, "bump_to", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
