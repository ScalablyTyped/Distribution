package typings.typedDashGithubDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Admin extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object Anon_Admin {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): Anon_Admin = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[Anon_Admin]
  }
}

