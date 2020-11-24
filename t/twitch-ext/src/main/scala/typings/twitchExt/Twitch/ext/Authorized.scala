package typings.twitchExt.Twitch.ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result object as passed to the onAuthorized callback.
  *
  * @see onAuthorized
  */
@js.native
trait Authorized extends js.Object {
  
  /**
    * Channel ID of the page where the extension is iframe embedded.
    */
  var channelId: String = js.native
  
  /**
    * Client ID of the extension.
    */
  var clientId: String = js.native
  
  /**
    * JWT that should be passed to any EBS call for authentication.
    */
  var token: String = js.native
  
  /**
    * Opaque user ID.
    */
  var userId: String = js.native
}
object Authorized {
  
  @scala.inline
  def apply(channelId: String, clientId: String, token: String, userId: String): Authorized = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorized]
  }
  
  @scala.inline
  implicit class AuthorizedOps[Self <: Authorized] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
