package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcLabelRequestData extends js.Object {
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  var itemLabelFilter: java.lang.String
  var labelScope: java.lang.String
  var maxItemCount: scala.Double
  var name: java.lang.String
  var owner: java.lang.String
}

object TfvcLabelRequestData {
  @scala.inline
  def apply(
    includeLinks: scala.Boolean,
    itemLabelFilter: java.lang.String,
    labelScope: java.lang.String,
    maxItemCount: scala.Double,
    name: java.lang.String,
    owner: java.lang.String
  ): TfvcLabelRequestData = {
    val __obj = js.Dynamic.literal(includeLinks = includeLinks, itemLabelFilter = itemLabelFilter, labelScope = labelScope, maxItemCount = maxItemCount, name = name, owner = owner)
  
    __obj.asInstanceOf[TfvcLabelRequestData]
  }
}

