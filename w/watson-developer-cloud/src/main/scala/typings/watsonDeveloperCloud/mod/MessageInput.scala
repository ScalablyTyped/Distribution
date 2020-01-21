package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An input object that includes the input text. */
trait MessageInput
  extends /** MessageInput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.undefined
}

object MessageInput {
  @scala.inline
  def apply(
    StringDictionary: /** MessageInput accepts additional properties. */
  /* propName */ StringDictionary[js.Any] = null,
    text: String = null
  ): MessageInput = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageInput]
  }
}

