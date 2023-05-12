package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  trait ClearDetails extends StObject {
    
    /** Where to clear the setting (default: regular). */
    var scope: js.UndefOr[SettingScope] = js.undefined
  }
  object ClearDetails {
    
    inline def apply(): ClearDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearDetails] (val x: Self) extends AnyVal {
      
      inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait GetDetails extends StObject {
    
    /**
      * Whether to return the value that applies to the incognito session
      * (default false).
      */
    var incognito: js.UndefOr[Boolean] = js.undefined
  }
  object GetDetails {
    
    inline def apply(): GetDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetDetails] (val x: Self) extends AnyVal {
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  trait GetReturnDetails extends StObject {
    
    /**
      * Whether the effective value is specific to the incognito session.
      * This property will _only_ be present if the `incognito` property in
      * the `details` parameter of `get()` was true.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /** The level of control of the setting. */
    var levelOfControl: LevelOfControl
    
    /** The value of the setting. */
    var value: Any
  }
  object GetReturnDetails {
    
    inline def apply(levelOfControl: LevelOfControl, value: Any): GetReturnDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReturnDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetReturnDetails] (val x: Self) extends AnyVal {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.not_controllable
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_other_extensions
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controllable_by_this_extension
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_this_extension
  */
  trait LevelOfControl extends StObject
  object LevelOfControl {
    
    inline def controllable_by_this_extension: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controllable_by_this_extension]
    
    inline def controlled_by_other_extensions: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_other_extensions]
    
    inline def controlled_by_this_extension: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.controlled_by_this_extension]
    
    inline def not_controllable: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.not_controllable = "not_controllable".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.not_controllable]
  }
  
  trait OnChangeDetails extends StObject {
    
    /**
      * Whether the value that has changed is specific to the incognito
      * session.
      * This property will _only_ be present if the user has enabled the
      * extension in incognito mode.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /** The level of control of the setting. */
    var levelOfControl: LevelOfControl
    
    /** The value of the setting after the change. */
    var value: Any
  }
  object OnChangeDetails {
    
    inline def apply(levelOfControl: LevelOfControl, value: Any): OnChangeDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangeDetails] (val x: Self) extends AnyVal {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: LevelOfControl): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetDetails extends StObject {
    
    /** Where to set the setting (default: regular). */
    var scope: js.UndefOr[SettingScope] = js.undefined
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type, which is described
      * together with the setting. An extension should _not_ set a value of a
      * different type.
      */
    var value: Any
  }
  object SetDetails {
    
    inline def apply(value: Any): SetDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetDetails] (val x: Self) extends AnyVal {
      
      inline def setScope(value: SettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      *
      * @param details Which setting to clear.
      */
    def clear(details: ClearDetails): js.Promise[Unit]
    
    /**
      * Gets the value of a setting.
      *
      * @param details Which setting to consider.
      */
    def get(details: GetDetails): js.Promise[GetReturnDetails]
    
    /** Fired after the setting changes. */
    var onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]]
    
    /**
      * Sets the value of a setting.
      *
      * @param details Which setting to change.
      */
    def set(details: SetDetails): js.Promise[Unit]
  }
  object Setting {
    
    inline def apply(
      clear: ClearDetails => js.Promise[Unit],
      get: GetDetails => js.Promise[GetReturnDetails],
      onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]],
      set: SetDetails => js.Promise[Unit]
    ): Setting = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Setting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Setting] (val x: Self) extends AnyVal {
      
      inline def setClear(value: ClearDetails => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setGet(value: GetDetails => js.Promise[GetReturnDetails]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setSet(value: SetDetails => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular_only
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_persistent
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_session_only
  */
  trait SettingScope extends StObject
  object SettingScope {
    
    inline def incognito_persistent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_persistent]
    
    inline def incognito_session_only: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.incognito_session_only]
    
    inline def regular: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular = "regular".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular]
    
    inline def regular_only: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular_only = "regular_only".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.regular_only]
  }
}
