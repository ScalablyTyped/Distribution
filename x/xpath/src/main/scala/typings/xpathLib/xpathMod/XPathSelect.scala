package typings
package xpathLib.xpathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathSelect extends js.Object {
  def apply(expression: java.lang.String): js.Array[SelectedValue] = js.native
  def apply(expression: java.lang.String, node: stdLib.Node): js.Array[SelectedValue] = js.native
  def apply(expression: java.lang.String, node: stdLib.Node, single: xpathLib.xpathLibNumbers.`true`): SelectedValue = js.native
}

