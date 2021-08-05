package typings.twineSugarcube

import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  trait ListDefinition[T]
    extends StObject
       with SettingDefinition {
    
    /**
      * The default value for the setting and default state of the control. It should have the same value as one of the members of
      * the list array. Leaving it undefined means to use the first array member as the default.
      */
    var default: js.UndefOr[T] = js.undefined
    
    /**
      * The array of items.
      */
    var list: Array[T]
  }
  object ListDefinition {
    
    inline def apply[T](label: String, list: Array[T]): ListDefinition[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListDefinition[T]]
    }
    
    extension [Self <: ListDefinition[?], T](x: Self & ListDefinition[T]) {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setList(value: Array[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeDefinition
    extends StObject
       with SettingDefinition {
    
    /**
      * The default value for the setting and default state of the control. Leaving it undefined means to use the value of max as the default.
      */
    var default: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum value.
      */
    var max: Double
    
    /**
      * The minimum value.
      */
    var min: Double
    
    /**
      * Limits the increments to which the value may be set. It must be evenly divisible into the full range — i.e., max - min.
      */
    var step: Double
  }
  object RangeDefinition {
    
    inline def apply(label: String, max: Double, min: Double, step: Double): RangeDefinition = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeDefinition]
    }
    
    extension [Self <: RangeDefinition](x: Self) {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait SettingDefinition extends StObject {
    
    /**
      * Description explaining the control in greater detail.
      */
    var desc: js.UndefOr[String] = js.undefined
    
    /**
      * Label to use for the control.
      */
    var label: String
    
    /**
      * The function to call when the control's state is changed.
      */
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The function to call during initialization.
      */
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SettingDefinition {
    
    inline def apply(label: String): SettingDefinition = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingDefinition]
    }
    
    extension [Self <: SettingDefinition](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    }
  }
  
  @js.native
  trait SettingsAPI extends StObject {
    
    /**
      * Adds a header to the Settings dialog.
      * @param name Name of the header.
      * @param desc Description explaining the header in greater detail.
      * @since 2.7.1
      * @example
      * // Setting up a basic header
      * Setting.addHeader("Content Settings");
      *
      * // Setting up a header w/ a description
      * Setting.addHeader("Content Settings", "Settings controlling what content is made available in the game.");
      */
    def addHeader(name: String): Unit = js.native
    def addHeader(name: String, desc: String): Unit = js.native
    
    /**
      * Adds the named property to the settings object and a list control for it to the Settings dialog.
      * @param name Name of the settings property to add, which the control will manage.
      * @param definition Definition of the control.
      * @since 2.0.0 Basic syntax.
      * @since 2.26.0 Added desc property to definition object.
      * @example
      * // Setting up a basic list control for the settings property 'difficulty'
      * Setting.addList("difficulty", {
      *     label   : "Choose a difficulty level.",
      *     list    : ["Easy", "Normal", "Hard", "INSANE"],
      *     default : "Normal"
      * });
      * @example
      * // Setting up a list control for the settings property 'theme' w/ callbacks
      * var settingThemeNames = ["(none)", "Bright Lights", "Charcoal", "Midnight", "Tinsel City"];
      * var settingThemeHandler = function () {
      *     // cache the jQuery-wrapped <html> element
      *     var $html = $("html");
      *     // remove any existing theme class
      *     $html.removeClass("theme-bright-lights theme-charcoal theme-midnight theme-tinsel-city");
      *     // switch on the theme name to add the requested theme class
      *     switch (settings.theme) {
      *     case "Bright Lights":
      *         $html.addClass("theme-bright-lights");
      *         break;
      *     case "Charcoal":
      *         $html.addClass("theme-charcoal");
      *         break;
      *     case "Midnight":
      *         $html.addClass("theme-midnight");
      *         break;
      *     case "Tinsel City":
      *         $html.addClass("theme-tinsel-city");
      *         break;
      *     }
      * };
      * Setting.addList("theme", {
      *     label    : "Choose a theme.",
      *     list     : settingThemeNames,
      *     onInit   : settingThemeHandler,
      *     onChange : settingThemeHandler
      * }); // default value not defined, so the first array member "(none)" is used
      */
    // tslint:disable-next-line:no-unnecessary-generics
    def addList[T](name: String, definition: ListDefinition[T]): Unit = js.native
    
    /**
      * Adds the named property to the settings object and a range control for it to the Settings dialog.
      * @param name Name of the settings property to add, which the control will manage.
      * @param definition Definition of the control.
      * @since 2.26.0
      * @example
      * // Setting up a volume control for the settings property 'masterVolume' w/ callback
      * Setting.addRange("masterVolume", {
      *     label    : "Master volume.",
      *     min      : 0,
      *     max      : 10,
      *     step     : 1,
      *     onChange : function () {
      *         SimpleAudio.volume(settings.masterVolume / 10);
      *     }
      * }); // default value not defined, so max value (10) is used
      */
    def addRange(name: String, definition: RangeDefinition): Unit = js.native
    
    /**
      * Adds the named property to the settings object and a toggle control for it to the Settings dialog.
      * @param name Name of the settings property to add, which the control will manage.
      * @param definition Definition of the control.
      * @since 2.26.0
      * @example
      * // Basic toggle setting
      * // Setting up a basic toggle control for the settings property 'mature'
      * Setting.addToggle("mature", {
      *     label : "Content for mature audiences?"
      * }); // default value not defined, so false is used
      * @example
      * // Toggle that adds/removes a CSS class
      * // Setting up a toggle control for the settings property 'widescreen' w/ callbacks
      * var settingWidescreenHandler = function () {
      *     if (settings.widescreen) { // is true
      *         $("html").addClass("widescreen");
      *     }
      *     else { // is false
      *         $("html").removeClass("widescreen");
      *     }
      * };
      *
      * Setting.addToggle("widescreen", {
      *     label    : "Allow the story to use the full width of your browser window?",
      *     default  : false,
      *     onInit   : settingWidescreenHandler,
      *     onChange : settingWidescreenHandler
      * });
      */
    def addToggle(name: String, definition: ToggleDefinition): Unit = js.native
    
    /**
      * Loads the settings from storage.
      *
      * **NOTE**: The API automatically calls this method at startup, so you should never need to call this method manually.
      * @since 2.0.0
      */
    def load(): Unit = js.native
    
    /**
      * Resets the setting with the given name to its default value. If no name is given, resets all settings.
      * @param name Name of the settings object property to reset.
      * @since 2.0.0
      * @example
      * // Reset the setting 'difficulty'
      * Setting.reset("difficulty");
      *
      * // Reset all settings
      * Setting.reset();
      */
    def reset(): Unit = js.native
    def reset(name: String): Unit = js.native
    
    /**
      * Saves the settings to storage.
      *
      * **NOTE**: The controls of the Settings dialog automatically call this method when settings are changed,
      * so you should normally never need to call this method manually. Only when manually modifying the values
      * of settings object properties, outside of the controls, would you need to call this method.
      * @since 2.0.0
      */
    def save(): Unit = js.native
  }
  
  trait ToggleDefinition
    extends StObject
       with SettingDefinition {
    
    /**
      * The default value for the setting and default state of the control. Leaving it undefined means to use false as the default.
      */
    var default: js.UndefOr[Boolean] = js.undefined
  }
  object ToggleDefinition {
    
    inline def apply(label: String): ToggleDefinition = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleDefinition]
    }
    
    extension [Self <: ToggleDefinition](x: Self) {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
}
