package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitTreeDiffResponse extends js.Object {
  
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
  implicit class GitTreeDiffResponseOps[Self <: GitTreeDiffResponse] (val x: Self) extends AnyVal {
    
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
    def setContinuationTokenVarargs(value: String*): Self = this.set("continuationToken", js.Array(value :_*))
    
    @scala.inline
    def setContinuationToken(value: js.Array[String]): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDiff(value: GitTreeDiff): Self = this.set("treeDiff", value.asInstanceOf[js.Any])
  }
}
