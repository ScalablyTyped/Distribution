package typings.uifabricReactHooks

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefEffectMod {
  
  @JSImport("@uifabric/react-hooks/lib/useRefEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[RefCallback[T]]
  
  type RefCallback[T] = (js.Function1[/* value */ T | Null, Unit]) & RefObject[T]
}
