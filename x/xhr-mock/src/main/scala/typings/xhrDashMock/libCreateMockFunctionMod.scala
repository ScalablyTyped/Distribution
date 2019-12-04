package typings.xhrDashMock

import typings.std.RegExp
import typings.xhrDashMock.libTypesMod.Mock
import typings.xhrDashMock.libTypesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/createMockFunction", JSImport.Namespace)
@js.native
object libCreateMockFunctionMod extends js.Object {
  def default(method: String, url: String, mock: Mock): MockFunction = js.native
  def default(method: String, url: RegExp, mock: Mock): MockFunction = js.native
}

