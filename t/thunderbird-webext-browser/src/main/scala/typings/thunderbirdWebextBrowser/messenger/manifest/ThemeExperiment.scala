package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeExperiment extends StObject {
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map new
    * theme color keys to internal Thunderbird CSS color variables. The
    * example shown below maps the theme color key `popup_affordance` to the
    * CSS color variable --arrowpanel-dimmed. The new color key is usable as
    * a color reference in {@link theme.ThemeType}.
    * [theme_experiment_color.json](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/theme/theme_experiment_color.json)
    */
  var colors: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map new
    * theme image keys to internal Thunderbird CSS image variables. The new
    * image key is usable as an image reference in {@link theme.ThemeType}.
    * Example:
    * [theme_experiment_image.json](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/theme/theme_experiment_image.json)
    */
  var images: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A _dictionary object_ with one or more _key-value_ pairs to map new
    * theme property keys to internal Thunderbird CSS property variables.
    * The new property key is usable as a property reference in {@link theme.ThemeType}.
    *  Example:
    * [theme_experiment_property.json](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/theme/theme_experiment_property.json)
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * URL to a stylesheet introducing additional CSS variables, extending
    * the theme-able areas of Thunderbird.
    *
    * The `theme_experiment` add-on in our
    * [example repository](https://github.com/thundernest/sample-extensions/tree/master/theme_experiment)
    * is using the stylesheet shown below, to add the
    * `--chat-button-color`
    * CSS color variable:
    * [theme_experiment_style.css](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/theme/theme_experiment_style.css).
    *
    * The following _manifest.json_ file maps the `--chat-button-color`
    * CSS
    * color variable to the theme color key `exp_chat_button` and uses it
    * to
    * set a color for the chat button:
    * [theme_experiment_manifest.json](https://raw.githubusercontent.com/thundernest/webext-docs/latest-mv2/includes/theme/theme_experiment_manifest.json)
    */
  var stylesheet: js.UndefOr[ExtensionURL] = js.undefined
}
object ThemeExperiment {
  
  inline def apply(): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeExperiment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeExperiment] (val x: Self) extends AnyVal {
    
    inline def setColors(value: StringDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStylesheet(value: ExtensionURL): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
  }
}
