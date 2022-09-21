package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.interfacesCommitMod.Commit
import typings.typedGithubApi.interfacesCommitMod.CommitRef
import typings.typedGithubApi.interfacesCommitMod.GitCommit
import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitRefMod {
  
  @JSImport("typed-github-api/dist/commit-ref", "CommitRefClass")
  @js.native
  open class CommitRefClass protected ()
    extends GitHubRef
       with CommitRef {
    def this(repository: RepositoryRefClass, sha: String) = this()
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    @JSName("repository")
    val repository_CommitRefClass: RepositoryRefClass = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
}
