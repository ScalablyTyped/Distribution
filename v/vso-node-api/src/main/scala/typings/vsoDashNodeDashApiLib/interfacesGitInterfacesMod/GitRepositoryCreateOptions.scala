package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryCreateOptions extends js.Object {
  var name: java.lang.String
  var parentRepository: GitRepositoryRef
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
}

object GitRepositoryCreateOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    parentRepository: GitRepositoryRef,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  ): GitRepositoryCreateOptions = {
    val __obj = js.Dynamic.literal(name = name, parentRepository = parentRepository, project = project)
  
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
}

