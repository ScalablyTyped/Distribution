package typings.twitchExt.anon

import typings.twitchExt.TwitchExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ext extends js.Object {
  var ext: TwitchExt
}

object Ext {
  @scala.inline
  def apply(ext: TwitchExt): Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
}

