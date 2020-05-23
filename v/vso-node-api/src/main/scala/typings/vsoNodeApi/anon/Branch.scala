package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var branch: scala.Double
  var commit: scala.Double
  var tag: scala.Double
}

object Branch {
  @scala.inline
  def apply(branch: scala.Double, commit: scala.Double, tag: scala.Double): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}

