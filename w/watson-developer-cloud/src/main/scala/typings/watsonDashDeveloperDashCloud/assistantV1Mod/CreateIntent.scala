package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CreateIntent. */
trait CreateIntent extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.undefined
  /** An array of user input examples for the intent. */
  var examples: js.UndefOr[js.Array[Example]] = js.undefined
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var intent: String
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}

object CreateIntent {
  @scala.inline
  def apply(
    intent: String,
    created: String = null,
    description: String = null,
    examples: js.Array[Example] = null,
    updated: String = null
  ): CreateIntent = {
    val __obj = js.Dynamic.literal(intent = intent)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[CreateIntent]
  }
}

