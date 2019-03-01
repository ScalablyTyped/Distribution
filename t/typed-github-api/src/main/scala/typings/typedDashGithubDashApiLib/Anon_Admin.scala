package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Admin extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object Anon_Admin {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): Anon_Admin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("admin")(admin)
    __obj.updateDynamic("pull")(pull)
    __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[Anon_Admin]
  }
}

