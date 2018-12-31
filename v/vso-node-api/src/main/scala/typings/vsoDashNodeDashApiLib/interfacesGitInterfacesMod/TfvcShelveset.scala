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

