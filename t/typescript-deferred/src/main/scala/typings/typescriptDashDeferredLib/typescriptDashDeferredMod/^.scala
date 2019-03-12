package typings
package typescriptDashDeferredLib.typescriptDashDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-deferred", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create[T](): DeferredInterface[T] = js.native
  def when[T](): PromiseInterface[T] = js.native
  def when[T](value: T): PromiseInterface[T] = js.native
  def when[T](value: ThenableInterface[T]): PromiseInterface[T] = js.native
}

