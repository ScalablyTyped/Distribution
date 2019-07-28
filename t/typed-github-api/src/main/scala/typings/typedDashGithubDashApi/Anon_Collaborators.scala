package typings.typedDashGithubDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collaborators extends js.Object {
  var collaborators: Double
  var name: String
  var private_repos: Double
  var space: Double
}

object Anon_Collaborators {
  @scala.inline
  def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Anon_Collaborators = {
    val __obj = js.Dynamic.literal(collaborators = collaborators, name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[Anon_Collaborators]
  }
}

