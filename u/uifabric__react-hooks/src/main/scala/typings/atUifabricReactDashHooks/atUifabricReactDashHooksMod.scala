package typings.atUifabricReactDashHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks", JSImport.Namespace)
@js.native
object atUifabricReactDashHooksMod extends js.Object {
  def useConst[T](initialValue: T): T = js.native
  def useConst[T](initialValue: js.Function0[T]): T = js.native
  def useConstCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): T = js.native
  def useId(): String = js.native
  def useId(prefix: String): String = js.native
}

