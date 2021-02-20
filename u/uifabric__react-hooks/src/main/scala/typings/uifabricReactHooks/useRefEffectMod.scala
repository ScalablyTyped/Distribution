package typings.uifabricReactHooks

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefEffectMod {
  
  @JSImport("@uifabric/react-hooks/lib/useRefEffect", "useRefEffect")
  @js.native
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = js.native
  @JSImport("@uifabric/react-hooks/lib/useRefEffect", "useRefEffect")
  @js.native
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = js.native
  
  type RefCallback[T] = (js.Function1[/* value */ T | Null, Unit]) with RefObject[T]
}
