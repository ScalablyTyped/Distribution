package typings.winrtUwp.Windows.Media.ContentRestrictions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information used to filter an app's content catalog. */
@js.native
trait ContentRestrictionsBrowsePolicy extends js.Object {
  /** Gets the region of the user's content restrictions. */
  var geographicRegion: String = js.native
  /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
  var maxBrowsableAgeRating: Double = js.native
  /** Gets the maximum allowed rating level for content consumption. */
  var preferredAgeRating: Double = js.native
}

object ContentRestrictionsBrowsePolicy {
  @scala.inline
  def apply(geographicRegion: String, maxBrowsableAgeRating: Double, preferredAgeRating: Double): ContentRestrictionsBrowsePolicy = {
    val __obj = js.Dynamic.literal(geographicRegion = geographicRegion.asInstanceOf[js.Any], maxBrowsableAgeRating = maxBrowsableAgeRating.asInstanceOf[js.Any], preferredAgeRating = preferredAgeRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRestrictionsBrowsePolicy]
  }
  @scala.inline
  implicit class ContentRestrictionsBrowsePolicyOps[Self <: ContentRestrictionsBrowsePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeographicRegion(value: String): Self = this.set("geographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxBrowsableAgeRating(value: Double): Self = this.set("maxBrowsableAgeRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredAgeRating(value: Double): Self = this.set("preferredAgeRating", value.asInstanceOf[js.Any])
  }
  
}

