package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptBackendTransactionsMod.RippleLibAdjustment
import typings.trezorConnect.libTypescriptBackendTransactionsMod.RippleLibMemo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPartialPayment extends StObject {
  
  var allowPartialPayment: js.UndefOr[Boolean] = js.undefined
  
  var destination: RippleLibAdjustment
  
  var invoiceID: js.UndefOr[String] = js.undefined
  
  var limitQuality: js.UndefOr[Boolean] = js.undefined
  
  var memos: js.UndefOr[js.Array[RippleLibMemo]] = js.undefined
  
  var noDirectRipple: js.UndefOr[Boolean] = js.undefined
  
  var paths: js.UndefOr[String] = js.undefined
  
  var source: RippleLibAdjustment
}
object AllowPartialPayment {
  
  inline def apply(destination: RippleLibAdjustment, source: RippleLibAdjustment): AllowPartialPayment = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPartialPayment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowPartialPayment] (val x: Self) extends AnyVal {
    
    inline def setAllowPartialPayment(value: Boolean): Self = StObject.set(x, "allowPartialPayment", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialPaymentUndefined: Self = StObject.set(x, "allowPartialPayment", js.undefined)
    
    inline def setDestination(value: RippleLibAdjustment): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setInvoiceID(value: String): Self = StObject.set(x, "invoiceID", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIDUndefined: Self = StObject.set(x, "invoiceID", js.undefined)
    
    inline def setLimitQuality(value: Boolean): Self = StObject.set(x, "limitQuality", value.asInstanceOf[js.Any])
    
    inline def setLimitQualityUndefined: Self = StObject.set(x, "limitQuality", js.undefined)
    
    inline def setMemos(value: js.Array[RippleLibMemo]): Self = StObject.set(x, "memos", value.asInstanceOf[js.Any])
    
    inline def setMemosUndefined: Self = StObject.set(x, "memos", js.undefined)
    
    inline def setMemosVarargs(value: RippleLibMemo*): Self = StObject.set(x, "memos", js.Array(value*))
    
    inline def setNoDirectRipple(value: Boolean): Self = StObject.set(x, "noDirectRipple", value.asInstanceOf[js.Any])
    
    inline def setNoDirectRippleUndefined: Self = StObject.set(x, "noDirectRipple", js.undefined)
    
    inline def setPaths(value: String): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setSource(value: RippleLibAdjustment): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
