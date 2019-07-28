package typings.wu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wuMod {
  type Consumer[T] = js.Function1[/* t */ T, Unit]
  type Filter[T] = js.Function1[/* t */ T, Boolean]
}
