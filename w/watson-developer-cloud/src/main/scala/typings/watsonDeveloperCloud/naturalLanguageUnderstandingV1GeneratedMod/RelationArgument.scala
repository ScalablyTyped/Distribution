package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RelationArgument. */
trait RelationArgument extends js.Object {
  /** An array of extracted entities. */
  var entities: js.UndefOr[js.Array[RelationEntity]] = js.undefined
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  /** Text that corresponds to the argument. */
  var text: js.UndefOr[String] = js.undefined
}

object RelationArgument {
  @scala.inline
  def apply(entities: js.Array[RelationEntity] = null, location: js.Array[Double] = null, text: String = null): RelationArgument = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationArgument]
  }
}

