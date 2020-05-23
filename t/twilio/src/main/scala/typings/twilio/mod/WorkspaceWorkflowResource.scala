package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait WorkspaceWorkflowResource extends CreatableMappedResource[WorkspaceWorkflowInstance] {
  @JSName("list")
  var list_Original: RestMethod = js.native
  var statistics: WorkspaceStatisticResource = js.native
  def list(args: js.Any): Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def list(callback: RequestCallback): Promise[_] = js.native
}

