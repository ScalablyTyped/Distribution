package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestMethod extends js.Object {
  def apply(args: js.Any): Promise[_] = js.native
  def apply(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def apply(callback: RequestCallback): Promise[_] = js.native
}

