package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesTypesMod {
  
  object Types {
    
    /**
      * One of<ul><li><var>not_controllable</var>: cannot be controlled by any extension</li><li><var>
      * controlled_by_other_extensions</var>: controlled by extensions with higher precedence</li><li><var>
      * controllable_by_this_extension</var>: can be controlled by this extension</li><li><var>controlled_by_this_extension</var>
      * : controlled by this extension</li></ul>
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.not_controllable
      - typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_other_extensions
      - typings.webextensionPolyfill.webextensionPolyfillStrings.controllable_by_this_extension
      - typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_this_extension
    */
    trait LevelOfControl extends StObject
    object LevelOfControl {
      
      inline def controllable_by_this_extension: typings.webextensionPolyfill.webextensionPolyfillStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.controllable_by_this_extension]
      
      inline def controlled_by_other_extensions: typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_other_extensions]
      
      inline def controlled_by_this_extension: typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.controlled_by_this_extension]
      
      inline def not_controllable: typings.webextensionPolyfill.webextensionPolyfillStrings.not_controllable = "not_controllable".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.not_controllable]
    }
    
    trait Setting extends StObject {
      
      /**
        * Clears the setting, restoring any default value.
        *
        * @param details Which setting to clear.
        * @returns Called at the completion of the clear operation.
        */
      def clear(details: SettingClearDetailsType): js.Promise[Unit]
      
      /**
        * Gets the value of a setting.
        *
        * @param details Which setting to consider.
        */
      def get(details: SettingGetDetailsType): js.Promise[SettingGetCallbackDetailsType]
      
      /**
        * Fired after the setting changes.
        *
        * @param details
        */
      var onChange: Event[js.Function1[/* details */ SettingOnChangeDetailsType, Unit]]
      
      /**
        * Sets the value of a setting.
        *
        * @param details Which setting to change.
        * @returns Called at the completion of the set operation.
        */
      def set(details: SettingSetDetailsType): js.Promise[Unit]
    }
    object Setting {
      
      inline def apply(
        clear: SettingClearDetailsType => js.Promise[Unit],
        get: SettingGetDetailsType => js.Promise[SettingGetCallbackDetailsType],
        onChange: Event[js.Function1[/* details */ SettingOnChangeDetailsType, Unit]],
        set: SettingSetDetailsType => js.Promise[Unit]
      ): Setting = {
        val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[Setting]
      }
      
      extension [Self <: Setting](x: Self) {
        
        inline def setClear(value: SettingClearDetailsType => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
        
        inline def setGet(value: SettingGetDetailsType => js.Promise[SettingGetCallbackDetailsType]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setOnChange(value: Event[js.Function1[/* details */ SettingOnChangeDetailsType, Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
        
        inline def setSet(value: SettingSetDetailsType => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Which setting to clear.
      */
    trait SettingClearDetailsType extends StObject {
      
      /**
        * Where to clear the setting (default: regular).
        * Optional.
        */
      var scope: js.UndefOr[SettingScope] = js.undefined
    }
    object SettingClearDetailsType {
      
      inline def apply(): SettingClearDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SettingClearDetailsType]
      }
      
      extension [Self <: SettingClearDetailsType](x: Self) {
        
        inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    /**
      * Details of the currently effective value.
      */
    trait SettingGetCallbackDetailsType extends StObject {
      
      /**
        * Whether the effective value is specific to the incognito session.<br/>This property will <em>only</em>
        * be present if the <var>incognito</var> property in the <var>details</var> parameter of <code>get()</code> was true.
        * Optional.
        */
      var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The level of control of the setting.
        */
      var levelOfControl: LevelOfControl
      
      /**
        * The value of the setting.
        */
      var value: Any
    }
    object SettingGetCallbackDetailsType {
      
      inline def apply(levelOfControl: LevelOfControl, value: Any): SettingGetCallbackDetailsType = {
        val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SettingGetCallbackDetailsType]
      }
      
      extension [Self <: SettingGetCallbackDetailsType](x: Self) {
        
        inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
        
        inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
        
        inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Which setting to consider.
      */
    trait SettingGetDetailsType extends StObject {
      
      /**
        * Whether to return the value that applies to the incognito session (default false).
        * Optional.
        */
      var incognito: js.UndefOr[Boolean] = js.undefined
    }
    object SettingGetDetailsType {
      
      inline def apply(): SettingGetDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SettingGetDetailsType]
      }
      
      extension [Self <: SettingGetDetailsType](x: Self) {
        
        inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
        
        inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      }
    }
    
    trait SettingOnChangeDetailsType extends StObject {
      
      /**
        * Whether the value that has changed is specific to the incognito session.<br/>This property will <em>only</em>
        * be present if the user has enabled the extension in incognito mode.
        * Optional.
        */
      var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The level of control of the setting.
        */
      var levelOfControl: LevelOfControl
      
      /**
        * The value of the setting after the change.
        */
      var value: Any
    }
    object SettingOnChangeDetailsType {
      
      inline def apply(levelOfControl: LevelOfControl, value: Any): SettingOnChangeDetailsType = {
        val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SettingOnChangeDetailsType]
      }
      
      extension [Self <: SettingOnChangeDetailsType](x: Self) {
        
        inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
        
        inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
        
        inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The scope of the Setting. One of<ul><li><var>regular</var>: setting for the regular profile (which is inherited by the
      * incognito profile if not overridden elsewhere),</li><li><var>regular_only</var>: setting for the regular profile only
      * (not inherited by the incognito profile),</li><li><var>incognito_persistent</var>: setting for the incognito profile
      * that survives browser restarts (overrides regular preferences),</li><li><var>incognito_session_only</var>
      * : setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito
      * session ends (overrides regular and incognito_persistent preferences).</li></ul> Only <var>regular</var>
      * is supported by Firefox at this time.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.regular
      - typings.webextensionPolyfill.webextensionPolyfillStrings.regular_only
      - typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_persistent
      - typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_session_only
    */
    trait SettingScope extends StObject
    object SettingScope {
      
      inline def incognito_persistent: typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_persistent]
      
      inline def incognito_session_only: typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.incognito_session_only]
      
      inline def regular: typings.webextensionPolyfill.webextensionPolyfillStrings.regular = "regular".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.regular]
      
      inline def regular_only: typings.webextensionPolyfill.webextensionPolyfillStrings.regular_only = "regular_only".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.regular_only]
    }
    
    /**
      * Which setting to change.
      */
    trait SettingSetDetailsType extends StObject {
      
      /**
        * Where to set the setting (default: regular).
        * Optional.
        */
      var scope: js.UndefOr[SettingScope] = js.undefined
      
      /**
        * The value of the setting. <br/>Note that every setting has a specific value type, which is described together with the
        * setting. An extension should <em>not</em> set a value of a different type.
        */
      var value: Any
    }
    object SettingSetDetailsType {
      
      inline def apply(value: Any): SettingSetDetailsType = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SettingSetDetailsType]
      }
      
      extension [Self <: SettingSetDetailsType](x: Self) {
        
        inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type Static = StringDictionary[Any]
  }
}
