package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** List of document attributes. */
trait Attribute extends js.Object {
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The text associated with the attribute. */
  var text: js.UndefOr[String] = js.undefined
  /** The type of attribute. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(location: Location = null, text: String = null, `type`: String = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Attribute]
  }
}

