package typings.typedGithubApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var collaborators: Double
  var name: String
  var privateRepos: Double
  var space: Double
}

object AnonName {
  @scala.inline
  def apply(collaborators: Double, name: String, privateRepos: Double, space: Double): AnonName = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privateRepos = privateRepos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

