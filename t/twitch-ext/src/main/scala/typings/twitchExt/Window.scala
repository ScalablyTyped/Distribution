package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Twitch: AnonExt
}

object Window {
  @scala.inline
  def apply(Twitch: AnonExt): Window = {
    val __obj = js.Dynamic.literal(Twitch = Twitch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

