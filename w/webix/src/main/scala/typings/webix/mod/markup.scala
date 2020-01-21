package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait markup extends js.Object {
  var attribute: js.Any
  var dataTag: js.Any
  var namespace: js.Any
  def init(node: String, target: String): baseview
  def parse(data: js.Any, datatype: String): Unit
}

@JSImport("webix", "markup")
@js.native
object markup
  extends TopLevel[typings.webix.webix.markup]

