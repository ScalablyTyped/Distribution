package typings.webrtc

import typings.std.RTCIceCredentialType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
@js.native
trait RTCIceServer extends js.Object {
  
  //urls: string | string[];
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
}
object RTCIceServer {
  
  @scala.inline
  def apply(): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceServer]
  }
  
  @scala.inline
  implicit class RTCIceServerOps[Self <: RTCIceServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = this.set("credentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialType: Self = this.set("credentialType", js.undefined)
  }
}
