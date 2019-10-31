package typings.useDashCallbackDashRef

import typings.react.reactMod.MutableRefObject
import typings.useDashCallbackDashRef.distEs5TypesMod.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/useMergeRef", JSImport.Namespace)
@js.native
object distEs5UseMergeRefMod extends js.Object {
  def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
  def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = js.native
}

