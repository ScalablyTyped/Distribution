package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import typings.typedDashGithubDashApi.distInterfacesLabelMod.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/label", JSImport.Namespace)
@js.native
object distLabelMod extends js.Object {
  @js.native
  class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typings.typedDashGithubDashApi.distApiDashInterfacesLabelMod.Label, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var color: String = js.native
    /* CompleteClass */
    override var default: Boolean = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

