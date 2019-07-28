package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCreateRefMod {
  type IRefObject[T] = typings.react.reactMod.RefObject[T] | RefObject[T] | (js.Function1[/* ref */ T | Null, Unit])
}
