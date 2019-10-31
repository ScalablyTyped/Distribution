package typings.useDashCallbackDashRef

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/createRef", JSImport.Namespace)
@js.native
object distEs5CreateRefMod extends js.Object {
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, _]): RefObject[T] = js.native
}

