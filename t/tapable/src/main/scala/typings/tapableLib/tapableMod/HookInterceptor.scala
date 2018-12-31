package typings
package tapableLib.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tapable", "HookInterceptor")
@js.native
class HookInterceptor () extends js.Object {
  var call: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.native
  var context: js.UndefOr[scala.Boolean] = js.native
  var loop: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.native
  var register: js.UndefOr[js.Function1[/* tap */ Tap, js.UndefOr[Tap]]] = js.native
  var tap: js.UndefOr[js.Function1[/* tap */ Tap, scala.Unit]] = js.native
}

