package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShelveset extends TfvcShelvesetRef {
  var changes: js.Array[TfvcChange]
  var notes: js.Array[CheckinNote]
  var policyOverride: TfvcPolicyOverrideInfo
  var workItems: js.Array[AssociatedWorkItem]
}

object TfvcShelveset {
  @scala.inline
  def apply(
    _links: js.Any,
    changes: js.Array[TfvcChange],
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
    id: String,
    name: String,
    notes: js.Array[CheckinNote],
    owner: IdentityRef,
    policyOverride: TfvcPolicyOverrideInfo,
    url: String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcShelveset = {
    val __obj = js.Dynamic.literal(_links = _links, changes = changes, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, id = id, name = name, notes = notes, owner = owner, policyOverride = policyOverride, url = url, workItems = workItems)
  
    __obj.asInstanceOf[TfvcShelveset]
  }
}

