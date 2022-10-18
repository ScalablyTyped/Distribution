package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitAsyncRefOperationParameters extends StObject {
  
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
  
  inline def apply(
    generatedRefName: String,
    ontoRefName: String,
    repository: GitRepository,
    source: GitAsyncRefOperationSource
  ): GitAsyncRefOperationParameters = {
    val __obj = js.Dynamic.literal(generatedRefName = generatedRefName.asInstanceOf[js.Any], ontoRefName = ontoRefName.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationParameters]
  }
  
  extension [Self <: GitAsyncRefOperationParameters](x: Self) {
    
    inline def setGeneratedRefName(value: String): Self = StObject.set(x, "generatedRefName", value.asInstanceOf[js.Any])
    
    inline def setOntoRefName(value: String): Self = StObject.set(x, "ontoRefName", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSource(value: GitAsyncRefOperationSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
