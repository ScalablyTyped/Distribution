package typings.thunderbirdWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestMessageDisplayAction extends StObject {
  
  /**
    * Enable browser styles. See the MDN documentation on browser styles for
    * more information.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /** Currently unused. */
  var default_area: js.UndefOr[String] = js.undefined
  
  /** The paths to one or more icons for the messageDisplayAction button. */
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * The label of the messageDisplayAction button, defaults to its title.
    * Can be set to an empty string to not display any label. If the
    * containing toolbar is configured to display text only, the title will
    * be used as fallback.
    */
  var default_label: js.UndefOr[String] = js.undefined
  
  /**
    * The html document to be opened as a popup when the user clicks on the
    * messageDisplayAction button.
    */
  var default_popup: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the messageDisplayAction button. This shows up in the
    * tooltip and the label. Defaults to the add-on name.
    */
  var default_title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies dark and light icons to be used with themes. The `light`
    * icon is used on dark backgrounds and vice versa. **Note:** The default
    * theme uses the `default_icon` for light backgrounds (if specified).
    */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}
object WebExtensionManifestMessageDisplayAction {
  
  inline def apply(): WebExtensionManifestMessageDisplayAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestMessageDisplayAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebExtensionManifestMessageDisplayAction] (val x: Self) extends AnyVal {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_area(value: String): Self = StObject.set(x, "default_area", value.asInstanceOf[js.Any])
    
    inline def setDefault_areaUndefined: Self = StObject.set(x, "default_area", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_label(value: String): Self = StObject.set(x, "default_label", value.asInstanceOf[js.Any])
    
    inline def setDefault_labelUndefined: Self = StObject.set(x, "default_label", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setTheme_icons(value: js.Array[ThemeIcons]): Self = StObject.set(x, "theme_icons", value.asInstanceOf[js.Any])
    
    inline def setTheme_iconsUndefined: Self = StObject.set(x, "theme_icons", js.undefined)
    
    inline def setTheme_iconsVarargs(value: ThemeIcons*): Self = StObject.set(x, "theme_icons", js.Array(value*))
  }
}
