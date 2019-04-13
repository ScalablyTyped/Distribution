package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestMethod extends js.Object {
  def apply(args: js.Any): qLib.qMod.Promise[_] = js.native
  def apply(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def apply(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

