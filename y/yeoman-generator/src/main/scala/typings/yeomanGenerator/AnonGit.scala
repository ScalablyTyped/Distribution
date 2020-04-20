package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGit extends js.Object {
  val git: AnonEmail
  val github: AnonUsername
}

object AnonGit {
  @scala.inline
  def apply(git: AnonEmail, github: AnonUsername): AnonGit = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGit]
  }
}

