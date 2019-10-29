package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "errors")
@js.native
class errors () extends js.Object

/* static members */
@JSImport("web3-core-helpers", "errors")
@js.native
object errors extends js.Object {
  def ConnectionTimeout(ms: String): Error = js.native
  def ErrorResponse(result: Error): Error = js.native
  def InvalidConnection(host: String): Error = js.native
  def InvalidNumberOfParams(got: Double, expected: Double, method: String): Error = js.native
  def InvalidProvider(): Error = js.native
  def InvalidResponse(result: Error): Error = js.native
}

