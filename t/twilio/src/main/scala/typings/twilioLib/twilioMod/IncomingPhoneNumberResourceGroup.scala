package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingPhoneNumberResourceGroup extends PostableResource {
  @JSName("create")
  var create_Original: RestMethod = js.native
  def create(args: js.Any): qLib.qMod.Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def create(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

