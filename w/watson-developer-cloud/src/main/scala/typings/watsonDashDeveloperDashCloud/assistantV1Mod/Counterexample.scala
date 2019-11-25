package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Counterexample. */
trait Counterexample extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The text of a user input marked as irrelevant input. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters - It cannot consist of only whitespace characters - It must be no longer than 1024 characters. */
  var text: String
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}

object Counterexample {
  @scala.inline
  def apply(text: String, created: String = null, updated: String = null): Counterexample = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counterexample]
  }
}

