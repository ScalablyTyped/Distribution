package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A text string that appears within the entity text field. */
trait QueryEntitiesEntity extends js.Object {
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryEntitiesEntity {
  @scala.inline
  def apply(text: String = null, `type`: String = null): QueryEntitiesEntity = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEntitiesEntity]
  }
}

