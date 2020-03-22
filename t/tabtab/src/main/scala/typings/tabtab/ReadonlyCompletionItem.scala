package typings.tabtab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tabtab.tabtab.CompletionItem> */
trait ReadonlyCompletionItem extends js.Object {
  val description: js.UndefOr[String] = js.undefined
  val name: String
}

object ReadonlyCompletionItem {
  @scala.inline
  def apply(name: String, description: String = null): ReadonlyCompletionItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCompletionItem]
  }
}

