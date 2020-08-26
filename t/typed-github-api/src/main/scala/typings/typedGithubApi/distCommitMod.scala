package typings.typedGithubApi

import typings.typedGithubApi.commitMod.Commit
import typings.typedGithubApi.commitMod.GitCommit
import typings.typedGithubApi.commitRefMod.CommitRefClass
import typings.typedGithubApi.interfacesCommitMod.CommitRef
import typings.typedGithubApi.interfacesCommitMod.CommitSummary
import typings.typedGithubApi.interfacesCommitMod.GitChanges
import typings.typedGithubApi.interfacesCommitMod.GitCommitSummary
import typings.typedGithubApi.interfacesCommitMod.GitFile
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/commit", JSImport.Namespace)
@js.native
object distCommitMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.CommitSummary because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    var changes: GitChanges = js.native
    var files: js.Array[GitFile] = js.native
  }
  
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.commitMod.CommitSummary) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.GitCommitSummary because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(repository: RepositoryRefClass, data: GitCommit) = this()
    var parents: js.Array[CommitRef] = js.native
  }
  
  @js.native
  class GitCommitSummaryClass protected ()
    extends CommitRefClass
       with GitCommitSummary {
    def this(
      repository: RepositoryRefClass,
      sha: String,
      data: typings.typedGithubApi.commitMod.GitCommitSummary
    ) = this()
  }
  
}

