package typings.web3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import typings.std.Error

  type Callback[T] = js.Function2[/* error */ Error, /* result */ T, Unit]
}
