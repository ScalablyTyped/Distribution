package typings.typedGithubApi

import typings.typedGithubApi.anon.Additions
import typings.typedGithubApi.anon.Bloburl
import typings.typedGithubApi.anon.Payload
import typings.typedGithubApi.distApiInterfacesUserMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterfacesCommitMod {
  
  trait Commit
    extends StObject
       with CommitSummary {
    
    var files: js.Array[Bloburl]
    
    var stats: Additions
  }
  object Commit {
    
    inline def apply(
      author: UserSummary,
      comments_url: String,
      commit: GitCommitSummary,
      committer: UserSummary,
      files: js.Array[Bloburl],
      html_url: String,
      parents: js.Array[CommitRef],
      sha: String,
      stats: Additions,
      url: String
    ): Commit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    extension [Self <: Commit](x: Self) {
      
      inline def setFiles(value: js.Array[Bloburl]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: Bloburl*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setStats(value: Additions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitRef
    extends StObject
       with GitRef {
    
    var html_url: String
  }
  object CommitRef {
    
    inline def apply(html_url: String, sha: String, url: String): CommitRef = {
      val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitRef]
    }
    
    extension [Self <: CommitRef](x: Self) {
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitSummary extends StObject {
    
    var author: UserSummary
    
    var comments_url: String
    
    var commit: GitCommitSummary
    
    var committer: UserSummary
    
    var html_url: String
    
    var parents: js.Array[CommitRef]
    
    var sha: String
    
    var url: String
  }
  object CommitSummary {
    
    inline def apply(
      author: UserSummary,
      comments_url: String,
      commit: GitCommitSummary,
      committer: UserSummary,
      html_url: String,
      parents: js.Array[CommitRef],
      sha: String,
      url: String
    ): CommitSummary = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitSummary]
    }
    
    extension [Self <: CommitSummary](x: Self) {
      
      inline def setAuthor(value: UserSummary): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: GitCommitSummary): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitter(value: UserSummary): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value*))
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitActor extends StObject {
    
    var date: js.Date
    
    var email: String
    
    var name: String
  }
  object GitActor {
    
    inline def apply(date: js.Date, email: String, name: String): GitActor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitActor]
    }
    
    extension [Self <: GitActor](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommit
    extends StObject
       with GitCommitSummary {
    
    var html_url: String
    
    var parents: js.Array[CommitRef]
    
    var sha: String
  }
  object GitCommit {
    
    inline def apply(
      author: GitActor,
      comment_count: Double,
      committer: GitActor,
      html_url: String,
      message: String,
      parents: js.Array[CommitRef],
      sha: String,
      tree: GitRef,
      url: String
    ): GitCommit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    extension [Self <: GitCommit](x: Self) {
      
      inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value*))
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommitSummary extends StObject {
    
    var author: GitActor
    
    var comment_count: Double
    
    var committer: GitActor
    
    var message: String
    
    var tree: GitRef
    
    var url: String
    
    var verification: js.UndefOr[Payload] = js.undefined
  }
  object GitCommitSummary {
    
    inline def apply(
      author: GitActor,
      comment_count: Double,
      committer: GitActor,
      message: String,
      tree: GitRef,
      url: String
    ): GitCommitSummary = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommitSummary]
    }
    
    extension [Self <: GitCommitSummary](x: Self) {
      
      inline def setAuthor(value: GitActor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      inline def setCommitter(value: GitActor): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTree(value: GitRef): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  trait GitRef extends StObject {
    
    var sha: String
    
    var url: String
  }
  object GitRef {
    
    inline def apply(sha: String, url: String): GitRef = {
      val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitRef]
    }
    
    extension [Self <: GitRef](x: Self) {
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
