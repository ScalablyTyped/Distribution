package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcChangesetsRequestData extends StObject {
  
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
  implicit class TfvcChangesetsRequestDataMutableBuilder[Self <: TfvcChangesetsRequestData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangesetIds(value: js.Array[Double]): Self = StObject.set(x, "changesetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesetIdsVarargs(value: Double*): Self = StObject.set(x, "changesetIds", js.Array(value :_*))
    
    @scala.inline
    def setCommentLength(value: Double): Self = StObject.set(x, "commentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
  }
}
