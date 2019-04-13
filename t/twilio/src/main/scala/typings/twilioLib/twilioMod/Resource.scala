package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  @JSName("get")
  var get_Original: RestMethod = js.native
  def get(args: js.Any): qLib.qMod.Promise[_] = js.native
  def get(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def get(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

