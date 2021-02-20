package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostOrPage
  extends SocialMedia
     with Identification
     with Excerpt
     with CodeInjection
     with Metadata
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
  implicit class PostOrPageMutableBuilder[Self <: PostOrPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: Author*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setCanonical_url(value: Nullable[String]): Self = StObject.set(x, "canonical_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonical_urlNull: Self = StObject.set(x, "canonical_url", null)
    
    @scala.inline
    def setCanonical_urlUndefined: Self = StObject.set(x, "canonical_url", js.undefined)
    
    @scala.inline
    def setComment_id(value: String): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_idUndefined: Self = StObject.set(x, "comment_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCustom_template(value: Nullable[String]): Self = StObject.set(x, "custom_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_templateNull: Self = StObject.set(x, "custom_template", null)
    
    @scala.inline
    def setCustom_templateUndefined: Self = StObject.set(x, "custom_template", js.undefined)
    
    @scala.inline
    def setFeature_image(value: Nullable[String]): Self = StObject.set(x, "feature_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature_imageNull: Self = StObject.set(x, "feature_image", null)
    
    @scala.inline
    def setFeature_imageUndefined: Self = StObject.set(x, "feature_image", js.undefined)
    
    @scala.inline
    def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
    
    @scala.inline
    def setHtml(value: Nullable[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNull: Self = StObject.set(x, "html", null)
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPlaintext(value: Nullable[String]): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextNull: Self = StObject.set(x, "plaintext", null)
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
    
    @scala.inline
    def setPrimary_author(value: Nullable[Author]): Self = StObject.set(x, "primary_author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_authorNull: Self = StObject.set(x, "primary_author", null)
    
    @scala.inline
    def setPrimary_authorUndefined: Self = StObject.set(x, "primary_author", js.undefined)
    
    @scala.inline
    def setPrimary_tag(value: Nullable[Tag]): Self = StObject.set(x, "primary_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_tagNull: Self = StObject.set(x, "primary_tag", null)
    
    @scala.inline
    def setPrimary_tagUndefined: Self = StObject.set(x, "primary_tag", js.undefined)
    
    @scala.inline
    def setPublished_at(value: Nullable[String]): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    @scala.inline
    def setPublished_atUndefined: Self = StObject.set(x, "published_at", js.undefined)
    
    @scala.inline
    def setReading_time(value: Double): Self = StObject.set(x, "reading_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReading_timeUndefined: Self = StObject.set(x, "reading_time", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Nullable[String]): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    @scala.inline
    def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
