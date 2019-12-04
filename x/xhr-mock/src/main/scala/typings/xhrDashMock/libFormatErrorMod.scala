package typings.xhrDashMock

import typings.std.Error
import typings.xhrDashMock.libMockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/formatError", JSImport.Namespace)
@js.native
object libFormatErrorMod extends js.Object {
  def formatError(msg: String, req: default): String = js.native
  def formatError(msg: String, req: default, err: Error): String = js.native
}

