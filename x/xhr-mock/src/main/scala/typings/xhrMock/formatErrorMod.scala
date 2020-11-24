package typings.xhrMock

import typings.std.Error
import typings.xhrMock.mockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/formatError", JSImport.Namespace)
@js.native
object formatErrorMod extends js.Object {
  
  def formatError(msg: String, req: default): String = js.native
  def formatError(msg: String, req: default, err: Error): String = js.native
}
