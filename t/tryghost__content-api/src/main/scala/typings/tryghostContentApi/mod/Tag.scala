package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag
  extends Identification
     with Metadata
     with GhostData {
  var count: js.UndefOr[Posts] = js.undefined
  var description: js.UndefOr[Nullable[String]] = js.undefined
  var feature_image: js.UndefOr[Nullable[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[TagVisibility] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    id: String,
    slug: String,
    count: Posts = null,
    description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    feature_image: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_description: js.UndefOr[Null | Nullable[String]] = js.undefined,
    meta_title: js.UndefOr[Null | Nullable[String]] = js.undefined,
    name: String = null,
    url: String = null,
    visibility: TagVisibility = null
  ): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(feature_image)) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_description)) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (!js.isUndefined(meta_title)) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

