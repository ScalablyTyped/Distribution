package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  @JSImport("typed-github-api/dist/label", "LabelClass")
  @js.native
  open class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typings.typedGithubApi.distApiInterfacesLabelMod.Label, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var default: Boolean = js.native
    
    /* CompleteClass */
    var color: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
