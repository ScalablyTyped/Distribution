package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSShortCodeInstance extends PostableResource {
  @JSName("update")
  var update_Original: RestMethod = js.native
  def update(args: js.Any): qLib.qMod.Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def update(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

