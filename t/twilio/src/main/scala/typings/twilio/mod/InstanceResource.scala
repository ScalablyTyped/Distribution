package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ @js.native
trait InstanceResource extends PostableResource {
  @JSName("delete")
  var delete_Original: RestMethod = js.native
  @JSName("update")
  var update_Original: RestMethod = js.native
  def delete(args: js.Any): Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def delete(callback: RequestCallback): Promise[_] = js.native
  def update(args: js.Any): Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def update(callback: RequestCallback): Promise[_] = js.native
}

