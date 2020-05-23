package typings.twitchExt

import typings.twitchExt.anon.Ext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Twitch: Ext
}

object Window {
  @scala.inline
  def apply(Twitch: Ext): Window = {
    val __obj = js.Dynamic.literal(Twitch = Twitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

