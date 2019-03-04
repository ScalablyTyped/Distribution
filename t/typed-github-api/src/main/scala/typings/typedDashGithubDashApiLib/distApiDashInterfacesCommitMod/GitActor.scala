package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitActor extends js.Object {
  var date: stdLib.Date
  var email: java.lang.String
  var name: java.lang.String
}

object GitActor {
  @scala.inline
  def apply(date: stdLib.Date, email: java.lang.String, name: java.lang.String): GitActor = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[GitActor]
  }
}

