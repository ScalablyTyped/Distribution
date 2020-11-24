package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestMergeOptions extends js.Object {
  
  /**
    * If true, rename detection will not be performed during the merge.
    */
  var disableRenames: Boolean = js.native
}
object GitPullRequestMergeOptions {
  
  @scala.inline
  def apply(disableRenames: Boolean): GitPullRequestMergeOptions = {
    val __obj = js.Dynamic.literal(disableRenames = disableRenames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestMergeOptions]
  }
  
  @scala.inline
  implicit class GitPullRequestMergeOptionsOps[Self <: GitPullRequestMergeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableRenames(value: Boolean): Self = this.set("disableRenames", value.asInstanceOf[js.Any])
  }
}
