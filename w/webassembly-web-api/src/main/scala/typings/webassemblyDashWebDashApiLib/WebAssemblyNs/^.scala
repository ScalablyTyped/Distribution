package typings
package webassemblyDashWebDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compileStreaming(source: js.Promise[stdLib.Response]): js.Promise[Module] = js.native
  def compileStreaming(source: stdLib.Response): js.Promise[Module] = js.native
  def instantiateStreaming(source: js.Promise[stdLib.Response]): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: js.Promise[stdLib.Response], importObject: js.Object): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: stdLib.Response): js.Promise[ResultObject] = js.native
  def instantiateStreaming(source: stdLib.Response, importObject: js.Object): js.Promise[ResultObject] = js.native
}

