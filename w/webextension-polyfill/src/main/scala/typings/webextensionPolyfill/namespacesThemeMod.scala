package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.ThemeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesThemeMod {
  
  object Theme {
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Returns the current theme for the specified window or the last focused window.
        *
        * @param windowId Optional. The window for which we want the theme.
        */
      def getCurrent(): js.Promise[Any] = js.native
      def getCurrent(windowId: Double): js.Promise[Any] = js.native
      
      /**
        * Fired when a new theme has been applied
        *
        * @param updateInfo Details of the theme update
        */
      var onUpdated: Event[js.Function1[/* updateInfo */ ThemeUpdateInfo, Unit]] = js.native
      
      /**
        * Removes the updates made to the theme.
        *
        * @param windowId Optional. The id of the window to reset. No id resets all windows.
        */
      def reset(): js.Promise[Unit] = js.native
      def reset(windowId: Double): js.Promise[Unit] = js.native
      
      /**
        * Make complete updates to the theme. Resolves when the update has completed.
        *
        * @param details The properties of the theme to update.
        */
      def update(details: ThemeType): js.Promise[Unit] = js.native
      /**
        * Make complete updates to the theme. Resolves when the update has completed.
        *
        * @param windowId Optional. The id of the window to update. No id updates all windows.
        * @param details The properties of the theme to update.
        */
      def update(windowId: Double, details: ThemeType): js.Promise[Unit] = js.native
      def update(windowId: Unit, details: ThemeType): js.Promise[Unit] = js.native
    }
    
    /**
      * Info provided in the onUpdated listener.
      */
    trait ThemeUpdateInfo extends StObject {
      
      /**
        * The new theme after update
        */
      var theme: ThemeUpdateInfoThemeType
      
      /**
        * The id of the window the theme has been applied to
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object ThemeUpdateInfo {
      
      inline def apply(theme: ThemeUpdateInfoThemeType): ThemeUpdateInfo = {
        val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
        __obj.asInstanceOf[ThemeUpdateInfo]
      }
      
      extension [Self <: ThemeUpdateInfo](x: Self) {
        
        inline def setTheme(value: ThemeUpdateInfoThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    /**
      * The new theme after update
      */
    type ThemeUpdateInfoThemeType = StringDictionary[Any]
  }
}
