package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings
  extends Metadata
     with CodeInjection
     with Facebook
     with Twitter
     with GhostData {
  
  var cover_image: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var facebook: js.UndefOr[String] = js.native
  
  var ghost_foot: js.UndefOr[Nullable[String]] = js.native
  
  var ghost_head: js.UndefOr[Nullable[String]] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var logo: js.UndefOr[String] = js.native
  
  var navigation: js.UndefOr[js.Array[Label]] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var twitter: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setCover_image(value: String): Self = this.set("cover_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover_image: Self = this.set("cover_image", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFacebook(value: String): Self = this.set("facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    
    @scala.inline
    def setGhost_foot(value: Nullable[String]): Self = this.set("ghost_foot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost_foot: Self = this.set("ghost_foot", js.undefined)
    
    @scala.inline
    def setGhost_footNull: Self = this.set("ghost_foot", null)
    
    @scala.inline
    def setGhost_head(value: Nullable[String]): Self = this.set("ghost_head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost_head: Self = this.set("ghost_head", js.undefined)
    
    @scala.inline
    def setGhost_headNull: Self = this.set("ghost_head", null)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setNavigationVarargs(value: Label*): Self = this.set("navigation", js.Array(value :_*))
    
    @scala.inline
    def setNavigation(value: js.Array[Label]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
