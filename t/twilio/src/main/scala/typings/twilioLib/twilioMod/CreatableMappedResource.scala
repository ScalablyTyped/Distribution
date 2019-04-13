package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twilioLib.twilioMod.PostableResource because var conflicts: get_Original. Inlined post, post, post, post_Original */ @js.native
trait CreatableMappedResource[T] extends MappedResource[T] {
  @JSName("create")
  var create_Original: RestMethod = js.native
  @JSName("post")
  var post_Original: RestMethod = js.native
  def create(args: js.Any): qLib.qMod.Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def create(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def post(args: js.Any): qLib.qMod.Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def post(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

