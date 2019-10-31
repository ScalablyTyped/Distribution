package typings.useDashCallbackDashRef

import typings.useDashCallbackDashRef.distEs5TypesMod.ReactRef
import typings.useDashCallbackDashRef.distEs5TypesMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/transformRef", JSImport.Namespace)
@js.native
object distEs5TransformRefMod extends js.Object {
  def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = js.native
}

