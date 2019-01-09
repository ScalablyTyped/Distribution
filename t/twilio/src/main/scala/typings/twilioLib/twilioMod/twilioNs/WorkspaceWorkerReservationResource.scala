package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twilioLib.twilioMod.twilioNs.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait WorkspaceWorkerReservationResource extends MappedResource[WorkspaceWorkerReservationInstance] {
  @JSName("list")
  var list_Original: RestMethod = js.native
  def list(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def list(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

