package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesCommitMod {
  
  trait Commit
    extends StObject
       with CommitSummary {
    
    var changes: GitChanges
    
    var files: js.Array[GitFile]
  }
  object Commit {
    
    inline def apply(
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
    
    extension [Self <: Commit](x: Self) {
      
      inline def setChanges(value: GitChanges): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[GitFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: GitFile*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  trait CommitRef extends StObject {
    
    def loadAsync(): js.Promise[Commit | Null]
    
    def loadGitAsync(): js.Promise[GitCommit | Null]
    
    val repository: RepositoryRef
    
    val sha: String
  }
  object CommitRef {
    
    inline def apply(
      loadAsync: () => js.Promise[Commit | Null],
      loadGitAsync: () => js.Promise[GitCommit | Null],
      repository: RepositoryRef,
      sha: String
    ): CommitRef = {
      val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadGitAsync = js.Any.fromFunction0(loadGitAsync), repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitRef]
    }
    
    extension [Self <: CommitRef](x: Self) {
      
      inline def setLoadAsync(value: () => js.Promise[Commit | Null]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction0(value))
      
      inline def setLoadGitAsync(value: () => js.Promise[GitCommit | Null]): Self = StObject.set(x, "loadGitAsync", js.Any.fromFunction0(value))
      
      inline def setRepository(value: RepositoryRef): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitSummary
    extends StObject
       with CommitRef {
    
    var author: js.UndefOr[UserSummary] = js.undefined
    
    var committer: js.UndefOr[UserSummary] = js.undefined
    
    var gitCommit: GitCommitSummary
    
    var htmlUri: String
    
    var parents: js.Array[CommitRef]
  }
  object CommitSummary {
    
    inline def apply(
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
    
    extension [Self <: CommitSummary](x: Self) {
      
      inline def setAuthor(value: UserSummary): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setCommitter(value: UserSummary): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
      
      inline def setGitCommit(value: GitCommitSummary): Self = StObject.set(x, "gitCommit", value.asInstanceOf[js.Any])
      
      inline def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value*))
    }
  }
  
  trait GitActor extends StObject {
    
    var date: Moment
    
    var email: String
    
    var name: String
  }
  object GitActor {
    
    inline def apply(date: Moment, email: String, name: String): GitActor = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitActor]
    }
    
    extension [Self <: GitActor](x: Self) {
      
      inline def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitChanges extends StObject {
    
    var added: Double
    
    var deleted: Double
    
    var total: Double
  }
  object GitChanges {
    
    inline def apply(added: Double, deleted: Double, total: Double): GitChanges = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitChanges]
    }
    
    extension [Self <: GitChanges](x: Self) {
      
      inline def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommit
    extends StObject
       with GitCommitSummary {
    
    var parents: js.Array[CommitRef]
  }
  object GitCommit {
    
    inline def apply(
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
    
    extension [Self <: GitCommit](x: Self) {
      
      inline def setParents(value: js.Array[CommitRef]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: CommitRef*): Self = StObject.set(x, "parents", js.Array(value*))
    }
  }
  
  trait GitCommitSummary
    extends StObject
       with CommitRef {
    
    var author: GitActor
    
    var committer: GitActor
    
    var message: String
  }
  object GitCommitSummary {
    
    inline def apply(
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
    
    extension [Self <: GitCommitSummary](x: Self) {
      
      inline def setAuthor(value: GitActor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCommitter(value: GitActor): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitFile extends StObject {
    
    var changes: GitChanges
    
    var filename: String
    
    var patch: String
    
    var status: modified
  }
  object GitFile {
    
    inline def apply(changes: GitChanges, filename: String, patch: String): GitFile = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = "modified")
      __obj.asInstanceOf[GitFile]
    }
    
    extension [Self <: GitFile](x: Self) {
      
      inline def setChanges(value: GitChanges): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: modified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
