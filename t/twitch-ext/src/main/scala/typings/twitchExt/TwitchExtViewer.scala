package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.viewer
  */
trait TwitchExtViewer extends js.Object {
  /**
    * The Twitch ID of a linked viewer. null if the viewer has not opted to share their identity with the extension.
    */
  var id: String | Null
  /**
    * Provided as a convenience to check whether or not a user has shared their identity with their extension
    */
  var isLinked: Boolean
  /**
    * The opaque id of the viewer.
    */
  var opaqueId: String
  /**
    * The role of the user. See the JWT schema for possible values.
    */
  var role: String
  /**
    * The encoded JWT. This is the same as the token property of the authData parameter that currently gets passed to
    * the onAuthorized callback.
    */
  var sessionToken: String
  /**
    * An object containing information about the viewer’s subscription. The value of subscriptionStatus will be null if
    * the user is either not a subscriber, or opting not to share their identity. The value will also be null if the
    * extension otherwise doesn't have subscription capabilities.
    */
  var subscriptionStatus: TwitchExtViewerSubscriptionStatus | Null
  /**
    * This function binds a callback will be invoked when the viewer’s status changes (e.g. if a viewer subscribes and
    * changes their subscription status).
    * @param callback The callback that is called whenever the viewer's status changes
    */
  def onChanged(callback: js.Function0[Unit]): Unit
}

object TwitchExtViewer {
  @scala.inline
  def apply(
    isLinked: Boolean,
    onChanged: js.Function0[Unit] => Unit,
    opaqueId: String,
    role: String,
    sessionToken: String,
    id: String = null,
    subscriptionStatus: TwitchExtViewerSubscriptionStatus = null
  ): TwitchExtViewer = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], onChanged = js.Any.fromFunction1(onChanged), opaqueId = opaqueId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], subscriptionStatus = subscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtViewer]
  }
}

