package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.manifest.IconPath
import typings.thunderbirdWebextBrowser.browser.manifest.ThemeIcons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacesToolbar {
  
  trait ButtonProperties extends StObject {
    
    /**
      * Sets the background color of the badge. Can be specified as an array
      * of four integers in the range [0,255] that make up the RGBA color of
      * the badge. For example, opaque red is `[255, 0, 0, 255]`. Can also be
      * a string with an HTML color name (`red`) or a HEX color value
      * (`#FF0000` or `#F00`). Reset when set to an empty string.
      */
    var badgeBackgroundColor: js.UndefOr[String | ColorArray] = js.undefined
    
    /**
      * Sets the badge text for the spaces toolbar button. The badge is
      * displayed on top of the icon. Any number of characters can be set, but
      * only about four can fit in the space. Removed when set to an empty
      * string.
      */
    var badgeText: js.UndefOr[String] = js.undefined
    
    /**
      * The paths to one or more icons for the button in the spaces toolbar.
      * Defaults to the extension icon, if set to an empty string.
      */
    var defaultIcons: js.UndefOr[String | IconPath] = js.undefined
    
    /**
      * Specifies dark and light icons for the spaces toolbar button to be
      * used with themes: The `light` icons will be used on dark backgrounds
      * and vice versa. At least the set for _16px_ icons should be specified.
      * The set for _32px_ icons will be used on screens with a very high
      * pixel density, if specified.
      */
    var themeIcons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
    
    /**
      * The title for the spaces toolbar button, used in the tooltip of the
      * button and as the displayed name in the overflow menu. Defaults to the
      * name of the extension, if set to an empty string.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The page url, loaded into a tab when the button is clicked. Supported
      * are `https://` and `http://` links, as well as links to WebExtension
      * pages.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ButtonProperties {
    
    inline def apply(): ButtonProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonProperties] (val x: Self) extends AnyVal {
      
      inline def setBadgeBackgroundColor(value: String | ColorArray): Self = StObject.set(x, "badgeBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBadgeBackgroundColorUndefined: Self = StObject.set(x, "badgeBackgroundColor", js.undefined)
      
      inline def setBadgeText(value: String): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
      
      inline def setBadgeTextUndefined: Self = StObject.set(x, "badgeText", js.undefined)
      
      inline def setDefaultIcons(value: String | IconPath): Self = StObject.set(x, "defaultIcons", value.asInstanceOf[js.Any])
      
      inline def setDefaultIconsUndefined: Self = StObject.set(x, "defaultIcons", js.undefined)
      
      inline def setThemeIcons(value: js.Array[ThemeIcons]): Self = StObject.set(x, "themeIcons", value.asInstanceOf[js.Any])
      
      inline def setThemeIconsUndefined: Self = StObject.set(x, "themeIcons", js.undefined)
      
      inline def setThemeIconsVarargs(value: ThemeIcons*): Self = StObject.set(x, "themeIcons", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type ColorArray = js.Tuple4[Double, Double, Double, Double]
}
