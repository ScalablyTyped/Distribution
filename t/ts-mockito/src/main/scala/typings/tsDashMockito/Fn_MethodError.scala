package typings.tsDashMockito

import typings.std.Error
import typings.tsDashMockito.libMethodStubSetterMod.MethodStubSetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MethodError extends js.Object {
  def apply[T](method: T): MethodStubSetter[T, Unit, Error] = js.native
  def apply[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, Error] = js.native
}

