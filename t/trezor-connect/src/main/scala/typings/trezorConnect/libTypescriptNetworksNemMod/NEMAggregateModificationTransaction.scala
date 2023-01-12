package typings.trezorConnect.libTypescriptNetworksNemMod

import typings.trezorConnect.anon.RelativeChange
import typings.trezorConnect.trezorConnectInts.`0x1001`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMAggregateModificationTransaction
  extends StObject
     with TransactionCommon
     with NEMRegularTransaction {
  
  var minCosignatories: RelativeChange
  
  var modifications: js.UndefOr[js.Array[Modification]] = js.undefined
  
  var `type`: `0x1001`
}
object NEMAggregateModificationTransaction {
  
  inline def apply(
    deadline: Double,
    fee: Double,
    minCosignatories: RelativeChange,
    timeStamp: Double,
    version: Double
  ): NEMAggregateModificationTransaction = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], minCosignatories = minCosignatories.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x1001)
    __obj.asInstanceOf[NEMAggregateModificationTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMAggregateModificationTransaction] (val x: Self) extends AnyVal {
    
    inline def setMinCosignatories(value: RelativeChange): Self = StObject.set(x, "minCosignatories", value.asInstanceOf[js.Any])
    
    inline def setModifications(value: js.Array[Modification]): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    inline def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
    
    inline def setModificationsVarargs(value: Modification*): Self = StObject.set(x, "modifications", js.Array(value*))
    
    inline def setType(value: `0x1001`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
