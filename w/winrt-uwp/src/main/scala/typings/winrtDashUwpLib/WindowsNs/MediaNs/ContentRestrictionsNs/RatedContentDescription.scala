package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
@JSGlobal("Windows.Media.ContentRestrictions.RatedContentDescription")
@js.native
class RatedContentDescription protected () extends js.Object {
  /**
    * Initializes a new instance of the RatedContentDescription class.
    * @param id The ID of the content, as specified by the app developer.
    * @param title The title of the content.
    * @param category Specifies the type of a piece of content, defined by RatedContentCategory .
    */
  def this(id: java.lang.String, title: java.lang.String, category: RatedContentCategory) = this()
  /** Specifies the type of a piece of content, defined by RatedContentCategory . */
  var category: RatedContentCategory = js.native
  /** The unique content ID of a piece of content, in the app's content catalog. */
  var id: java.lang.String = js.native
  /** The thumbnail image associated with the content. */
  var image: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
  var ratings: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** The display title of a piece of content. */
  var title: java.lang.String = js.native
}

