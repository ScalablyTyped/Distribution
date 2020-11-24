package typings.uifabricReactHooks

import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/react-hooks/lib/useMergedRefs", JSImport.Namespace)
@js.native
object useMergedRefsMod extends js.Object {
  
  def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = js.native
  
  type RefObjectFunction[T] = RefObject[T] with (js.Function1[/* value */ T, Unit])
}
