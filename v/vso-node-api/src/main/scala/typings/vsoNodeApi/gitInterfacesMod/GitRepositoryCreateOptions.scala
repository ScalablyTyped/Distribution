package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryCreateOptions extends js.Object {
  var name: String
  var parentRepository: GitRepositoryRef
  var project: TeamProjectReference
}

object GitRepositoryCreateOptions {
  @scala.inline
  def apply(name: String, parentRepository: GitRepositoryRef, project: TeamProjectReference): GitRepositoryCreateOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
}

