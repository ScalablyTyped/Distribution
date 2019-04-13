package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletableResource extends Resource {
  @JSName("delete")
  var delete_Original: RestMethod = js.native
  def delete(args: js.Any): qLib.qMod.Promise[_] = js.native
  def delete(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def delete(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

