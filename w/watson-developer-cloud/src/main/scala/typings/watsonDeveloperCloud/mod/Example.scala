package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Example. */
trait Example extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** An array of contextual entity mentions. */
  var mentions: js.UndefOr[js.Array[Mention]] = js.undefined
  /** The text of a user input example. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 1024 characters. */
  var text: String
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}

object Example {
  @scala.inline
  def apply(text: String, created: String = null, mentions: js.Array[Mention] = null, updated: String = null): Example = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Example]
  }
}

