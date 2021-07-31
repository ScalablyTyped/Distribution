package typings.useComposedRef

import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-composed-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: HTMLElement */](libRef: MutableRefObject[T | Null], userRef: UserRef[T]): js.Function1[/* instance */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(libRef.asInstanceOf[js.Any], userRef.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* instance */ T | Null, Unit]]
  
  type UserRef[T] = js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] | Null]
}
