package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOwnerRefMod {
  
  @JSImport("typed-github-api/dist/owner-ref", "OwnerRefClass")
  @js.native
  open class OwnerRefClass protected ()
    extends GitHubRef
       with OwnerRef {
    def this(login: String, options: OptionsOrRef) = this()
  }
}
