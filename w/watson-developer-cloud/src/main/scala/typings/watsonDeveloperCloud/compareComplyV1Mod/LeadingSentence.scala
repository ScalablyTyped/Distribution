package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The leading sentences in a section or subsection of the input document. */
trait LeadingSentence extends js.Object {
  /** An array of `location` objects that lists the locations of detected leading sentences. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The text of the leading sentence. */
  var text: js.UndefOr[String] = js.undefined
}

object LeadingSentence {
  @scala.inline
  def apply(
    element_locations: js.Array[ElementLocations] = null,
    location: Location = null,
    text: String = null
  ): LeadingSentence = {
    val __obj = js.Dynamic.literal()
    if (element_locations != null) __obj.updateDynamic("element_locations")(element_locations.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadingSentence]
  }
}

