package typings.web3

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Callback[T] = js.Function2[/* error */ Error, /* result */ T, Unit]
}
