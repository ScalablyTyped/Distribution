package typings.turbostatus.turbostatusMod

import typings.turbostatus.turbostatusNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var commitsSinceTag: String | `false`
  var hash: String
  var nearestTag: String | `false`
}

object Description {
  @scala.inline
  def apply(commitsSinceTag: String | `false`, hash: String, nearestTag: String | `false`): Description = {
    val __obj = js.Dynamic.literal(commitsSinceTag = commitsSinceTag.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nearestTag = nearestTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Description]
  }
}

