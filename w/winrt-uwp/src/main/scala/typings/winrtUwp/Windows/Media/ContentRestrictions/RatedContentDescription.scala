package typings.winrtUwp.Windows.Media.ContentRestrictions

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
@js.native
trait RatedContentDescription extends js.Object {
  /** Specifies the type of a piece of content, defined by RatedContentCategory . */
  var category: RatedContentCategory = js.native
  /** The unique content ID of a piece of content, in the app's content catalog. */
  var id: String = js.native
  /** The thumbnail image associated with the content. */
  var image: IRandomAccessStreamReference = js.native
  /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
  var ratings: IVector[String] = js.native
  /** The display title of a piece of content. */
  var title: String = js.native
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
  @scala.inline
  implicit class RatedContentDescriptionOps[Self <: RatedContentDescription] (val x: Self) extends AnyVal {
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
    def setCategory(value: RatedContentCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: IRandomAccessStreamReference): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setRatings(value: IVector[String]): Self = this.set("ratings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

