package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportFailedEvent extends js.Object {
  var sourceRepositoryName: java.lang.String
  var targetRepository: GitRepository
}

object GitImportFailedEvent {
  @scala.inline
  def apply(sourceRepositoryName: java.lang.String, targetRepository: GitRepository): GitImportFailedEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName, targetRepository = targetRepository)
  
    __obj.asInstanceOf[GitImportFailedEvent]
  }
}

