package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings
  extends StObject
     with Metadata
     with CodeInjection
     with SocialMedia
     with GhostData {
  
  var cover_image: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var facebook: js.UndefOr[String] = js.undefined
  
  var ghost_foot: js.UndefOr[Nullable[String]] = js.undefined
  
  var ghost_head: js.UndefOr[Nullable[String]] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var logo: js.UndefOr[String] = js.undefined
  
  var navigation: js.UndefOr[js.Array[Label]] = js.undefined
  
  var secondary_navigation: js.UndefOr[js.Array[Label]] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var twitter: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setCover_image(value: String): Self = StObject.set(x, "cover_image", value.asInstanceOf[js.Any])
    
    inline def setCover_imageUndefined: Self = StObject.set(x, "cover_image", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setGhost_foot(value: Nullable[String]): Self = StObject.set(x, "ghost_foot", value.asInstanceOf[js.Any])
    
    inline def setGhost_footNull: Self = StObject.set(x, "ghost_foot", null)
    
    inline def setGhost_footUndefined: Self = StObject.set(x, "ghost_foot", js.undefined)
    
    inline def setGhost_head(value: Nullable[String]): Self = StObject.set(x, "ghost_head", value.asInstanceOf[js.Any])
    
    inline def setGhost_headNull: Self = StObject.set(x, "ghost_head", null)
    
    inline def setGhost_headUndefined: Self = StObject.set(x, "ghost_head", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setNavigation(value: js.Array[Label]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNavigationVarargs(value: Label*): Self = StObject.set(x, "navigation", js.Array(value*))
    
    inline def setSecondary_navigation(value: js.Array[Label]): Self = StObject.set(x, "secondary_navigation", value.asInstanceOf[js.Any])
    
    inline def setSecondary_navigationUndefined: Self = StObject.set(x, "secondary_navigation", js.undefined)
    
    inline def setSecondary_navigationVarargs(value: Label*): Self = StObject.set(x, "secondary_navigation", js.Array(value*))
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
