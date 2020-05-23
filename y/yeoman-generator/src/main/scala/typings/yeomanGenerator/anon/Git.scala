package typings.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Git extends js.Object {
  val git: Email
  val github: Username
}

object Git {
  @scala.inline
  def apply(git: Email, github: Username): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
}

