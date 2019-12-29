package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod.Commit
import typings.typedDashGithubDashApi.distCommitDashRefMod.CommitRefClass
import typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef
import typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary
import typings.typedDashGithubDashApi.distInterfacesCommitMod.GitActor
import typings.typedDashGithubDashApi.distInterfacesCommitMod.GitChanges
import typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommit
import typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommitSummary
import typings.typedDashGithubDashApi.distInterfacesCommitMod.GitFile
import typings.typedDashGithubDashApi.distInterfacesRepositoryMod.RepositoryRef
import typings.typedDashGithubDashApi.distRepositoryDashRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit", JSImport.Namespace)
@js.native
object distCommitMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitSummary because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    var changes: GitChanges = js.native
    var files: js.Array[GitFile] = js.native
  }
  
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(
      repository: RepositoryRefClass,
      data: typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod.CommitSummary
    ) = this()
    /* CompleteClass */
    override var gitCommit: GitCommitSummary = js.native
    /* CompleteClass */
    override var htmlUri: String = js.native
    /* CompleteClass */
    override var parents: js.Array[CommitRef] = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typings.typedDashGithubDashApi.distInterfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.CommitRef because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommitSummary because Already inherited
  - typings.typedDashGithubDashApi.distInterfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(
      repository: RepositoryRefClass,
      data: typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod.GitCommit
    ) = this()
    var parents: js.Array[CommitRef] = js.native
  }
  
  @js.native
  class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod.GitCommitSummary
    ) = this()
    /* CompleteClass */
    override var author: GitActor = js.native
    /* CompleteClass */
    override var committer: GitActor = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override val repository: RepositoryRef = js.native
    /* CompleteClass */
    override val sha: String = js.native
    /* CompleteClass */
    override def loadAsync(): js.Promise[typings.typedDashGithubDashApi.distInterfacesCommitMod.Commit | Null] = js.native
    /* CompleteClass */
    override def loadGitAsync(): js.Promise[GitCommit | Null] = js.native
  }
  
}

