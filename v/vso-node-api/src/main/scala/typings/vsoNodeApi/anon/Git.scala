package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Git extends js.Object {
  var git: scala.Double
  var tfvc: scala.Double
}

object Git {
  @scala.inline
  def apply(git: scala.Double, tfvc: scala.Double): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
}

