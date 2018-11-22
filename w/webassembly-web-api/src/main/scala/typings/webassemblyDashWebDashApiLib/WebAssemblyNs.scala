package typings
package webassemblyDashWebDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 *  The WebAssembly Web API defines extensions to the JavaScript API made
 *  available specifically in web browsers. See [WebAssembly Web
 *  API](https://www.w3.org/TR/wasm-web-api-1/) for more information.
 */
@JSGlobal("WebAssembly")
@js.native
object WebAssemblyNs extends js.Object {
  def compileStreaming(source: stdLib.Promise[stdLib.Response]): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.Module] = js.native
  def compileStreaming(source: stdLib.Response): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.Module] = js.native
  def instantiateStreaming(source: stdLib.Promise[stdLib.Response]): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
  def instantiateStreaming(source: stdLib.Promise[stdLib.Response], importObject: js.Object): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
  def instantiateStreaming(source: stdLib.Response): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
  def instantiateStreaming(source: stdLib.Response, importObject: js.Object): stdLib.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
}

