package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collaborators extends js.Object {
  var collaborators: scala.Double
  var name: java.lang.String
  var private_repos: scala.Double
  var space: scala.Double
}

object Anon_Collaborators {
  @scala.inline
  def apply(
    collaborators: scala.Double,
    name: java.lang.String,
    private_repos: scala.Double,
    space: scala.Double
  ): Anon_Collaborators = {
    val __obj = js.Dynamic.literal(collaborators = collaborators, name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[Anon_Collaborators]
  }
}

