package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ext extends js.Object {
  var ext: TwitchExt
}

object Anon_Ext {
  @scala.inline
  def apply(ext: TwitchExt): Anon_Ext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ext")(ext)
    __obj.asInstanceOf[Anon_Ext]
  }
}

