package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.trezorConnectInts.`0x4001`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaicCreationTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var creationFee: Double
  
  var creationFeeSink: String
  
  var mosaicDefinition: MosaicDefinition
  
  var `type`: `0x4001`
}
object NEMMosaicCreationTransaction {
  
  inline def apply(
    creationFee: Double,
    creationFeeSink: String,
    deadline: Double,
    fee: Double,
    mosaicDefinition: MosaicDefinition,
    timeStamp: Double,
    version: Double
  ): NEMMosaicCreationTransaction = {
    val __obj = js.Dynamic.literal(creationFee = creationFee.asInstanceOf[js.Any], creationFeeSink = creationFeeSink.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], mosaicDefinition = mosaicDefinition.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x4001)
    __obj.asInstanceOf[NEMMosaicCreationTransaction]
  }
  
  extension [Self <: NEMMosaicCreationTransaction](x: Self) {
    
    inline def setCreationFee(value: Double): Self = StObject.set(x, "creationFee", value.asInstanceOf[js.Any])
    
    inline def setCreationFeeSink(value: String): Self = StObject.set(x, "creationFeeSink", value.asInstanceOf[js.Any])
    
    inline def setMosaicDefinition(value: MosaicDefinition): Self = StObject.set(x, "mosaicDefinition", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x4001`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
