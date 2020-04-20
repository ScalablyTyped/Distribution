package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExt extends js.Object {
  var ext: TwitchExt
}

object AnonExt {
  @scala.inline
  def apply(ext: TwitchExt): AnonExt = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExt]
  }
}

