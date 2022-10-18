package typings.typedGithubApi

import typings.typedGithubApi.distApiInterfacesCommitMod.Commit
import typings.typedGithubApi.distCommitRefMod.CommitRefClass
import typings.typedGithubApi.distInterfacesCommitMod.CommitRef
import typings.typedGithubApi.distInterfacesCommitMod.CommitSummary
import typings.typedGithubApi.distInterfacesCommitMod.GitActor
import typings.typedGithubApi.distInterfacesCommitMod.GitChanges
import typings.typedGithubApi.distInterfacesCommitMod.GitCommit
import typings.typedGithubApi.distInterfacesCommitMod.GitCommitSummary
import typings.typedGithubApi.distInterfacesCommitMod.GitFile
import typings.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedGithubApi.distRepositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommitMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.distInterfacesCommitMod.CommitSummary because Already inherited
  - typings.typedGithubApi.distInterfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @JSImport("typed-github-api/dist/commit", "CommitClass")
  @js.native
  open class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    
    var changes: GitChanges = js.native
    
    var files: js.Array[GitFile] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "CommitSummaryClass")
  @js.native
  open class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(
      repository: RepositoryRefClass,
      data: typings.typedGithubApi.distApiInterfacesCommitMod.CommitSummary
    ) = this()
    
    /* CompleteClass */
    var gitCommit: GitCommitSummary = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[typings.typedGithubApi.distInterfacesCommitMod.Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    var parents: js.Array[CommitRef] = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.distInterfacesCommitMod.GitCommitSummary because Already inherited
  - typings.typedGithubApi.distInterfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @JSImport("typed-github-api/dist/commit", "GitCommitClass")
  @js.native
  open class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.distApiInterfacesCommitMod.GitCommit) = this()
    
    var parents: js.Array[CommitRef] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "GitCommitSummaryClass")
  @js.native
  open class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typings.typedGithubApi.distApiInterfacesCommitMod.GitCommitSummary
    ) = this()
    
    /* CompleteClass */
    var author: GitActor = js.native
    
    /* CompleteClass */
    var committer: GitActor = js.native
    
    /* CompleteClass */
    override def loadAsync(): js.Promise[typings.typedGithubApi.distInterfacesCommitMod.Commit | Null] = js.native
    
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    
    /* CompleteClass */
    override val sha: String = js.native
  }
}
