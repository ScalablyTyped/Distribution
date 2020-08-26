package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Identification
     with Metadata
     with GhostData {
  var count: js.UndefOr[Posts] = js.native
  var description: js.UndefOr[Nullable[String]] = js.native
  var feature_image: js.UndefOr[Nullable[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[TagVisibility] = js.native
}

object Tag {
  @scala.inline
  def apply(id: String, slug: String): Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setCount(value: Posts): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDescription(value: Nullable[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setFeature_image(value: Nullable[String]): Self = this.set("feature_image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature_image: Self = this.set("feature_image", js.undefined)
    @scala.inline
    def setFeature_imageNull: Self = this.set("feature_image", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVisibility(value: TagVisibility): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

