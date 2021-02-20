package typings.typedGithubApi

import typings.typedGithubApi.branchRefMod.BranchRefClass
import typings.typedGithubApi.interfacesBranchMod.Branch
import typings.typedGithubApi.repositoryRefMod.RepositoryRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBranchMod {
  
  @JSImport("typed-github-api/dist/branch", "BranchClass")
  @js.native
  class BranchClass protected ()
    extends BranchRefClass
       with Branch {
    def this(repository: RepositoryRefClass, data: typings.typedGithubApi.branchMod.Branch) = this()
  }
}
