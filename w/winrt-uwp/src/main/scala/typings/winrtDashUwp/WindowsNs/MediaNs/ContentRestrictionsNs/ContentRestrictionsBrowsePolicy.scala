package typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information used to filter an app's content catalog. */
@JSGlobal("Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy")
@js.native
abstract class ContentRestrictionsBrowsePolicy () extends js.Object {
  /** Gets the region of the user's content restrictions. */
  var geographicRegion: String = js.native
  /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
  var maxBrowsableAgeRating: Double = js.native
  /** Gets the maximum allowed rating level for content consumption. */
  var preferredAgeRating: Double = js.native
}

