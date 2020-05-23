package typings.winrtUwp.Windows.Media.ContentRestrictions

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
trait RatedContentDescription extends js.Object {
  /** Specifies the type of a piece of content, defined by RatedContentCategory . */
  var category: RatedContentCategory
  /** The unique content ID of a piece of content, in the app's content catalog. */
  var id: String
  /** The thumbnail image associated with the content. */
  var image: IRandomAccessStreamReference
  /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
  var ratings: IVector[String]
  /** The display title of a piece of content. */
  var title: String
}

object RatedContentDescription {
  @scala.inline
  def apply(
    category: RatedContentCategory,
    id: String,
    image: IRandomAccessStreamReference,
    ratings: IVector[String],
    title: String
  ): RatedContentDescription = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatedContentDescription]
  }
}

