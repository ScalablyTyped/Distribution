package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportSucceededEvent extends js.Object {
  var sourceRepositoryName: java.lang.String
  var targetRepository: GitRepository
}

object GitImportSucceededEvent {
  @scala.inline
  def apply(sourceRepositoryName: java.lang.String, targetRepository: GitRepository): GitImportSucceededEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName, targetRepository = targetRepository)
  
    __obj.asInstanceOf[GitImportSucceededEvent]
  }
}

