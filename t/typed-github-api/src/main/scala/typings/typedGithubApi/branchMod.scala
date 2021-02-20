package typings.typedGithubApi

import typings.typedGithubApi.anon.Html
import typings.typedGithubApi.commitMod.CommitSummary
import typings.typedGithubApi.commitMod.GitRef
import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object branchMod {
  
  @js.native
  trait Branch extends StObject {
    
    var _links: Html = js.native
    
    var commit: CommitSummary = js.native
    
    var name: String = js.native
    
    var `protected`: js.UndefOr[Boolean] = js.native
    
    var protection_url: js.UndefOr[String] = js.native
  }
  object Branch {
    
    @scala.inline
    def apply(_links: Html, commit: CommitSummary, name: String): Branch = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    @scala.inline
    implicit class BranchMutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: CommitSummary): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      @scala.inline
      def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtection_urlUndefined: Self = StObject.set(x, "protection_url", js.undefined)
      
      @scala.inline
      def set_links(value: Html): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BranchRef extends StObject {
    
    var commit: GitRef = js.native
    
    var name: String = js.native
  }
  object BranchRef {
    
    @scala.inline
    def apply(commit: GitRef, name: String): BranchRef = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchRef]
    }
    
    @scala.inline
    implicit class BranchRefMutableBuilder[Self <: BranchRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit(value: GitRef): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BranchSummary extends StObject {
    
    var label: String = js.native
    
    var ref: String = js.native
    
    var repo: Repository = js.native
    
    var sha: String = js.native
    
    var user: UserSummary = js.native
  }
  object BranchSummary {
    
    @scala.inline
    def apply(label: String, ref: String, repo: Repository, sha: String, user: UserSummary): BranchSummary = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchSummary]
    }
    
    @scala.inline
    implicit class BranchSummaryMutableBuilder[Self <: BranchSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepo(value: Repository): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
