package typings
package xmldomLib.xmldomMod.xmldomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandlerObject extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var fatalError: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
  var warning: js.UndefOr[js.Function1[/* msg */ js.Any, _]] = js.undefined
}

