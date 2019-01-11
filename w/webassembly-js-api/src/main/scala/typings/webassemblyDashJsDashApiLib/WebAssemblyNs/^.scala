package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly")
@js.native
object ^ extends js.Object {
  def compile(bufferSource: webassemblyDashJsDashApiLib.WebAssemblyNs.BufferSource): js.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.Module] = js.native
  def instantiate(bufferSource: webassemblyDashJsDashApiLib.WebAssemblyNs.BufferSource): js.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
  def instantiate(bufferSource: webassemblyDashJsDashApiLib.WebAssemblyNs.BufferSource, importObject: js.Object): js.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.ResultObject] = js.native
  def instantiate(module: webassemblyDashJsDashApiLib.WebAssemblyNs.Module): js.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.Instance] = js.native
  def instantiate(module: webassemblyDashJsDashApiLib.WebAssemblyNs.Module, importObject: js.Object): js.Promise[webassemblyDashJsDashApiLib.WebAssemblyNs.Instance] = js.native
  def validate(bufferSource: webassemblyDashJsDashApiLib.WebAssemblyNs.BufferSource): scala.Boolean = js.native
}

