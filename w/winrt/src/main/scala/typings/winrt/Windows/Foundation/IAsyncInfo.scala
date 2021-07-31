package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsyncInfo extends StObject {
  
  def cancel(): Unit
  
  def close(): Unit
  
  var errorCode: Double
  
  var id: Double
  
  var status: AsyncStatus
}
object IAsyncInfo {
  
  @scala.inline
  def apply(cancel: () => Unit, close: () => Unit, errorCode: Double, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  
  @scala.inline
  implicit class IAsyncInfoMutableBuilder[Self <: IAsyncInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
