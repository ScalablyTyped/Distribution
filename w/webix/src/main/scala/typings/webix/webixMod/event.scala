package typings.webix.webixMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "event")
@js.native
object event extends js.Object {
  def apply(node: String, event: String, handler: WebixCallback): String | Double = js.native
  def apply(node: String, event: String, handler: WebixCallback, context: js.Any): String | Double = js.native
  def apply(node: HTMLElement, event: String, handler: WebixCallback): String | Double = js.native
  def apply(node: HTMLElement, event: String, handler: WebixCallback, context: js.Any): String | Double = js.native
}

