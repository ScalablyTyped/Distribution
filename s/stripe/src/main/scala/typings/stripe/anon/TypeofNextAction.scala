package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNextAction extends StObject {
  
  val DisplayBankTransferInstructions: TypeofDisplayBankTransfer
  
  val KonbiniDisplayDetails: TypeofKonbiniDisplayDetai
  
  val VerifyWithMicrodeposits: Any
}
object TypeofNextAction {
  
  inline def apply(
    DisplayBankTransferInstructions: TypeofDisplayBankTransfer,
    KonbiniDisplayDetails: TypeofKonbiniDisplayDetai,
    VerifyWithMicrodeposits: Any
  ): TypeofNextAction = {
    val __obj = js.Dynamic.literal(DisplayBankTransferInstructions = DisplayBankTransferInstructions.asInstanceOf[js.Any], KonbiniDisplayDetails = KonbiniDisplayDetails.asInstanceOf[js.Any], VerifyWithMicrodeposits = VerifyWithMicrodeposits.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNextAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofNextAction] (val x: Self) extends AnyVal {
    
    inline def setDisplayBankTransferInstructions(value: TypeofDisplayBankTransfer): Self = StObject.set(x, "DisplayBankTransferInstructions", value.asInstanceOf[js.Any])
    
    inline def setKonbiniDisplayDetails(value: TypeofKonbiniDisplayDetai): Self = StObject.set(x, "KonbiniDisplayDetails", value.asInstanceOf[js.Any])
    
    inline def setVerifyWithMicrodeposits(value: Any): Self = StObject.set(x, "VerifyWithMicrodeposits", value.asInstanceOf[js.Any])
  }
}
