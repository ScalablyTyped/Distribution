package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.RuntimeError")
@js.native
class RuntimeError ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, fileName: java.lang.String) = this()
  def this(message: java.lang.String, fileName: java.lang.String, lineNumber: scala.Double) = this()
  val columnNumber: java.lang.String = js.native
  val fileName: java.lang.String = js.native
  val lineNumber: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

