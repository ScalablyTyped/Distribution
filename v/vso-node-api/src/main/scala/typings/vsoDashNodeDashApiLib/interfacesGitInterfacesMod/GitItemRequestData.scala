package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitItemRequestData extends js.Object {
  /**
    * Whether to include metadata for all items
    */
  var includeContentMetadata: scala.Boolean
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  /**
    * Collection of items to fetch, including path, version, and recursion level
    */
  var itemDescriptors: js.Array[GitItemDescriptor]
  /**
    * Whether to include shallow ref to commit that last changed each item
    */
  var latestProcessedChange: scala.Boolean
}

object GitItemRequestData {
  @scala.inline
  def apply(
    includeContentMetadata: scala.Boolean,
    includeLinks: scala.Boolean,
    itemDescriptors: js.Array[GitItemDescriptor],
    latestProcessedChange: scala.Boolean
  ): GitItemRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeContentMetadata")(includeContentMetadata)
    __obj.updateDynamic("includeLinks")(includeLinks)
    __obj.updateDynamic("itemDescriptors")(itemDescriptors)
    __obj.updateDynamic("latestProcessedChange")(latestProcessedChange)
    __obj.asInstanceOf[GitItemRequestData]
  }
}

