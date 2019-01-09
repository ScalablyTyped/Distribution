package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twilioLib.twilioMod.twilioNs.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ @js.native
trait MessageInstance extends PostableResource {
  @JSName("delete")
  var delete_Original: RestMethod = js.native
  var media: MessageMediaResource = js.native
  def delete(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def delete(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

