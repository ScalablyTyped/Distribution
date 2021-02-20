package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTreeDiffResponse extends StObject {
  
  /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
  var continuationToken: js.Array[String] = js.native
  
  var treeDiff: GitTreeDiff = js.native
}
object GitTreeDiffResponse {
  
  @scala.inline
  def apply(continuationToken: js.Array[String], treeDiff: GitTreeDiff): GitTreeDiffResponse = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], treeDiff = treeDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeDiffResponse]
  }
  
  @scala.inline
  implicit class GitTreeDiffResponseMutableBuilder[Self <: GitTreeDiffResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuationToken(value: js.Array[String]): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenVarargs(value: String*): Self = StObject.set(x, "continuationToken", js.Array(value :_*))
    
    @scala.inline
    def setTreeDiff(value: GitTreeDiff): Self = StObject.set(x, "treeDiff", value.asInstanceOf[js.Any])
  }
}
