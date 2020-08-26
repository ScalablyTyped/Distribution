package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.viewer
  */
@js.native
trait TwitchExtViewer extends js.Object {
  /**
    * The Twitch ID of a linked viewer. null if the viewer has not opted to share their identity with the extension.
    */
  var id: String | Null = js.native
  /**
    * Provided as a convenience to check whether or not a user has shared their identity with their extension
    */
  var isLinked: Boolean = js.native
  /**
    * The opaque id of the viewer.
    */
  var opaqueId: String = js.native
  /**
    * The role of the user. See the JWT schema for possible values.
    */
  var role: String = js.native
  /**
    * The encoded JWT. This is the same as the token property of the authData parameter that currently gets passed to
    * the onAuthorized callback.
    */
  var sessionToken: String = js.native
  /**
    * An object containing information about the viewer’s subscription. The value of subscriptionStatus will be null if
    * the user is either not a subscriber, or opting not to share their identity. The value will also be null if the
    * extension otherwise doesn't have subscription capabilities.
    */
  var subscriptionStatus: TwitchExtViewerSubscriptionStatus | Null = js.native
  /**
    * This function binds a callback will be invoked when the viewer’s status changes (e.g. if a viewer subscribes and
    * changes their subscription status).
    * @param callback The callback that is called whenever the viewer's status changes
    */
  def onChanged(callback: js.Function0[Unit]): Unit = js.native
}

object TwitchExtViewer {
  @scala.inline
  def apply(
    isLinked: Boolean,
    onChanged: js.Function0[Unit] => Unit,
    opaqueId: String,
    role: String,
    sessionToken: String
  ): TwitchExtViewer = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], onChanged = js.Any.fromFunction1(onChanged), opaqueId = opaqueId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtViewer]
  }
  @scala.inline
  implicit class TwitchExtViewerOps[Self <: TwitchExtViewer] (val x: Self) extends AnyVal {
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
    def setIsLinked(value: Boolean): Self = this.set("isLinked", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChanged(value: js.Function0[Unit] => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setOpaqueId(value: String): Self = this.set("opaqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setSubscriptionStatus(value: TwitchExtViewerSubscriptionStatus): Self = this.set("subscriptionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionStatusNull: Self = this.set("subscriptionStatus", null)
  }
  
}

