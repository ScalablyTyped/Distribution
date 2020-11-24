package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostOrPage
  extends Identification
     with Excerpt
     with CodeInjection
     with Metadata
     with Facebook
     with Twitter
     with GhostData {
  
  // Authors - Only shown when using Include Param
  var authors: js.UndefOr[js.Array[Author]] = js.native
  
  var canonical_url: js.UndefOr[Nullable[String]] = js.native
  
  var comment_id: js.UndefOr[String] = js.native
  
  // Dates
  var created_at: js.UndefOr[String] = js.native
  
  // Custom Template for posts and pages
  var custom_template: js.UndefOr[Nullable[String]] = js.native
  
  // Image
  var feature_image: js.UndefOr[Nullable[String]] = js.native
  
  var featured: js.UndefOr[Boolean] = js.native
  
  var html: js.UndefOr[Nullable[String]] = js.native
  
  // Post or Page
  var page: js.UndefOr[Boolean] = js.native
  
  var plaintext: js.UndefOr[Nullable[String]] = js.native
  
  var primary_author: js.UndefOr[Nullable[Author]] = js.native
  
  var primary_tag: js.UndefOr[Nullable[Tag]] = js.native
  
  var published_at: js.UndefOr[Nullable[String]] = js.native
  
  // Reading time
  var reading_time: js.UndefOr[Double] = js.native
  
  // Tags - Only shown when using Include param
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  // Post or Page
  var title: js.UndefOr[String] = js.native
  
  var updated_at: js.UndefOr[Nullable[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  // Identification
  var uuid: js.UndefOr[String] = js.native
}
object PostOrPage {
  
  @scala.inline
  def apply(id: String, slug: String): PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage]
  }
  
  @scala.inline
  implicit class PostOrPageOps[Self <: PostOrPage] (val x: Self) extends AnyVal {
    
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
    def setAuthorsVarargs(value: Author*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setCanonical_url(value: Nullable[String]): Self = this.set("canonical_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonical_url: Self = this.set("canonical_url", js.undefined)
    
    @scala.inline
    def setCanonical_urlNull: Self = this.set("canonical_url", null)
    
    @scala.inline
    def setComment_id(value: String): Self = this.set("comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_id: Self = this.set("comment_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    
    @scala.inline
    def setCustom_template(value: Nullable[String]): Self = this.set("custom_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_template: Self = this.set("custom_template", js.undefined)
    
    @scala.inline
    def setCustom_templateNull: Self = this.set("custom_template", null)
    
    @scala.inline
    def setFeature_image(value: Nullable[String]): Self = this.set("feature_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature_image: Self = this.set("feature_image", js.undefined)
    
    @scala.inline
    def setFeature_imageNull: Self = this.set("feature_image", null)
    
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatured: Self = this.set("featured", js.undefined)
    
    @scala.inline
    def setHtml(value: Nullable[String]): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setHtmlNull: Self = this.set("html", null)
    
    @scala.inline
    def setPage(value: Boolean): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPlaintext(value: Nullable[String]): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
    
    @scala.inline
    def setPlaintextNull: Self = this.set("plaintext", null)
    
    @scala.inline
    def setPrimary_author(value: Nullable[Author]): Self = this.set("primary_author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary_author: Self = this.set("primary_author", js.undefined)
    
    @scala.inline
    def setPrimary_authorNull: Self = this.set("primary_author", null)
    
    @scala.inline
    def setPrimary_tag(value: Nullable[Tag]): Self = this.set("primary_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary_tag: Self = this.set("primary_tag", js.undefined)
    
    @scala.inline
    def setPrimary_tagNull: Self = this.set("primary_tag", null)
    
    @scala.inline
    def setPublished_at(value: Nullable[String]): Self = this.set("published_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublished_at: Self = this.set("published_at", js.undefined)
    
    @scala.inline
    def setPublished_atNull: Self = this.set("published_at", null)
    
    @scala.inline
    def setReading_time(value: Double): Self = this.set("reading_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReading_time: Self = this.set("reading_time", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Nullable[String]): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    
    @scala.inline
    def setUpdated_atNull: Self = this.set("updated_at", null)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
