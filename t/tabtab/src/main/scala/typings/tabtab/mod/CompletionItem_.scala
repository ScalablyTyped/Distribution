package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItem_ extends js.Object {
  /**
    * The optional description of the completion.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The sub-command or option name.
    */
  var name: String
}

object CompletionItem_ {
  @scala.inline
  def apply(name: String, description: String = null): CompletionItem_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem_]
  }
}

