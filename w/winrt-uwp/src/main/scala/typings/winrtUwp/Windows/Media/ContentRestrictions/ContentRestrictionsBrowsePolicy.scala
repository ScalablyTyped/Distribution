package typings.winrtUwp.Windows.Media.ContentRestrictions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information used to filter an app's content catalog. */
trait ContentRestrictionsBrowsePolicy extends js.Object {
  /** Gets the region of the user's content restrictions. */
  var geographicRegion: String
  /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
  var maxBrowsableAgeRating: Double
  /** Gets the maximum allowed rating level for content consumption. */
  var preferredAgeRating: Double
}

object ContentRestrictionsBrowsePolicy {
  @scala.inline
  def apply(geographicRegion: String, maxBrowsableAgeRating: Double, preferredAgeRating: Double): ContentRestrictionsBrowsePolicy = {
    val __obj = js.Dynamic.literal(geographicRegion = geographicRegion.asInstanceOf[js.Any], maxBrowsableAgeRating = maxBrowsableAgeRating.asInstanceOf[js.Any], preferredAgeRating = preferredAgeRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRestrictionsBrowsePolicy]
  }
}

