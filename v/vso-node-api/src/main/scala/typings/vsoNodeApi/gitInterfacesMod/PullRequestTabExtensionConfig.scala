package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestTabExtensionConfig extends js.Object {
  var pullRequestId: Double
  var repositoryId: String
}

object PullRequestTabExtensionConfig {
  @scala.inline
  def apply(pullRequestId: Double, repositoryId: String): PullRequestTabExtensionConfig = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullRequestTabExtensionConfig]
  }
}

