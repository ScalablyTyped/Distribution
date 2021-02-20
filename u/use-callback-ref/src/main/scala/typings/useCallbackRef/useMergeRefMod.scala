package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.useCallbackRef.typesMod.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergeRefMod {
  
  @JSImport("use-callback-ref/dist/es5/useMergeRef", "useMergeRefs")
  @js.native
  def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
  @JSImport("use-callback-ref/dist/es5/useMergeRef", "useMergeRefs")
  @js.native
  def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = js.native
}
