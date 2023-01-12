package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestMergeOptions extends StObject {
  
  /**
    * If true, rename detection will not be performed during the merge.
    */
  var disableRenames: Boolean
}
object GitPullRequestMergeOptions {
  
  inline def apply(disableRenames: Boolean): GitPullRequestMergeOptions = {
    val __obj = js.Dynamic.literal(disableRenames = disableRenames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestMergeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitPullRequestMergeOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableRenames(value: Boolean): Self = StObject.set(x, "disableRenames", value.asInstanceOf[js.Any])
  }
}
