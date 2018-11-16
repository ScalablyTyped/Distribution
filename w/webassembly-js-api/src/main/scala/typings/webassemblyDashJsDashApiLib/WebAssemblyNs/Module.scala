package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * WebAssembly.Module
     */
@JSGlobal("WebAssembly.Module")
@js.native
class Module protected () extends js.Object {
  def this(bufferSource: stdLib.ArrayBuffer) = this()
  def this(bufferSource: stdLib.Uint8Array) = this()
}

/**
     * WebAssembly.Module
     */
@JSGlobal("WebAssembly.Module")
@js.native
object Module extends js.Object {
  def customSections(module: webassemblyDashJsDashApiLib.WebAssemblyNs.Module, sectionName: java.lang.String): js.Array[stdLib.ArrayBuffer] = js.native
  def exports(module: webassemblyDashJsDashApiLib.WebAssemblyNs.Module): webassemblyDashJsDashApiLib.WebAssemblyNs.Imports = js.native
  def imports(module: webassemblyDashJsDashApiLib.WebAssemblyNs.Module): webassemblyDashJsDashApiLib.WebAssemblyNs.Exports = js.native
}

