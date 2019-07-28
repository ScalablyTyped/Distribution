package typings.xpath.xpathMod

import typings.std.Node
import typings.xpath.xpathNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathSelect extends js.Object {
  def apply(expression: String): js.Array[SelectedValue] = js.native
  def apply(expression: String, node: Node): js.Array[SelectedValue] = js.native
  def apply(expression: String, node: Node, single: `true`): SelectedValue = js.native
}

