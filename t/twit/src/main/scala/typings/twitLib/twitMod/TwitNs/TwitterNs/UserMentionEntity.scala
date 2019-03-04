package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMentionEntity extends js.Object {
  var id: scala.Double
  var id_str: java.lang.String
  var indices: js.Tuple2[scala.Double, scala.Double]
  var name: java.lang.String
  var screen_name: java.lang.String
}

object UserMentionEntity {
  @scala.inline
  def apply(
    id: scala.Double,
    id_str: java.lang.String,
    indices: js.Tuple2[scala.Double, scala.Double],
    name: java.lang.String,
    screen_name: java.lang.String
  ): UserMentionEntity = {
    val __obj = js.Dynamic.literal(id = id, id_str = id_str, indices = indices, name = name, screen_name = screen_name)
  
    __obj.asInstanceOf[UserMentionEntity]
  }
}

