package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAsyncRefOperationParameters extends js.Object {
  
  /**
    * Proposed target branch name for the cherry pick or revert operation.
    */
  var generatedRefName: String = js.native
  
  /**
    * The target branch for the cherry pick or revert operation.
    */
  var ontoRefName: String = js.native
  
  /**
    * The git repository for the cherry pick or revert operation.
    */
  var repository: GitRepository = js.native
  
  /**
    * Details about the source of the cherry pick or revert operation (e.g. A pull request or a specific commit).
    */
  var source: GitAsyncRefOperationSource = js.native
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
  
  @scala.inline
  implicit class GitAsyncRefOperationParametersOps[Self <: GitAsyncRefOperationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeneratedRefName(value: String): Self = this.set("generatedRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntoRefName(value: String): Self = this.set("ontoRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: GitRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: GitAsyncRefOperationSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
