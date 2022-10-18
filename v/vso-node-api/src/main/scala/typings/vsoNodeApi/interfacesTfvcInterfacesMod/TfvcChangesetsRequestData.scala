package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcChangesetsRequestData extends StObject {
  
  /**
    * List of changeset Ids.
    */
  var changesetIds: js.Array[Double]
  
  /**
    * Length of the comment.
    */
  var commentLength: Double
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
}
object TfvcChangesetsRequestData {
  
  inline def apply(changesetIds: js.Array[Double], commentLength: Double, includeLinks: Boolean): TfvcChangesetsRequestData = {
    val __obj = js.Dynamic.literal(changesetIds = changesetIds.asInstanceOf[js.Any], commentLength = commentLength.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetsRequestData]
  }
  
  extension [Self <: TfvcChangesetsRequestData](x: Self) {
    
    inline def setChangesetIds(value: js.Array[Double]): Self = StObject.set(x, "changesetIds", value.asInstanceOf[js.Any])
    
    inline def setChangesetIdsVarargs(value: Double*): Self = StObject.set(x, "changesetIds", js.Array(value*))
    
    inline def setCommentLength(value: Double): Self = StObject.set(x, "commentLength", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
  }
}
