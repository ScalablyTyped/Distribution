package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Memory")
@js.native
class Memory protected () extends js.Object {
  def this(memoryDescriptor: MemoryDescriptor) = this()
  val buffer: stdLib.ArrayBuffer = js.native
  def grow(numPages: scala.Double): scala.Double = js.native
}

