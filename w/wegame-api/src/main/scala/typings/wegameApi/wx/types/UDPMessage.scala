package typings.wegameApi.wx.types

import typings.std.ArrayBuffer
import typings.wegameApi.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UDPMessage extends StObject {
  
  /**
    * 收到的消息
    */
  var message: ArrayBuffer
  
  /**
    * 消息来源的结构化信息
    */
  var remoteInfo: Address
}
object UDPMessage {
  
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: Address): UDPMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPMessage]
  }
  
  @scala.inline
  implicit class UDPMessageMutableBuilder[Self <: UDPMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ArrayBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteInfo(value: Address): Self = StObject.set(x, "remoteInfo", value.asInstanceOf[js.Any])
  }
}
