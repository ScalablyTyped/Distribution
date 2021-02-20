package typings.tizenAccessory

import typings.tizenAccessory.anon.Oncomplete
import typings.tizenAccessory.anon.Onprogress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAFileTransfer extends StObject {
  
  def cancelFile(id: String): Unit = js.native
  
  val defaultReceivePath: String = js.native
  
  def receiveFile(id: String, localPath: String): Unit = js.native
  
  def rejectFile(id: String): Unit = js.native
  
  def sendFile(peerAgent: SAPeerAgent, filePath: String): Double = js.native
  
  def setFileReceiveListener(callback: Onprogress): Unit = js.native
  
  def setFileSendListener(callback: Oncomplete): Unit = js.native
}
object SAFileTransfer {
  
  @scala.inline
  def apply(
    cancelFile: String => Unit,
    defaultReceivePath: String,
    receiveFile: (String, String) => Unit,
    rejectFile: String => Unit,
    sendFile: (SAPeerAgent, String) => Double,
    setFileReceiveListener: Onprogress => Unit,
    setFileSendListener: Oncomplete => Unit
  ): SAFileTransfer = {
    val __obj = js.Dynamic.literal(cancelFile = js.Any.fromFunction1(cancelFile), defaultReceivePath = defaultReceivePath.asInstanceOf[js.Any], receiveFile = js.Any.fromFunction2(receiveFile), rejectFile = js.Any.fromFunction1(rejectFile), sendFile = js.Any.fromFunction2(sendFile), setFileReceiveListener = js.Any.fromFunction1(setFileReceiveListener), setFileSendListener = js.Any.fromFunction1(setFileSendListener))
    __obj.asInstanceOf[SAFileTransfer]
  }
  
  @scala.inline
  implicit class SAFileTransferMutableBuilder[Self <: SAFileTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelFile(value: String => Unit): Self = StObject.set(x, "cancelFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultReceivePath(value: String): Self = StObject.set(x, "defaultReceivePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveFile(value: (String, String) => Unit): Self = StObject.set(x, "receiveFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRejectFile(value: String => Unit): Self = StObject.set(x, "rejectFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendFile(value: (SAPeerAgent, String) => Double): Self = StObject.set(x, "sendFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFileReceiveListener(value: Onprogress => Unit): Self = StObject.set(x, "setFileReceiveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFileSendListener(value: Oncomplete => Unit): Self = StObject.set(x, "setFileSendListener", js.Any.fromFunction1(value))
  }
}
