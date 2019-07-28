package typings.webassemblyDashWebDashApi.WebAssemblyNs

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compileStreaming(source: js.Promise[Response]): js.Promise[Module] = js.native
  def compileStreaming(source: Response): js.Promise[Module] = js.native
  def instantiateStreaming(source: js.Promise[Response]): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: js.Promise[Response], importObject: js.Object): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: Response): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: Response, importObject: js.Object): js.Promise[ResultObject] = js.native
}

