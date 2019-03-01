package typings
package typescriptDashDeferredLib.typescriptDashDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredInterface[T] extends js.Object {
  var promise: PromiseInterface[T] = js.native
  def reject(): DeferredInterface[T] = js.native
  def reject(error: js.Any): DeferredInterface[T] = js.native
  def resolve(): DeferredInterface[T] = js.native
  def resolve(value: T): DeferredInterface[T] = js.native
  def resolve(value: ThenableInterface[T]): DeferredInterface[T] = js.native
}

