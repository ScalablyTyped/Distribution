package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instructions extends js.Object {
  var instructions: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Instructions {
  @scala.inline
  def apply(instructions: String = null, title: String = null): Instructions = {
    val __obj = js.Dynamic.literal()
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instructions]
  }
}

