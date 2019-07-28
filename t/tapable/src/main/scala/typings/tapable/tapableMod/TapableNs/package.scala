package typings.tapable.tapableMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TapableNs {
  type CallbackFunction = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* result */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    Unit
  ]
  type Handler = js.Function1[/* repeated */ js.Any, Unit]
}
