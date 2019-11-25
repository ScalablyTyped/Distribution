package typings.yeomanDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Git extends js.Object {
  val git: Anon_Email
  val github: Anon_Username
}

object Anon_Git {
  @scala.inline
  def apply(git: Anon_Email, github: Anon_Username): Anon_Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Git]
  }
}

