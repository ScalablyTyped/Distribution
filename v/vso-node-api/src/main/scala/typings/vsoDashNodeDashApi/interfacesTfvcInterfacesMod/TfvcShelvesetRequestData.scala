package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShelvesetRequestData extends js.Object {
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: Boolean
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: Boolean
  /**
    * Whether to include workItems
    */
  var includeWorkItems: Boolean
  /**
    * Max number of changes to include
    */
  var maxChangeCount: Double
  /**
    * Max length of comment
    */
  var maxCommentLength: Double
  /**
    * Shelveset's name
    */
  var name: String
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: String
}

object TfvcShelvesetRequestData {
  @scala.inline
  def apply(
    includeDetails: Boolean,
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    maxChangeCount: Double,
    maxCommentLength: Double,
    name: String,
    owner: String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails, includeLinks = includeLinks, includeWorkItems = includeWorkItems, maxChangeCount = maxChangeCount, maxCommentLength = maxCommentLength, name = name, owner = owner)
  
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
}

