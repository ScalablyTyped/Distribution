package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A term from the request that was identified as an entity. */
trait RuntimeEntity
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** A decimal percentage that represents Watson's confidence in the entity. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** An entity detected in the input. */
  var entity: String
  /** The recognized capture groups for the entity, as defined by the entity pattern. */
  var groups: js.UndefOr[js.Array[CaptureGroup]] = js.undefined
  /** An array of zero-based character offsets that indicate where the detected entity values begin and end in the input text. */
  var location: js.Array[Double]
  /** Any metadata for the entity. */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /** The term in the input text that was recognized as an entity value. */
  var value: String
}

object RuntimeEntity {
  @scala.inline
  def apply(
    entity: String,
    location: js.Array[Double],
    value: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    confidence: js.UndefOr[Double] = js.undefined,
    groups: js.Array[CaptureGroup] = null,
    metadata: js.Object = null
  ): RuntimeEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEntity]
  }
}

