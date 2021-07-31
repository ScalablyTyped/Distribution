package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysShowLogo extends StObject {
  
  var alwaysShowLogo: Boolean
  
  var hideMainUI: Boolean
  
  var logoUrl: String
  
  var playButton: String
  
  var poster: String
  
  var preload: String
  
  var texts: Liveindicatortext
  
  var title: String
}
object AlwaysShowLogo {
  
  @scala.inline
  def apply(
    alwaysShowLogo: Boolean,
    hideMainUI: Boolean,
    logoUrl: String,
    playButton: String,
    poster: String,
    preload: String,
    texts: Liveindicatortext,
    title: String
  ): AlwaysShowLogo = {
    val __obj = js.Dynamic.literal(alwaysShowLogo = alwaysShowLogo.asInstanceOf[js.Any], hideMainUI = hideMainUI.asInstanceOf[js.Any], logoUrl = logoUrl.asInstanceOf[js.Any], playButton = playButton.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysShowLogo]
  }
  
  @scala.inline
  implicit class AlwaysShowLogoMutableBuilder[Self <: AlwaysShowLogo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysShowLogo(value: Boolean): Self = StObject.set(x, "alwaysShowLogo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMainUI(value: Boolean): Self = StObject.set(x, "hideMainUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayButton(value: String): Self = StObject.set(x, "playButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexts(value: Liveindicatortext): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
