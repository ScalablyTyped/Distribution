package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Posts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Author
  extends Identification
     with Metadata
     with GhostData {
  
  var bio: js.UndefOr[Nullable[String]] = js.native
  
  var count: js.UndefOr[Posts] = js.native
  
  var cover_image: js.UndefOr[Nullable[String]] = js.native
  
  var facebook: js.UndefOr[Nullable[String]] = js.native
  
  var location: js.UndefOr[Nullable[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var profile_image: js.UndefOr[Nullable[String]] = js.native
  
  var twitter: js.UndefOr[Nullable[String]] = js.native
  
  var url: js.UndefOr[Nullable[String]] = js.native
  
  var website: js.UndefOr[Nullable[String]] = js.native
}
object Author {
  
  @scala.inline
  def apply(id: String, slug: String): Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    
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
    def setBio(value: Nullable[String]): Self = this.set("bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBio: Self = this.set("bio", js.undefined)
    
    @scala.inline
    def setBioNull: Self = this.set("bio", null)
    
    @scala.inline
    def setCount(value: Posts): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCover_image(value: Nullable[String]): Self = this.set("cover_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover_image: Self = this.set("cover_image", js.undefined)
    
    @scala.inline
    def setCover_imageNull: Self = this.set("cover_image", null)
    
    @scala.inline
    def setFacebook(value: Nullable[String]): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    
    @scala.inline
    def setFacebookNull: Self = this.set("facebook", null)
    
    @scala.inline
    def setLocation(value: Nullable[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfile_image(value: Nullable[String]): Self = this.set("profile_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_image: Self = this.set("profile_image", js.undefined)
    
    @scala.inline
    def setProfile_imageNull: Self = this.set("profile_image", null)
    
    @scala.inline
    def setTwitter(value: Nullable[String]): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
    
    @scala.inline
    def setTwitterNull: Self = this.set("twitter", null)
    
    @scala.inline
    def setUrl(value: Nullable[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
    
    @scala.inline
    def setWebsite(value: Nullable[String]): Self = this.set("website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
    
    @scala.inline
    def setWebsiteNull: Self = this.set("website", null)
  }
}
