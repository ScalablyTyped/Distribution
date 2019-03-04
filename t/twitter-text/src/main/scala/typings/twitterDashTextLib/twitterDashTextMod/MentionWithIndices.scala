package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[scala.Double, scala.Double]
  var screenName: java.lang.String
}

object MentionWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[scala.Double, scala.Double], screenName: java.lang.String): MentionWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices, screenName = screenName)
  
    __obj.asInstanceOf[MentionWithIndices]
  }
}

