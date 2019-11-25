package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array containing one object per section or subsection detected in the input document. Sections and subsections are not nested; instead, they are flattened out and can be placed back in order by using the `begin` and `end` values of the element and the `level` value of the section. */
trait SectionTitles extends js.Object {
  /** An array of `location` objects that lists the locations of detected section titles. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.undefined
  /** An integer indicating the level at which the section is located in the input document. For example, `1` represents a top-level section, `2` represents a subsection within the level `1` section, and so forth. */
  var level: js.UndefOr[Double] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The text of the section title, if identified. */
  var text: js.UndefOr[String] = js.undefined
}

object SectionTitles {
  @scala.inline
  def apply(
    element_locations: js.Array[ElementLocations] = null,
    level: Int | Double = null,
    location: Location = null,
    text: String = null
  ): SectionTitles = {
    val __obj = js.Dynamic.literal()
    if (element_locations != null) __obj.updateDynamic("element_locations")(element_locations.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionTitles]
  }
}

