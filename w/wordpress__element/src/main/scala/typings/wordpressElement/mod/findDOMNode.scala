package typings.wordpressElement.mod

import typings.react.mod.ReactInstance
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  def apply(): Element | Null | Text = js.native
  def apply(instance: ReactInstance): Element | Null | Text = js.native
}

