package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxMint extends StObject {
  
  var asset_groups_count: Double
}
object CardanoTxMint {
  
  inline def apply(asset_groups_count: Double): CardanoTxMint = {
    val __obj = js.Dynamic.literal(asset_groups_count = asset_groups_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxMint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoTxMint] (val x: Self) extends AnyVal {
    
    inline def setAsset_groups_count(value: Double): Self = StObject.set(x, "asset_groups_count", value.asInstanceOf[js.Any])
  }
}
