package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Synonym. */
trait Synonym extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** The text of the synonym. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonym: String
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
}

object Synonym {
  @scala.inline
  def apply(synonym: String, created: String = null, updated: String = null): Synonym = {
    val __obj = js.Dynamic.literal(synonym = synonym.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
}

