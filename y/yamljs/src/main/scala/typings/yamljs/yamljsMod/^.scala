package typings.yamljs.yamljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yamljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(path: String): js.Any = js.native
  def load(path: String, callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  def parse(yamlString: String): js.Any = js.native
  def stringify(nativeObject: js.Any): String = js.native
  def stringify(nativeObject: js.Any, `inline`: Double): String = js.native
  def stringify(nativeObject: js.Any, `inline`: Double, spaces: Double): String = js.native
}

