package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcLabelRequestData extends js.Object {
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  var itemLabelFilter: String
  var labelScope: String
  var maxItemCount: Double
  var name: String
  var owner: String
}

object TfvcLabelRequestData {
  @scala.inline
  def apply(
    includeLinks: Boolean,
    itemLabelFilter: String,
    labelScope: String,
    maxItemCount: Double,
    name: String,
    owner: String
  ): TfvcLabelRequestData = {
    val __obj = js.Dynamic.literal(includeLinks = includeLinks.asInstanceOf[js.Any], itemLabelFilter = itemLabelFilter.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], maxItemCount = maxItemCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcLabelRequestData]
  }
}

