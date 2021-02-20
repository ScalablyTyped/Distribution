package typings.w3cWebUsb

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBInTransferResult extends StObject {
  
  val data: js.UndefOr[DataView] = js.native
  
  val status: js.UndefOr[USBTransferStatus] = js.native
}
object USBInTransferResult {
  
  @scala.inline
  def apply(): USBInTransferResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBInTransferResult]
  }
  
  @scala.inline
  implicit class USBInTransferResultMutableBuilder[Self <: USBInTransferResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
