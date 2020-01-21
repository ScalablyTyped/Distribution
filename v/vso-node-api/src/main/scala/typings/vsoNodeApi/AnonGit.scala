package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGit extends js.Object {
  var git: Double
  var tfvc: Double
}

object AnonGit {
  @scala.inline
  def apply(git: Double, tfvc: Double): AnonGit = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGit]
  }
}

