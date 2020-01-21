package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetsRequestData extends js.Object {
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
  @scala.inline
  def apply(changesetIds: js.Array[Double], commentLength: Double, includeLinks: Boolean): TfvcChangesetsRequestData = {
    val __obj = js.Dynamic.literal(changesetIds = changesetIds.asInstanceOf[js.Any], commentLength = commentLength.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcChangesetsRequestData]
  }
}

