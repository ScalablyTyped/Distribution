package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
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
    val __obj = js.Dynamic.literal(name = name, parentRepository = parentRepository, project = project)
  
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
}

