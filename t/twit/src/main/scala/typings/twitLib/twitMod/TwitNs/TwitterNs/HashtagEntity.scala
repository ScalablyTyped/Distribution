package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagEntity extends js.Object {
  var indices: js.Tuple2[scala.Double, scala.Double]
  var text: java.lang.String
}

object HashtagEntity {
  @scala.inline
  def apply(indices: js.Tuple2[scala.Double, scala.Double], text: java.lang.String): HashtagEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indices")(indices)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[HashtagEntity]
  }
}

