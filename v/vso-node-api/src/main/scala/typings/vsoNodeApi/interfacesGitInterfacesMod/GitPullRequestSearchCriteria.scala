package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestSearchCriteria extends StObject {
  
  /**
    * If set, search for pull requests that were created by this identity.
    */
  var creatorId: String
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  /**
    * If set, search for pull requests whose target branch is in this repository.
    */
  var repositoryId: String
  
  /**
    * If set, search for pull requests that have this identity as a reviewer.
    */
  var reviewerId: String
  
  /**
    * If set, search for pull requests from this branch.
    */
  var sourceRefName: String
  
  /**
    * If set, search for pull requests whose source branch is in this repository.
    */
  var sourceRepositoryId: String
  
  /**
    * If set, search for pull requests that are in this state.
    */
  var status: PullRequestStatus
  
  /**
    * If set, search for pull requests into this branch.
    */
  var targetRefName: String
}
object GitPullRequestSearchCriteria {
  
  inline def apply(
    creatorId: String,
    includeLinks: Boolean,
    repositoryId: String,
    reviewerId: String,
    sourceRefName: String,
    sourceRepositoryId: String,
    status: PullRequestStatus,
    targetRefName: String
  ): GitPullRequestSearchCriteria = {
    val __obj = js.Dynamic.literal(creatorId = creatorId.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], reviewerId = reviewerId.asInstanceOf[js.Any], sourceRefName = sourceRefName.asInstanceOf[js.Any], sourceRepositoryId = sourceRepositoryId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetRefName = targetRefName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestSearchCriteria]
  }
  
  extension [Self <: GitPullRequestSearchCriteria](x: Self) {
    
    inline def setCreatorId(value: String): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setReviewerId(value: String): Self = StObject.set(x, "reviewerId", value.asInstanceOf[js.Any])
    
    inline def setSourceRefName(value: String): Self = StObject.set(x, "sourceRefName", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryId(value: String): Self = StObject.set(x, "sourceRepositoryId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PullRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTargetRefName(value: String): Self = StObject.set(x, "targetRefName", value.asInstanceOf[js.Any])
  }
}
