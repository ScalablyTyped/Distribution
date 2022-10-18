package typings.typedGithubApi

import typings.typedGithubApi.distGithubApiMod.GitHubApi
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-github-api", JSImport.Default)
  @js.native
  open class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
  @JSImport("typed-github-api", "IssueWebHook")
  @js.native
  open class IssueWebHook protected ()
    extends typings.typedGithubApi.distWebHookMod.IssueWebHook {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
  }
}
