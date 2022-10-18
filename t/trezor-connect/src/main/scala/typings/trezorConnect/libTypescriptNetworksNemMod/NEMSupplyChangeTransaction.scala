package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.trezorConnectInts.`0x4002`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMSupplyChangeTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var delta: Double
  
  var mosaicId: MosaicID
  
  var supplyType: Double
  
  var `type`: `0x4002`
}
object NEMSupplyChangeTransaction {
  
  inline def apply(
    deadline: Double,
    delta: Double,
    fee: Double,
    mosaicId: MosaicID,
    supplyType: Double,
    timeStamp: Double,
    version: Double
  ): NEMSupplyChangeTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], mosaicId = mosaicId.asInstanceOf[js.Any], supplyType = supplyType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x4002)
    __obj.asInstanceOf[NEMSupplyChangeTransaction]
  }
  
  extension [Self <: NEMSupplyChangeTransaction](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setMosaicId(value: MosaicID): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    
    inline def setSupplyType(value: Double): Self = StObject.set(x, "supplyType", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x4002`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
