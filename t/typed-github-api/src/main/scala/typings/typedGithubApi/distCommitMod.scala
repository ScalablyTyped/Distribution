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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommitMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.CommitSummary because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.Commit because var conflicts: author, committer, gitCommit, htmlUri, parents. Inlined changes, files */ @JSImport("typed-github-api/dist/commit", "CommitClass")
  @js.native
  class CommitClass protected () extends CommitSummaryClass {
    def this(repository: RepositoryRefClass, data: Commit) = this()
    
    var changes: GitChanges = js.native
    
    var files: js.Array[GitFile] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "CommitSummaryClass")
  @js.native
  class CommitSummaryClass protected ()
    extends CommitRefClass
       with CommitSummary {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.commitMod.CommitSummary) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.interfacesCommitMod.CommitRef because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.GitCommitSummary because Already inherited
  - typings.typedGithubApi.interfacesCommitMod.GitCommit because var conflicts: author, committer, message. Inlined parents */ @JSImport("typed-github-api/dist/commit", "GitCommitClass")
  @js.native
  class GitCommitClass protected () extends GitCommitSummaryClass {
    def this(repository: RepositoryRefClass, data: GitCommit) = this()
    
    var parents: js.Array[CommitRef] = js.native
  }
  
  @JSImport("typed-github-api/dist/commit", "GitCommitSummaryClass")
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
