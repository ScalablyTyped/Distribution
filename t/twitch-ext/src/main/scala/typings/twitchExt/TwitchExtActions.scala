package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twitch actions add first-party Twitch functionality to extensions.
  *
  * @see TwitchExt.actions
  */
@js.native
trait TwitchExtActions extends js.Object {
  /**
    * This function prompts users to follow the specified channel, with a dialog controlled by Twitch.
    *
    * @see https://dev.twitch.tv/docs/extensions/reference/#followchannel
    */
  def followChannel(channelName: String): Unit = js.native
  /**
    * This function causes your video-component or video-overlay extension to be minimized.
    *
    * @see https://dev.twitch.tv/docs/extensions/reference/#minimize
    */
  def minimize(): Unit = js.native
  /**
    * This function registers a callback that is invoked whenever a user completes an interaction prompted by the followChannel action.
    *
    * @see https://dev.twitch.tv/docs/extensions/reference/#onfollow
    */
  def onFollow(callback: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit]): Unit = js.native
  /**
    * This function opens a prompt for users to share their identity.
    * After a successful identity link, the Twitch.ext.onAuthorized callback is invoked with the user’s ID.
    *
    * @see https://dev.twitch.tv/docs/extensions/reference/#requestidshare
    */
  def requestIdShare(): Unit = js.native
}

object TwitchExtActions {
  @scala.inline
  def apply(
    followChannel: String => Unit,
    minimize: () => Unit,
    onFollow: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit] => Unit,
    requestIdShare: () => Unit
  ): TwitchExtActions = {
    val __obj = js.Dynamic.literal(followChannel = js.Any.fromFunction1(followChannel), minimize = js.Any.fromFunction0(minimize), onFollow = js.Any.fromFunction1(onFollow), requestIdShare = js.Any.fromFunction0(requestIdShare))
    __obj.asInstanceOf[TwitchExtActions]
  }
  @scala.inline
  implicit class TwitchExtActionsOps[Self <: TwitchExtActions] (val x: Self) extends AnyVal {
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
    def setFollowChannel(value: String => Unit): Self = this.set("followChannel", js.Any.fromFunction1(value))
    @scala.inline
    def setMinimize(value: () => Unit): Self = this.set("minimize", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFollow(value: js.Function2[/* didFollow */ Boolean, /* channelName */ String, Unit] => Unit): Self = this.set("onFollow", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestIdShare(value: () => Unit): Self = this.set("requestIdShare", js.Any.fromFunction0(value))
  }
  
}

