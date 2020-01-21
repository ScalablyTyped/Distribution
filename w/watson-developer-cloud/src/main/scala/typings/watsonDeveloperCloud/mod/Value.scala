package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Value. */
trait Value extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.undefined
  /** Any metadata related to the entity value. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.undefined
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var value: String
  /** Specifies the type of entity value. */
  var value_type: String
}

object Value {
  @scala.inline
  def apply(
    value: String,
    value_type: String,
    created: String = null,
    metadata: js.Object = null,
    patterns: js.Array[String] = null,
    synonyms: js.Array[String] = null,
    updated: String = null
  ): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], value_type = value_type.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

