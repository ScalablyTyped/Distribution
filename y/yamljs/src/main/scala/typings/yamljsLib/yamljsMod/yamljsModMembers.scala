package typings
package yamljsLib.yamljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yamljs", JSImport.Namespace)
@js.native
object yamljsModMembers extends js.Object {
  def load(path: java.lang.String): js.Any = js.native
  def load(path: java.lang.String, callback: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def parse(yamlString: java.lang.String): js.Any = js.native
  def stringify(nativeObject: js.Any): java.lang.String = js.native
  def stringify(nativeObject: js.Any, `inline`: scala.Double): java.lang.String = js.native
  def stringify(nativeObject: js.Any, `inline`: scala.Double, spaces: scala.Double): java.lang.String = js.native
}

