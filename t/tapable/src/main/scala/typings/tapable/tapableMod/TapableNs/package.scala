package typings.tapable.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TapableNs {
  import typings.std.Error

  type CallbackFunction = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* result */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    Unit
  ]
  type Handler = js.Function1[/* repeated */ js.Any, Unit]
}
