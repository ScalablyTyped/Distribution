package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitMergeOriginRef extends StObject {
  
  var pullRequestId: Double
}
object GitMergeOriginRef {
  
  @scala.inline
  def apply(pullRequestId: Double): GitMergeOriginRef = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitMergeOriginRef]
  }
  
  @scala.inline
  implicit class GitMergeOriginRefMutableBuilder[Self <: GitMergeOriginRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
