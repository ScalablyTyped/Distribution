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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("commentTruncated")(commentTruncated)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("notes")(notes)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("policyOverride")(policyOverride)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[TfvcShelveset]
  }
}

