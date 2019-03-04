package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    createdDate: stdLib.Date,
    id: java.lang.String,
    name: java.lang.String,
    notes: js.Array[CheckinNote],
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    policyOverride: TfvcPolicyOverrideInfo,
    url: java.lang.String,
    workItems: js.Array[AssociatedWorkItem]
  ): TfvcShelveset = {
    val __obj = js.Dynamic.literal(_links = _links, changes = changes, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, id = id, name = name, notes = notes, owner = owner, policyOverride = policyOverride, url = url, workItems = workItems)
  
    __obj.asInstanceOf[TfvcShelveset]
  }
}

