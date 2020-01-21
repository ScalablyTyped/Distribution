package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.useCallbackRef.typesMod.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/mergeRef", JSImport.Namespace)
@js.native
object mergeRefMod extends js.Object {
  def mergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
}

