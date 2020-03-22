package typings.tsMockito

import typings.tsMockito.methodStubVerificatorMod.MethodStubVerificator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMethod extends js.Object {
  def apply[T](method: T): MethodStubVerificator[T] = js.native
}

