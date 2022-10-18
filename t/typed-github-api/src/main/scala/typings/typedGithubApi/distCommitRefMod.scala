package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distInterfacesCommitMod.Commit
import typings.typedGithubApi.distInterfacesCommitMod.CommitRef
import typings.typedGithubApi.distInterfacesCommitMod.GitCommit
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommitRefMod {
  
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
