package typings
package turbostatusLib.turbostatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var commitsSinceTag: java.lang.String | turbostatusLib.turbostatusLibNumbers.`false`
  var hash: java.lang.String
  var nearestTag: java.lang.String | turbostatusLib.turbostatusLibNumbers.`false`
}

object Description {
  @scala.inline
  def apply(
    commitsSinceTag: java.lang.String | turbostatusLib.turbostatusLibNumbers.`false`,
    hash: java.lang.String,
    nearestTag: java.lang.String | turbostatusLib.turbostatusLibNumbers.`false`
  ): Description = {
    val __obj = js.Dynamic.literal(commitsSinceTag = commitsSinceTag.asInstanceOf[js.Any], hash = hash, nearestTag = nearestTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Description]
  }
}

