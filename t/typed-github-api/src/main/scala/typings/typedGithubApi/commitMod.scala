package typings.typedGithubApi

import typings.std.Date
import typings.typedGithubApi.anon.Additions
import typings.typedGithubApi.anon.Bloburl
import typings.typedGithubApi.anon.Payload
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitMod {
  
  @js.native
  trait Commit extends CommitSummary {
    
    var files: js.Array[Bloburl] = js.native
    
    var stats: Additions = js.native
  }
  object Commit {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[Bloburl]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: Bloburl*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setStats(value: Additions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommitRef extends GitRef {
    
    var html_url: String = js.native
  }
  object CommitRef {
    
    @scala.inline
    def apply(html_url: String, sha: String, url: String): CommitRef = {
      val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitRef]
    }
    
    @scala.inline
    implicit class CommitRefMutableBuilder[Self <: CommitRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommitSummary extends StObject {
    
    var author: UserSummary = js.native
    
    var comments_url: String = js.native
    
    var commit: GitCommitSummary = js.native
    
    var committer: UserSummary = js.native
    
    var html_url: String = js.native
    
    var parents: js.Array[CommitRef] = js.native
    
    var sha: String = js.native
    
    var url: String = js.native
  }
  object CommitSummary {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CommitSummaryMutableBuilder[Self <: CommitSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: UserSummary): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: GitCommitSummary): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter(value: UserSummary): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitActor extends StObject {
    
    var date: Date = js.native
    
    var email: String = js.native
    
    var name: String = js.native
  }
  object GitActor {
    
    @scala.inline
    def apply(date: Date, email: String, name: String): GitActor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitActor]
    }
    
    @scala.inline
    implicit class GitActorMutableBuilder[Self <: GitActor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitCommit extends GitCommitSummary {
    
    var html_url: String = js.native
    
    var parents: js.Array[CommitRef] = js.native
    
    var sha: String = js.native
  }
  object GitCommit {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GitCommitMutableBuilder[Self <: GitCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitCommitSummary extends StObject {
    
    var author: GitActor = js.native
    
    var comment_count: Double = js.native
    
    var committer: GitActor = js.native
    
    var message: String = js.native
    
    var tree: GitRef = js.native
    
    var url: String = js.native
    
    var verification: js.UndefOr[Payload] = js.native
  }
  object GitCommitSummary {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GitCommitSummaryMutableBuilder[Self <: GitCommitSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: GitActor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter(value: GitActor): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTree(value: GitRef): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  @js.native
  trait GitRef extends StObject {
    
    var sha: String = js.native
    
    var url: String = js.native
  }
  object GitRef {
    
    @scala.inline
    def apply(sha: String, url: String): GitRef = {
      val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitRef]
    }
    
    @scala.inline
    implicit class GitRefMutableBuilder[Self <: GitRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
