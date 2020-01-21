package typings.webix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "alert")
@js.native
object alert extends js.Object {
  def apply(text: js.Any): js.Promise[_] = js.native
  def apply(text: js.Any, `type`: String): js.Promise[_] = js.native
  def apply(text: js.Any, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def apply(text: js.Any, `type`: WebixCallback): js.Promise[_] = js.native
  def apply(text: js.Any, `type`: WebixCallback, callback: WebixCallback): js.Promise[_] = js.native
}

