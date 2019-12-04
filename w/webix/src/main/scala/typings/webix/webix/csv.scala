package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csv extends js.Object {
  var delimiter: js.Any = js.native
  var escape: Boolean = js.native
  def parse(text: String): js.Array[_] = js.native
  def parse(text: String, delimiter: js.Any): js.Array[_] = js.native
  def stringify(data: js.Array[_]): String = js.native
  def stringify(data: js.Array[_], delimiter: js.Any): String = js.native
}

@JSGlobal("webix.csv")
@js.native
object csv extends TopLevel[csv]

