package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Table")
@js.native
class Table protected () extends js.Object {
  def this(tableDescriptor: TableDescriptor) = this()
  val length: scala.Double = js.native
  def get(index: scala.Double): js.Function1[/* args */ js.Array[_], _] = js.native
  def grow(numElements: scala.Double): scala.Double = js.native
  def set(index: scala.Double, value: js.Function1[/* args */ js.Array[_], _]): scala.Unit = js.native
}

