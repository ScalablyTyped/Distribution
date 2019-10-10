package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag
  extends Identification
     with Metadata
     with GhostData {
  var count: js.UndefOr[Anon_Posts] = js.undefined
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
    count: Anon_Posts = null,
    description: Nullable[String] = null,
    feature_image: Nullable[String] = null,
    meta_description: Nullable[String] = null,
    meta_title: Nullable[String] = null,
    name: String = null,
    url: String = null,
    visibility: TagVisibility = null
  ): Tag = {
    val __obj = js.Dynamic.literal(id = id, slug = slug)
    if (count != null) __obj.updateDynamic("count")(count)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (feature_image != null) __obj.updateDynamic("feature_image")(feature_image.asInstanceOf[js.Any])
    if (meta_description != null) __obj.updateDynamic("meta_description")(meta_description.asInstanceOf[js.Any])
    if (meta_title != null) __obj.updateDynamic("meta_title")(meta_title.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Tag]
  }
}

