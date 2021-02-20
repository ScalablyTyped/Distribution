package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestMergeOptions extends StObject {
  
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
  implicit class GitPullRequestMergeOptionsMutableBuilder[Self <: GitPullRequestMergeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableRenames(value: Boolean): Self = StObject.set(x, "disableRenames", value.asInstanceOf[js.Any])
  }
}
