package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcChangesetsRequestData extends js.Object {
  /**
    * List of changeset Ids.
    */
  var changesetIds: js.Array[scala.Double]
  /**
    * Length of the comment.
    */
  var commentLength: scala.Double
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
}

object TfvcChangesetsRequestData {
  @scala.inline
  def apply(changesetIds: js.Array[scala.Double], commentLength: scala.Double, includeLinks: scala.Boolean): TfvcChangesetsRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changesetIds")(changesetIds)
    __obj.updateDynamic("commentLength")(commentLength)
    __obj.updateDynamic("includeLinks")(includeLinks)
    __obj.asInstanceOf[TfvcChangesetsRequestData]
  }
}

