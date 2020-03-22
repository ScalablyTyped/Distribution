package typings.tsMockito

import typings.std.Error
import typings.tsMockito.methodStubSetterMod.MethodStubSetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn0 extends js.Object {
  def apply[T](method: T): MethodStubSetter[T, Unit, Error] = js.native
  def apply[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, Error] = js.native
}

