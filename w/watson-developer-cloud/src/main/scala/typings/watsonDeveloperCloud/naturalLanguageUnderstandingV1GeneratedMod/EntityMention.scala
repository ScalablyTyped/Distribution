package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EntityMention. */
trait EntityMention extends js.Object {
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  /** Entity mention text. */
  var text: js.UndefOr[String] = js.undefined
}

object EntityMention {
  @scala.inline
  def apply(location: js.Array[Double] = null, text: String = null): EntityMention = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMention]
  }
}

