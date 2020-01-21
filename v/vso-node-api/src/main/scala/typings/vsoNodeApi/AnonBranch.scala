package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranch extends js.Object {
  var branch: Double
  var commit: Double
  var tag: Double
}

object AnonBranch {
  @scala.inline
  def apply(branch: Double, commit: Double, tag: Double): AnonBranch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBranch]
  }
}

