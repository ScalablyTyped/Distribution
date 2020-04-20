package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportSucceededEvent extends js.Object {
  var sourceRepositoryName: String
  var targetRepository: GitRepository
}

object GitImportSucceededEvent {
  @scala.inline
  def apply(sourceRepositoryName: String, targetRepository: GitRepository): GitImportSucceededEvent = {
    val __obj = js.Dynamic.literal(sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportSucceededEvent]
  }
}

