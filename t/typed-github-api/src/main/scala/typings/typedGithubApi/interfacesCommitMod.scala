package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesCommitMod {
  
  @js.native
  trait Commit extends CommitSummary {
    
    var changes: GitChanges = js.native
    
    var files: js.Array[GitFile] = js.native
  }
  object Commit {
    
    @scala.inline
    def apply(
      changes: GitChanges,
      files: js.Array[GitFile],
      gitCommit: GitCommitSummary,
      htmlUri: String,
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      parents: js.Array[CommitRef],
      repository: RepositoryRef,
      sha: String
    ): Commit = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    @scala.inline
    implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: GitChanges): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[GitFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: GitFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CommitRef extends StObject {
    
    def loadAsync(): js.Promise[Commit | Null] = js.native
    
    def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    val repository: RepositoryRef = js.native
    
    val sha: String = js.native
  }
  object CommitRef {
    
    @scala.inline
    def apply(
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      repository: RepositoryRef,
      sha: String
    ): CommitRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitRef]
    }
    
    @scala.inline
    implicit class CommitRefMutableBuilder[Self <: CommitRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadAsync(value: () => js.Promise[Commit | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadGitAsync(value: () => js.Promise[GitCommit | Null]): Self = StObject.set(x, "loadGitAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRepository(value: RepositoryRef): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommitSummary extends CommitRef {
    
    var author: js.UndefOr[UserSummary] = js.native
    
    var committer: js.UndefOr[UserSummary] = js.native
    
    var gitCommit: GitCommitSummary = js.native
    
    var htmlUri: String = js.native
    
    var parents: js.Array[CommitRef] = js.native
  }
  object CommitSummary {
    
    @scala.inline
    def apply(
      gitCommit: GitCommitSummary,
      htmlUri: String,
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      parents: js.Array[CommitRef],
      repository: RepositoryRef,
      sha: String
    ): CommitSummary = {
      val __obj = js.Dynamic.literal(gitCommit = gitCommit.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitSummary]
    }
    
    @scala.inline
    implicit class CommitSummaryMutableBuilder[Self <: CommitSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: UserSummary): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setCommitter(value: UserSummary): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      @scala.inline
      def setGitCommit(value: GitCommitSummary): Self = StObject.set(x, "gitCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GitActor extends StObject {
    
    var date: Moment = js.native
    
    var email: String = js.native
    
    var name: String = js.native
  }
  object GitActor {
    
    @scala.inline
    def apply(date: Moment, email: String, name: String): GitActor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitActor]
    }
    
    @scala.inline
    implicit class GitActorMutableBuilder[Self <: GitActor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitChanges extends StObject {
    
    var added: Double = js.native
    
    var deleted: Double = js.native
    
    var total: Double = js.native
  }
  object GitChanges {
    
    @scala.inline
    def apply(added: Double, deleted: Double, total: Double): GitChanges = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitChanges]
    }
    
    @scala.inline
    implicit class GitChangesMutableBuilder[Self <: GitChanges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitCommit extends GitCommitSummary {
    
    var parents: js.Array[CommitRef] = js.native
  }
  object GitCommit {
    
    @scala.inline
    def apply(
      author: GitActor,
      committer: GitActor,
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      message: String,
      parents: js.Array[CommitRef],
      repository: RepositoryRef,
      sha: String
    ): GitCommit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    @scala.inline
    implicit class GitCommitMutableBuilder[Self <: GitCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GitCommitSummary extends CommitRef {
    
    var author: GitActor = js.native
    
    var committer: GitActor = js.native
    
    var message: String = js.native
  }
  object GitCommitSummary {
    
    @scala.inline
    def apply(
      author: GitActor,
      committer: GitActor,
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      message: String,
      repository: RepositoryRef,
      sha: String
    ): GitCommitSummary = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), message = message.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommitSummary]
    }
    
    @scala.inline
    implicit class GitCommitSummaryMutableBuilder[Self <: GitCommitSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: GitActor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter(value: GitActor): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitFile extends StObject {
    
    var changes: GitChanges = js.native
    
    var filename: String = js.native
    
    var patch: String = js.native
    
    var status: modified = js.native
  }
  object GitFile {
    
    @scala.inline
    def apply(changes: GitChanges, filename: String, patch: String, status: modified): GitFile = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitFile]
    }
    
    @scala.inline
    implicit class GitFileMutableBuilder[Self <: GitFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: GitChanges): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: modified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
