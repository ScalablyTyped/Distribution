package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferCodingHeaderValue extends StObject {
  
  /** true if input is valid HttpTransferCodingHeaderValue information; otherwise, false. */ var returnValue: Boolean
  
  /** The HttpTransferCodingHeaderValue version of the string. */ var transferCodingHeaderValue: HttpTransferCodingHeaderValue
}
object TransferCodingHeaderValue {
  
  inline def apply(returnValue: Boolean, transferCodingHeaderValue: HttpTransferCodingHeaderValue): TransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], transferCodingHeaderValue = transferCodingHeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCodingHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferCodingHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setTransferCodingHeaderValue(value: HttpTransferCodingHeaderValue): Self = StObject.set(x, "transferCodingHeaderValue", value.asInstanceOf[js.Any])
  }
}
