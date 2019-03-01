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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("id_str")(id_str)
    __obj.updateDynamic("indices")(indices)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("screen_name")(screen_name)
    __obj.asInstanceOf[UserMentionEntity]
  }
}

