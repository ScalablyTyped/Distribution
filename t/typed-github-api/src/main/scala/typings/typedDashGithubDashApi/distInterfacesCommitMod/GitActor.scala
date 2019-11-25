package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitActor extends js.Object {
  var date: Moment
  var email: String
  var name: String
}

object GitActor {
  @scala.inline
  def apply(date: Moment, email: String, name: String): GitActor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitActor]
  }
}

