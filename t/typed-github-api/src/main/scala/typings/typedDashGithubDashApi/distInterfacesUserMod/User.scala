package typings.typedDashGithubDashApi.distInterfacesUserMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends UserSummary {
  var blog: String = js.native
  var company: String = js.native
  var createdAt: Moment = js.native
  var email: String = js.native
  var followers: Double = js.native
  var following: Double = js.native
  var location: String = js.native
  var name: String = js.native
  var publicGists: Double = js.native
  var publicRepos: Double = js.native
  var updatedAt: Moment = js.native
}

