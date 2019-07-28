package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItemRequestData extends js.Object {
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  var itemDescriptors: js.Array[TfvcItemDescriptor]
}

object TfvcItemRequestData {
  @scala.inline
  def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[TfvcItemDescriptor]
  ): TfvcItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata, includeLinks = includeLinks, itemDescriptors = itemDescriptors)
  
    __obj.asInstanceOf[TfvcItemRequestData]
  }
}

