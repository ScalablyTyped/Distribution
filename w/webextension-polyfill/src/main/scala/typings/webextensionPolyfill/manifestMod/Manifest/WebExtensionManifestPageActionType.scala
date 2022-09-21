package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestPageActionType extends StObject {
  
  /**
    * Optional.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * Optional.
    */
  var default_popup: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var default_title: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.
    */
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.undefined
  
  /**
    * Optional.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    */
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
}
object WebExtensionManifestPageActionType {
  
  inline def apply(): WebExtensionManifestPageActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestPageActionType]
  }
  
  extension [Self <: WebExtensionManifestPageActionType](x: Self) {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setHide_matches(value: js.Array[MatchPatternRestricted]): Self = StObject.set(x, "hide_matches", value.asInstanceOf[js.Any])
    
    inline def setHide_matchesUndefined: Self = StObject.set(x, "hide_matches", js.undefined)
    
    inline def setHide_matchesVarargs(value: MatchPatternRestricted*): Self = StObject.set(x, "hide_matches", js.Array(value*))
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setShow_matches(value: js.Array[MatchPattern]): Self = StObject.set(x, "show_matches", value.asInstanceOf[js.Any])
    
    inline def setShow_matchesUndefined: Self = StObject.set(x, "show_matches", js.undefined)
    
    inline def setShow_matchesVarargs(value: MatchPattern*): Self = StObject.set(x, "show_matches", js.Array(value*))
  }
}
