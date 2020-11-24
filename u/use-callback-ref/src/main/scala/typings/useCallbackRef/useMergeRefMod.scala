package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.useCallbackRef.typesMod.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-callback-ref/dist/es5/useMergeRef", JSImport.Namespace)
@js.native
object useMergeRefMod extends js.Object {
  
  def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
  def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = js.native
}
