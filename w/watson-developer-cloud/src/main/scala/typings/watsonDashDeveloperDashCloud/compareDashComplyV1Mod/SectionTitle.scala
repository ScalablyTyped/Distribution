package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The table's section title, if identified. */
trait SectionTitle extends js.Object {
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The text of the section title, if identified. */
  var text: js.UndefOr[String] = js.undefined
}

object SectionTitle {
  @scala.inline
  def apply(location: Location = null, text: String = null): SectionTitle = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionTitle]
  }
}

