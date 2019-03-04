package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionOrListWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[scala.Double, scala.Double]
  var listSlug: java.lang.String
  var screenName: java.lang.String
}

object MentionOrListWithIndices {
  @scala.inline
  def apply(
    indices: js.Tuple2[scala.Double, scala.Double],
    listSlug: java.lang.String,
    screenName: java.lang.String
  ): MentionOrListWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices, listSlug = listSlug, screenName = screenName)
  
    __obj.asInstanceOf[MentionOrListWithIndices]
  }
}

