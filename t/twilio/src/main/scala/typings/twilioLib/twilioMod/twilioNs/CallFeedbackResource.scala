package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twilioLib.twilioMod.twilioNs.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ @js.native
trait CallFeedbackResource extends PostableResource {
  @JSName("create")
  var create_Original: RestMethod = js.native
  @JSName("delete")
  var delete_Original: RestMethod = js.native
  def create(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def create(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def delete(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def delete(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

