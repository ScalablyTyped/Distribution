package typings.typedGithubApi

import typings.typedGithubApi.interfacesCommitMod.CommitSummary
import typings.typedGithubApi.interfacesRepositoryMod.Repository
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesBranchMod {
  
  trait Branch
    extends StObject
       with BranchRef {
    
    var commit: CommitSummary
  }
  object Branch {
    
    @scala.inline
    def apply(
      commit: CommitSummary,
      loadAsync: () => js.Promise[Branch | Null],
      name: String,
      repository: RepositoryRef
    ): Branch = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    @scala.inline
    implicit class BranchMutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: CommitSummary): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchRef extends StObject {
    
    def loadAsync(): js.Promise[Branch | Null]
    
    val name: String
    
    val repository: RepositoryRef
  }
  object BranchRef {
    
    @scala.inline
    def apply(loadAsync: () => js.Promise[Branch | Null], name: String, repository: RepositoryRef): BranchRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchRef]
    }
    
    @scala.inline
    implicit class BranchRefMutableBuilder[Self <: BranchRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadAsync(value: () => js.Promise[Branch | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: RepositoryRef): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchSummary extends StObject {
    
    var name: String
    
    var repository: js.UndefOr[Repository] = js.undefined
    
    var sha: String
    
    var user: UserSummary
  }
  object BranchSummary {
    
    @scala.inline
    def apply(name: String, sha: String, user: UserSummary): BranchSummary = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchSummary]
    }
    
    @scala.inline
    implicit class BranchSummaryMutableBuilder[Self <: BranchSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchSummaryWithRepository
    extends StObject
       with BranchSummary {
    
    @JSName("repository")
    var repository_BranchSummaryWithRepository: Repository
  }
  object BranchSummaryWithRepository {
    
    @scala.inline
    def apply(name: String, repository: Repository, sha: String, user: UserSummary): BranchSummaryWithRepository = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchSummaryWithRepository]
    }
    
    @scala.inline
    implicit class BranchSummaryWithRepositoryMutableBuilder[Self <: BranchSummaryWithRepository] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepository(value: Repository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
}
