package typings.typedGithubApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collaborators extends js.Object {
  var collaborators: Double
  var name: String
  var private_repos: Double
  var space: Double
}

object Collaborators {
  @scala.inline
  def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Collaborators = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaborators]
  }
}

