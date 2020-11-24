package typings.typedGithubApi

import typings.typedGithubApi.branchRefMod.BranchRefClass
import typings.typedGithubApi.interfacesBranchMod.Branch
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/branch", JSImport.Namespace)
@js.native
object distBranchMod extends js.Object {
  
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.branchMod.Branch) = this()
  }
}
