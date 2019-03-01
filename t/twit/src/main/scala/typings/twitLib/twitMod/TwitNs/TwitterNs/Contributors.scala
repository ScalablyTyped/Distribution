package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contributors extends js.Object {
  var id: scala.Double
  var id_str: java.lang.String
  var screen_name: java.lang.String
}

object Contributors {
  @scala.inline
  def apply(id: scala.Double, id_str: java.lang.String, screen_name: java.lang.String): Contributors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("id_str")(id_str)
    __obj.updateDynamic("screen_name")(screen_name)
    __obj.asInstanceOf[Contributors]
  }
}

