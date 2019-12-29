package typings.useDashCallbackDashRef

import typings.react.reactMod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/types", JSImport.Namespace)
@js.native
object distEs5TypesMod extends js.Object {
  type ReactRef[T] = RefCallback[T] | RefObject[T]
  type RefCallback[T] = js.Function1[/* newValue */ T | Null, Unit]
  type RefObject[T] = MutableRefObject[T | Null]
}

