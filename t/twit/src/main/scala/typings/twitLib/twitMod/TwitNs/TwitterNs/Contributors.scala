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
    val __obj = js.Dynamic.literal(id = id, id_str = id_str, screen_name = screen_name)
  
    __obj.asInstanceOf[Contributors]
  }
}

