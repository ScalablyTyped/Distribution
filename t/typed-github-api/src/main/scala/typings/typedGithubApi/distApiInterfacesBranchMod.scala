package typings.typedGithubApi

import typings.typedGithubApi.anon.Html
import typings.typedGithubApi.distApiInterfacesCommitMod.CommitSummary
import typings.typedGithubApi.distApiInterfacesCommitMod.GitRef
import typings.typedGithubApi.distApiInterfacesRepositoryMod.Repository
import typings.typedGithubApi.distApiInterfacesUserMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesBranchMod {
  
  trait Branch extends StObject {
    
    var _links: Html
    
    var commit: CommitSummary
    
    var name: String
    
    var `protected`: js.UndefOr[Boolean] = js.undefined
    
    var protection_url: js.UndefOr[String] = js.undefined
  }
  object Branch {
    
    inline def apply(_links: Html, commit: CommitSummary, name: String): Branch = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Branch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
      
      inline def setCommit(value: CommitSummary): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
      
      inline def setProtection_urlUndefined: Self = StObject.set(x, "protection_url", js.undefined)
      
      inline def set_links(value: Html): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchRef extends StObject {
    
    var commit: GitRef
    
    var name: String
  }
  object BranchRef {
    
    inline def apply(commit: GitRef, name: String): BranchRef = {
      val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BranchRef] (val x: Self) extends AnyVal {
      
      inline def setCommit(value: GitRef): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchSummary extends StObject {
    
    var label: String
    
    var ref: String
    
    var repo: Repository
    
    var sha: String
    
    var user: UserSummary
  }
  object BranchSummary {
    
    inline def apply(label: String, ref: String, repo: Repository, sha: String, user: UserSummary): BranchSummary = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchSummary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BranchSummary] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: Repository): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
