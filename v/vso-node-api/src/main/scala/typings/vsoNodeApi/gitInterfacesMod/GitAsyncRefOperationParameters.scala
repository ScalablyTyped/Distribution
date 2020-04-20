package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperationParameters extends js.Object {
  /**
    * Proposed target branch name for the cherry pick or revert operation.
    */
  var generatedRefName: String
  /**
    * The target branch for the cherry pick or revert operation.
    */
  var ontoRefName: String
  /**
    * The git repository for the cherry pick or revert operation.
    */
  var repository: GitRepository
  /**
    * Details about the source of the cherry pick or revert operation (e.g. A pull request or a specific commit).
    */
  var source: GitAsyncRefOperationSource
}

object GitAsyncRefOperationParameters {
  @scala.inline
  def apply(
    generatedRefName: String,
    ontoRefName: String,
    repository: GitRepository,
    source: GitAsyncRefOperationSource
  ): GitAsyncRefOperationParameters = {
    val __obj = js.Dynamic.literal(generatedRefName = generatedRefName.asInstanceOf[js.Any], ontoRefName = ontoRefName.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationParameters]
  }
}

