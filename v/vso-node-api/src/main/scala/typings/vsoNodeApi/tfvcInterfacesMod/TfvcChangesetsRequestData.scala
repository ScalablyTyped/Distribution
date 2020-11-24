package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcChangesetsRequestData extends js.Object {
  
  /**
    * List of changeset Ids.
    */
  var changesetIds: js.Array[Double] = js.native
  
  /**
    * Length of the comment.
    */
  var commentLength: Double = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
}
object TfvcChangesetsRequestData {
  
  @scala.inline
  def apply(changesetIds: js.Array[Double], commentLength: Double, includeLinks: Boolean): TfvcChangesetsRequestData = {
    val __obj = js.Dynamic.literal(changesetIds = changesetIds.asInstanceOf[js.Any], commentLength = commentLength.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetsRequestData]
  }
  
  @scala.inline
  implicit class TfvcChangesetsRequestDataOps[Self <: TfvcChangesetsRequestData] (val x: Self) extends AnyVal {
    
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
    def setChangesetIdsVarargs(value: Double*): Self = this.set("changesetIds", js.Array(value :_*))
    
    @scala.inline
    def setChangesetIds(value: js.Array[Double]): Self = this.set("changesetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentLength(value: Double): Self = this.set("commentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = this.set("includeLinks", value.asInstanceOf[js.Any])
  }
}
