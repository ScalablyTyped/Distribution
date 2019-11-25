package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputTextValuesElement. */
trait DialogNodeOutputTextValuesElement extends js.Object {
  /** The text of a response. This string can include newline characters (`\\n`), Markdown tagging, or other special characters, if supported by the channel. It must be no longer than 4096 characters. */
  var text: js.UndefOr[String] = js.undefined
}

object DialogNodeOutputTextValuesElement {
  @scala.inline
  def apply(text: String = null): DialogNodeOutputTextValuesElement = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputTextValuesElement]
  }
}

