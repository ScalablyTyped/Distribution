package typings
package typescriptDashDeferredLib.typescriptDashDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-deferred", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[T](): typescriptDashDeferredLib.typescriptDashDeferredMod.DeferredInterface[T] = js.native
  def when[T](): typescriptDashDeferredLib.typescriptDashDeferredMod.PromiseInterface[T] = js.native
  def when[T](value: T): typescriptDashDeferredLib.typescriptDashDeferredMod.PromiseInterface[T] = js.native
  def when[T](value: typescriptDashDeferredLib.typescriptDashDeferredMod.ThenableInterface[T]): typescriptDashDeferredLib.typescriptDashDeferredMod.PromiseInterface[T] = js.native
}

