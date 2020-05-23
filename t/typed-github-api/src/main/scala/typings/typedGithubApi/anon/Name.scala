package typings.typedGithubApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var collaborators: Double
  var name: String
  var privateRepos: Double
  var space: Double
}

object Name {
  @scala.inline
  def apply(collaborators: Double, name: String, privateRepos: Double, space: Double): Name = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privateRepos = privateRepos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

