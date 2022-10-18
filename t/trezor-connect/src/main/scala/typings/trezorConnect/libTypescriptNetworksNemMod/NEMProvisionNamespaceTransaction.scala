package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.trezorConnectInts.`0x2001`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMProvisionNamespaceTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var newPart: String
  
  var parent: js.UndefOr[String] = js.undefined
  
  var rentalFee: Double
  
  var rentalFeeSink: String
  
  var `type`: `0x2001`
}
object NEMProvisionNamespaceTransaction {
  
  inline def apply(
    deadline: Double,
    fee: Double,
    newPart: String,
    rentalFee: Double,
    rentalFeeSink: String,
    timeStamp: Double,
    version: Double
  ): NEMProvisionNamespaceTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], newPart = newPart.asInstanceOf[js.Any], rentalFee = rentalFee.asInstanceOf[js.Any], rentalFeeSink = rentalFeeSink.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x2001)
    __obj.asInstanceOf[NEMProvisionNamespaceTransaction]
  }
  
  extension [Self <: NEMProvisionNamespaceTransaction](x: Self) {
    
    inline def setNewPart(value: String): Self = StObject.set(x, "newPart", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRentalFee(value: Double): Self = StObject.set(x, "rentalFee", value.asInstanceOf[js.Any])
    
    inline def setRentalFeeSink(value: String): Self = StObject.set(x, "rentalFeeSink", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x2001`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
