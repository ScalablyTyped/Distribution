package typings.webix.mod

import typings.webix.webix.Ajax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ajax")
@js.native
object ajax extends js.Object {
  def apply(): Ajax | js.Promise[_] = js.native
  def apply(url: String): Ajax | js.Promise[_] = js.native
  def apply(url: String, params: js.Any): Ajax | js.Promise[_] = js.native
}

