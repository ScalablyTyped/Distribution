package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionManifest extends StObject {
  
  /**
    * Enable browser styles. See the MDN documentation on browser styles for
    * more information.
    */
  var browser_style: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the location the action button will appear. The default
    * location is `maintoolbar`.
    */
  var default_area: js.UndefOr[ActionManifestDefaultArea] = js.undefined
  
  /** The paths to one or more icons for the action button. */
  var default_icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * The label of the action button, defaults to its title. Can be set to
    * an empty string to not display any label. If the containing toolbar is
    * configured to display text only, the title will be used as fallback.
    */
  var default_label: js.UndefOr[String] = js.undefined
  
  /**
    * The html document to be opened as a popup when the user clicks on the
    * action button.
    */
  var default_popup: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the action button. This shows up in the tooltip and the
    * label. Defaults to the add-on name.
    */
  var default_title: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the windows, the action button should appear in. Defaults to
    * showing it only in the `normal` Thunderbird window, but can also be
    * shown in the `messageDisplay` window.
    */
  var default_windows: js.UndefOr[js.Array[ActionManifestDefaultWindows]] = js.undefined
  
  /**
    * Specifies dark and light icons to be used with themes. The `light`
    * icon is used on dark backgrounds and vice versa. **Note:** The default
    * theme uses the `default_icon` for light backgrounds (if specified).
    */
  var theme_icons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}
object ActionManifest {
  
  inline def apply(): ActionManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionManifest] (val x: Self) extends AnyVal {
    
    inline def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    inline def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    inline def setDefault_area(value: ActionManifestDefaultArea): Self = StObject.set(x, "default_area", value.asInstanceOf[js.Any])
    
    inline def setDefault_areaUndefined: Self = StObject.set(x, "default_area", js.undefined)
    
    inline def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    inline def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    inline def setDefault_label(value: String): Self = StObject.set(x, "default_label", value.asInstanceOf[js.Any])
    
    inline def setDefault_labelUndefined: Self = StObject.set(x, "default_label", js.undefined)
    
    inline def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    inline def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    inline def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    inline def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    inline def setDefault_windows(value: js.Array[ActionManifestDefaultWindows]): Self = StObject.set(x, "default_windows", value.asInstanceOf[js.Any])
    
    inline def setDefault_windowsUndefined: Self = StObject.set(x, "default_windows", js.undefined)
    
    inline def setDefault_windowsVarargs(value: ActionManifestDefaultWindows*): Self = StObject.set(x, "default_windows", js.Array(value*))
    
    inline def setTheme_icons(value: js.Array[ThemeIcons]): Self = StObject.set(x, "theme_icons", value.asInstanceOf[js.Any])
    
    inline def setTheme_iconsUndefined: Self = StObject.set(x, "theme_icons", js.undefined)
    
    inline def setTheme_iconsVarargs(value: ThemeIcons*): Self = StObject.set(x, "theme_icons", js.Array(value*))
  }
}
