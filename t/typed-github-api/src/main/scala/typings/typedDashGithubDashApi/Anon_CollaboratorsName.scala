package typings.typedDashGithubDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollaboratorsName extends js.Object {
  var collaborators: Double
  var name: String
  var privateRepos: Double
  var space: Double
}

object Anon_CollaboratorsName {
  @scala.inline
  def apply(collaborators: Double, name: String, privateRepos: Double, space: Double): Anon_CollaboratorsName = {
    val __obj = js.Dynamic.literal(collaborators = collaborators, name = name, privateRepos = privateRepos, space = space)
  
    __obj.asInstanceOf[Anon_CollaboratorsName]
  }
}

