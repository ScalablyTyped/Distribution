package typings
package utilDotPromisifyLib.utilDotPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait implementation extends js.Object {
  var custom: js.Symbol = js.native
  var customPromisifyArgs: js.UndefOr[js.Symbol] = js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
}

