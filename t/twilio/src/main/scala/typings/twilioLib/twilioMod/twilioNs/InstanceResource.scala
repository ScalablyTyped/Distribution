package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(twilioLib.twilioMod.twilioNs.DeletableResource because Would inherit conflicting mutable fields List(get_Original))*/
@js.native
trait InstanceResource extends PostableResource {
  @JSName("update")
  var update_Original: RestMethod = js.native
  def update(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def update(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

